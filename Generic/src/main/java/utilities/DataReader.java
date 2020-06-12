package utilities;

import commonAPI.WebAPI;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader extends WebAPI {
    HSSFWorkbook wb = null;
    HSSFSheet sheet = null;
    Cell cell = null;
    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;

    public String[][] fileReader1(String path,int sheetIndex) throws IOException {
        String[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        wb = new HSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numberOfCol + 1];

        for (int i = 1; i < data.length; i++) {
            HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                HSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i][j] = cellData;
            }
        }
        return data;
    }

    public String[] fileReader2(String path, int sheetIndex) throws IOException {
        String[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        wb = new HSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for (int i = 1; i < data.length; i++) {
            HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numberOfCol; j++) {
                HSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i] = cellData;
            }
        }
        return data;
    }



    public String getCellValue(HSSFCell cell) {
        Object value = null;

        int dataType = cell.getCellType();
        switch (dataType) {
            case HSSFCell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }

    public void writeBack(String value) throws IOException {
        wb = new HSSFWorkbook();
        sheet = wb.createSheet();
        Row row = sheet.createRow(rowNum);
        row.setHeightInPoints(10);

        fio = new FileOutputStream(new File("ExcelFile.xls"));
        wb.write(fio);
        for (int i = 0; i < row.getLastCellNum(); i++) {
            row.createCell(i);
            cell.setCellValue(value);
        }
        fio.close();
        wb.close();
    }



    private ArrayList<String> getList(By by) {
        List<WebElement> list = driver.findElements(by);
        System.out.println(list.size());
        ArrayList<String> linkList = new ArrayList<String>();
        for (int i = 0; i <= list.size() - 1; i++) {
            linkList.add(list.get(i).getText());
            System.out.println(list.get(i).getText() + " Added to linkList Array");
        }
        return linkList;
    }


//    public boolean checkListMatchesExcel(String sheetName, By by) {
//        ArrayList<String> leftLinks = getList(by);
//        excel.getData(sheetName);
//        int falseResult = 0;
//        Boolean result = null;
//
//        // outerloop:
//        for (int row = 0; row < excel.getData(sheetName).length; row++) {
//
//            for (int col = 0; col < excel.getData(sheetName)[row].length; col++) {
//
//                if (excel.getData(sheetName)[row][col].toString().equals(leftLinks.get(row))) {
//                    System.out.println(excel.getData(sheetName)[row][col].toString() + " from excel sheet is equal to " + leftLinks.get(row).toString());
//                    log.debug(excel.getData(sheetName)[row][col].toString() + " from excel sheet is equal to " + leftLinks.get(row).toString());
//                    result = true;
//
//                } else if (!excel.getData(sheetName)[row][col].toString().equals(leftLinks.get(row))) {
//                    System.out.println(excel.getData(sheetName)[row][col].toString() + " from excel sheet is NOT equal to " + leftLinks.get(row).toString());
//                    log.debug(excel.getData(sheetName)[row][col].toString() + " from excel sheet is NOT equal to " + leftLinks.get(row).toString());
//                    falseResult++;
//                    //break outerloop;
//                }
//            }
//
//        }
//        if(falseResult>0){
//            result = false;
//        }
//        return result;
//    }
}
