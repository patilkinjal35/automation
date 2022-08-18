package TestNg;

import org.testng.annotations.Test;

public class group {

	@Test(groups="sanity")
	public void A() {
		System.out.println("A");
	}
	@Test(groups="regression")
	public void B() {
		System.out.println("B");
	}
	@Test(groups="critical regression")
	public void C() {
		System.out.println("C");
	}
	@Test(groups="regression")
	public void D() {
		System.out.println("D");
	}
}
