package TestNG;

import org.testng.annotations.Test;

public class Invocation {

	 
		@Test
		public void test1() {
			System.out.println("Hello test1");

		}

		@Test(groups="normal")
		public void test2() {
			System.out.println("Hello test2");

		}

		@Test
		public void test3() {
			System.out.println("Hello test3");

	
		}
}
