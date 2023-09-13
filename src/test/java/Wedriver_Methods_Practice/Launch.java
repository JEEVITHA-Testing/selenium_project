package Wedriver_Methods_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		
		//ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		//FirefoxDriver driver= new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		


	}

}
