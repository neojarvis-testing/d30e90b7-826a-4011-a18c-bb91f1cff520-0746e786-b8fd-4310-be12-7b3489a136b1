package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
    
    public static String readExcelData(String path,String sheet,int row,int cell){
        try{
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            return workbook.getSheet(sheet).getRow(row).getCell(cell).toString();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}

