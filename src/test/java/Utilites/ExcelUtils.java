package Utilites;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
    /**
     * openExeclFile("testData","Sheet1")-> no return
     *
     */
    private static Sheet sheet;
    private static Workbook workbook;
    private static FileInputStream fileInputStream;
    private static FileOutputStream outputStream;
    private static String path;


    public static void openExeclFile(String Filename, String sheetName){
          path = System.getProperty("user.dir")+"/src/test/resources/TestData/Test Data.xlsx";
        try{
            fileInputStream= new FileInputStream(path);
            workbook = new XSSFWorkbook(fileInputStream);
            sheet=workbook.getSheet(sheetName);

        } catch (FileNotFoundException e) {
            System.out.println("excel spreedsheet path is invaild:"+path);
        } catch (IOException e) {
            System.out.println("couldnt open execl");
        }
    }



}
