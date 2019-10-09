package ela;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excel {

    /**
     * 鐩存帴鎵撳嵃浜嗚幏鍙栫殑鍒版暟鎹紝鍙互鍒涘缓闆嗗悎灏嗘暟鎹斁杩涘幓
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File xlsFile = new File("excel1.xls");
        boolean exists = xlsFile.exists();
        System.out.println(exists);
        FileInputStream fis = new FileInputStream(xlsFile);
        System.out.println(fis);
        Workbook workbook = new XSSFWorkbook(fis);//鑾峰彇.xlsx鏍煎紡鐨勬枃浠�
        //Workbook workbook = new HSSFWorkbook(fis); //鑾峰彇.xls鏍煎紡鐨勬枃浠�
        System.out.println(workbook);
        int numberOfSheets = workbook.getNumberOfSheets();
        for (int i=0;i<numberOfSheets;i++){
            System.out.println("------------绗�"+(i+1)+"涓猻heet椤�--------------");
            Sheet sheet = workbook.getSheetAt(i);
            int rowNum = sheet.getLastRowNum();
            for (int j = 0; j < rowNum; j++) {
                System.out.println("------------绗�"+(j+1)+"鎺�--------------");
                Row row = sheet.getRow(j);
                int lastCellNum = (int )row.getLastCellNum();
                for (int k = 0; k < lastCellNum; k++) {
                    Cell cell = row.getCell(k);
                    String stringCellValue = cell.getStringCellValue();
                    System.out.print(stringCellValue+" ");
                }
                System.out.println();
            }
        }

        Sheet sheet1=workbook.createSheet();
        Sheet sheet2=workbook.createSheet();
        Sheet sheet3=workbook.createSheet();




    }
}
