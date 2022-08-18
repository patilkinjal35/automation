package TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class task {
	WebDriver driver;
	@Test
	@BeforeMethod
	public void amazon()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void main() throws Exception
	{	//search on mobile
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile");
		//click on mobile
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//click on mobile website
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		//screenshort
		String path="C:\\Users\\admin\\eclipse-program\\automation\\screenshot";
		String rm=RandomString.make(1);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, dest);
		
		WebElement name=driver.findElement(By.xpath("//span[text()='Great Deals on Samsung Galaxy M Series']"));
		String actual=name.getText();
		
		String expected="Great Deals on Samsung Galaxy M Series";
		Assert.assertEquals(actual, expected);
		System.out.println("Test Completed");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		//js.executeScript("window.scrollBy(0,-500)", "");
	}
	
	public static void scrollbar(WebDriver driver) {
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
