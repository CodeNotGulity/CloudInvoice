package Utilites;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExeclTest {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Test Data.xlsx";
        try {
            FileInputStream input = new FileInputStream(path);
            Workbook workbook= new XSSFWorkbook(input);
            Sheet sheet1= workbook.getSheet("Sheet1");
            String firstName= sheet1.getRow(1).getCell(0).toString();
            System.out.println(firstName);
            sheet1.createRow(2).createCell(0).setCellValue("patel");
            sheet1.createRow(2).createCell(1).setCellValue("harsh");
            sheet1.createRow(2).createCell(2).setCellValue("patel@gmail.com");
            sheet1.createRow(2).createCell(3).setCellValue("123, chicago illinos ");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
