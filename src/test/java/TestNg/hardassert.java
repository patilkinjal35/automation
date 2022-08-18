package TestNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	
	@Test
	public void test()
	{
		System.out.println("email");
		System.out.println("password");
		System.out.println("login button click");
		
		String actual="Kinjal Patil";
		String expected="kinjal patil";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Test completed");
	}
	
	@Test
	public void test1() {
		System.out.println("email");
		System.out.println("password");
		System.out.println("login button click");
		
		String actual="kinjal";
		String expected="kinjal";
		Assert.assertEquals(actual, expected);
		System.out.println("Test1 done");
	}

}
