package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll{
	@Test
	public void scrollbar() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//scroll by pixel
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
		//scroll by Web element
		WebElement marathi=driver.findElement(By.xpath("//a[text()='मराठी']"));
		js.executeScript("arguments[0].scrollIntoView()", marathi);
		
		Thread.sleep(3000);
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		custom_handleByscroll(driver,english);
		
	}
	
	public static void custom_handleByscroll(WebDriver driver ,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
}
