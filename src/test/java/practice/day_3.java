package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_3
{
	public static void main(String arg[]) throws Exception 
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9299648%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMImPWy2d-i-QIVDraWCh0XcAkPEAAYASAAEgJgofD_BwE");
		driver.manage().window().maximize();
		String title1=driver.getTitle();
		System.out.println(title1);
		//by using relative path ----> double slash /
		//xpath by attribute
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstname']"));
		first_name.sendKeys("kinjal");
		// xpath by attribute
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastname']"));
		last_name.sendKeys("patil");
		WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("patilkinjal35@gmail.com");
		WebElement email_m=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		email_m.sendKeys("patilkinjal35@gmail.com");
		WebElement new_pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		new_pass.sendKeys("kinjal@1120");
		Thread.sleep(2000);
		
		//xpath by index
		WebElement txt_day=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		txt_day.sendKeys("20");
		txt_day.click();
		Thread.sleep(4000);
		
		WebElement txt_month=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		txt_month.sendKeys("dec");
		txt_month.click();
		Thread.sleep(4000);
		
		WebElement txt_year=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		txt_year.sendKeys("1995");
		txt_year.click();
		Thread.sleep(4000);
		
		//xpath by text
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		WebElement button=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		button.click();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kinjalpatil35@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("kinjal@1120");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
		driver.close();
	}
}