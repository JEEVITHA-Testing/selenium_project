package TestNG;

import org.testng.annotations.Test;

public class Invocation1 {
	@Test(groups="normal")
	public void test1() {
		System.out.println("Hi test1");

	}

	@Test
	public void test2() {
		System.out.println("Hi test2");

	}

	@Test(groups="normal")
	public void test3() {
		System.out.println("Hi test3");
}
}
