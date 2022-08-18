package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class day_9 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kinjal@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345678");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		String rm=RandomString.make(4);
		String path="C:\\Users\\admin\\eclipse-program\\automation\\screenshot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, dest);
		
	}

}
