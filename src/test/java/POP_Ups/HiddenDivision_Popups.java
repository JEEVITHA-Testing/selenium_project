package POP_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivision_Popups {

	public static void main(String[] args) throws Throwable {

		// take care of driver executables
		WebDriverManager.chromedriver().setup();
		// opens empty browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//text[text()='Date']")).click();

		//selecting date from calender
		driver.findElement(By.xpath("//div[text()='Jul']/../../../..//span[text()='26']")).click();
	
		Thread.sleep(2000);
		
	}

}