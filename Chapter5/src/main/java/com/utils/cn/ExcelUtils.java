package com.utils.cn;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelUtils {
    @Test
    public void excelRead(File file) throws IOException {
        FileInputStream inputStream =new FileInputStream(file);
        XSSFWorkbook wb =new XSSFWorkbook(inputStream);
        Sheet sheet =wb.getSheet("Sheet1");
        int firstRow = sheet.getFirstRowNum()+1;
        int lastRow =sheet.getLastRowNum();
        for(int i=firstRow;i<=lastRow;i++){
            Row row = sheet.getRow(i);
            int firstCol = row.getFirstCellNum()+1;
            int lastCol = row.getLastCellNum();
            StringBuilder url = new StringBuilder();
            for(int j=firstCol;j<lastCol;j++){
                Cell cell= row.getCell(j);
                url.append(cell);
            }
            System.out.println(url);
        }
    }
}
