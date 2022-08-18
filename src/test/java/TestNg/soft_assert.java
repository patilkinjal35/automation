package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	
	@Test
	public void test() {
		System.out.println("first name");
		System.out.println("last name");
		System.out.println("mobile number");
		
		String actual="Facebook Application";
		String expected="facebook application";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("Done");
		
	}
	@Test
	public void test_1() {
		System.out.println("first name");
		System.out.println("last name");
		System.out.println("mobile number");
		
		String actual="Facebook Application";
		String expected="facebook application";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("Done application");
		soft.assertAll();
		
	}
}
