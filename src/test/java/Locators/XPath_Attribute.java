package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Attribute {

	public static void main(String[] args) {
		// manages the chrome driver
				WebDriverManager.chromedriver().setup();
				// launche the chrome browser
				WebDriver driver = new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				//opens the application
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("manager");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				if(driver.getTitle().contains("Facebook – log in or sign up")) {
					System.out.println("Script pass");
				}
				else {
					System.out.println("Script Fail");
				}

	}

}
