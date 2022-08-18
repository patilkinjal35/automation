package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_path {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		//by using  xpath 
		WebElement txt_name=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		txt_name.sendKeys("patilvarun2727@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pass.sendKeys("7020769531@25");
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		button.click();
		Thread.sleep(5000);
		
		driver.close();
		Thread.sleep(10000);
		}

}
