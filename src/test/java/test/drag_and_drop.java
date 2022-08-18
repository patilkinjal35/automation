package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_and_drop {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement amount=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(src, amount).build().perform();
		//Thread.sleep(4000);
		
		Actions act1=new Actions(driver);
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement amount1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act1.dragAndDrop(src1, amount1).build().perform();
		//Thread.sleep(4000);
		
		Actions act2=new Actions(driver);
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement amount2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act2.dragAndDrop(src2, amount2).build().perform();
		//Thread.sleep(4000);
		
		Actions act3=new Actions(driver);
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		WebElement amount3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act3.dragAndDrop(src3, amount3).build().perform();
	}

}
