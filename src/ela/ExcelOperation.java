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

/**
 * @author Lovec
 * @ClassName ExcelOperation
 * @Description 对Excel进行操作
 * @Date 2019/7/19
 * @Update 2019/11/18
 */
public class ExcelOperation {

  /**
   * 用POI工具-->读取Excel文件的内容.
   *
   * @param args args
   * @throws FileNotFoundException FileNotFoundException
   * @throws IOException           IOException
   */
  public static void main(String[] args) throws FileNotFoundException, IOException {
    File xlsFile=new File("excel1.xls");
    boolean exists=xlsFile.exists();
    System.out.println(exists);
    FileInputStream fis=new FileInputStream(xlsFile);
    System.out.println(fis);
    Workbook workbook=new XSSFWorkbook(fis);
    System.out.println(workbook);
    int numberOfSheets=workbook.getNumberOfSheets();
    for(int i=0; i < numberOfSheets; i++) {
      //创建sheet页
      Sheet sheet=workbook.getSheetAt(i);
      int rowNum=sheet.getLastRowNum();
      for(int j=0; j < rowNum; j++) {
        //创建行
        Row row=sheet.getRow(j);
        int lastCellNum=(int) row.getLastCellNum();
        for(int k=0; k < lastCellNum; k++) {
          //创建每一行的每一个格子
          Cell cell=row.getCell(k);
          String stringCellValue=cell.getStringCellValue();
          System.out.print(stringCellValue + " ");
        }
        System.out.println();
      }
    }

    workbook.createSheet();//新建的sheet1
    workbook.createSheet();//新建的sheet2
    workbook.createSheet();//新建的sheet3


  }
}
