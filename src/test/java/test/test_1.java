package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		String a=driver.getTitle();
		System.out.println(a);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.youtube.com/account");
		Thread.sleep(6000);
		
		driver.navigate().back();
		Thread.sleep(6000);
		
		driver.navigate().forward();
		Thread.sleep(6000);
		
		
		
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		driver.close();
		
	}

}
