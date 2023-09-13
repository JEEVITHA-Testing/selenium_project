package Wedriver_Methods_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSource {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());

	}

}
