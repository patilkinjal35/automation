package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//locator add name and pass
		 WebElement txt_name=driver.findElement(By.id("email"));
		 txt_name.sendKeys("kinjal20@gmail.com");
		 
		 
		
		 WebElement txt_pass=driver.findElement(By.id("pass"));
		 txt_pass.sendKeys("7020769531@V");
		 
		 WebElement button=driver.findElement(By.name("login"));
		 button.click();
		 Thread.sleep(10000);
		 driver.close();
	}

}
