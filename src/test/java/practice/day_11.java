package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_11 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\admin\\eclipse-program\\automation\\testdata\\kinjal.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='firstName']"));
		String data=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		fn.sendKeys(data);
		System.out.println(data);
		
		WebElement ln=driver.findElement(By.xpath("//input[@name='lastName']"));
		String data_1=wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		ln.sendKeys(data_1);
		System.out.println(data_1);
		
		WebElement mobile=driver.findElement(By.xpath("//input[@name='phone']"));
		String data_2=wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		mobile.sendKeys(data_2);
		System.out.println(data_2);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		String data_3=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		email.sendKeys(data_3);
		System.out.println(data_3);

		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		String data_4=wb.getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		address.sendKeys(data_4);
		System.out.println(data_4);
		
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		String data_5=wb.getSheet("Sheet1").getRow(2).getCell(4).getStringCellValue();
		city.sendKeys(data_5);
		System.out.println(data_5);
		
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		String data_6=wb.getSheet("Sheet1").getRow(2).getCell(5).getStringCellValue();
		state.sendKeys(data_6);
		System.out.println(data_6);
		
		WebElement code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		String data_7=wb.getSheet("Sheet1").getRow(2).getCell(6).getStringCellValue();
		code.sendKeys(data_7);
		System.out.println(data_7);
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(country);
		sel.selectByValue("INDIA");
		String data_11=wb.getSheet("Sheet1").getRow(2).getCell(7).getStringCellValue();
		System.out.println(data_11);
		
		WebElement email1=driver.findElement(By.xpath("//input[@name='email']"));
		String data_8=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		email1.sendKeys(data_8);
		System.out.println(data_8);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		String data_9=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		pass.sendKeys(data_9);
		System.out.println(data_9);
		
		WebElement confirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		String data_10=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		confirmpass.sendKeys(data_10);
		System.out.println(data_10);
		
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
		button.click();
		
		WebElement sign_in=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
		sign_in.click();
		
		System.out.println("login successfully");
		
		WebElement data3=driver.findElement(By.xpath("//input[@name='userName']"));
		String data_12=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		data3.sendKeys(data_12);
		System.out.println(data_12);
		
		WebElement pass2=driver.findElement(By.xpath("//input[@type='password']"));
		String data_13=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		pass2.sendKeys(data_13);
		System.out.println(data_13);
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
	
	}

}
