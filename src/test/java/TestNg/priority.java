package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=-1,invocationCount=2)
	public void A() {
		System.out.println("Test A");
		Assert.assertTrue(false);
	}
	@Test(priority=1,enabled=false)
	public void C() {
		System.out.println("Test C");
	}
	@Test(priority=0,invocationCount=3)
	public void B() {
		System.out.println("Test B");
	}
		@Test(dependsOnMethods="A")
		public void D()
		{
			System.out.println("Test D");
		}

}
