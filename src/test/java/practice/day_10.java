package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_10 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		//email.sendKeys("kinjal");
		
		String path="C:\\Users\\admin\\eclipse-program\\automation\\testdata\\kinjal.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String data=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		email.sendKeys(data);
		
		String data_1=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		pass.sendKeys(data_1);
		System.out.println(data_1);
	
	}

}
