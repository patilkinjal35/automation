package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_8 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement btn_desti=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(btn_src, btn_desti).build().perform();
		Thread.sleep(3000);
		
		Actions act1=new Actions(driver);
		WebElement btn_src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement btn_desti1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act1.dragAndDrop(btn_src1, btn_desti1).build().perform();
		Thread.sleep(5000);
		
		Actions act2=new Actions(driver);
		WebElement btn_src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement btn_desti3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act2.dragAndDrop(btn_src3, btn_desti3).build().perform();
		Thread.sleep(5000);
		
		Actions act3=new Actions(driver);
		WebElement btn_src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[7]"));
		WebElement btn_desti4=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act3.dragAndDrop(btn_src4, btn_desti4).build().perform();
		Thread.sleep(5000);
	}

}
