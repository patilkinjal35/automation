package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(name,Keys.SHIFT).sendKeys("patilkinjal").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}

}
