package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_8_2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//keyboard by name print email
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(email,Keys.SHIFT).sendKeys("kinjal"). keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//keyboard by name print password
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//keyboard by name print login button
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement forgotten_pass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotten_pass.click();
		
	}

}
