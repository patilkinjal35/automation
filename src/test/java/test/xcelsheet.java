package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelsheet {
	
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\admin\\eclipse-program\\automation\\testdata\\kinjal.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);	
	
	String data_1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data_1);
	
	String data_2=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(data_2);
	
	
	
	}
}
