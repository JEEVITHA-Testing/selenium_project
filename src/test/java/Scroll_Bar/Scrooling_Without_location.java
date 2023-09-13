package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrooling_Without_location {

	public static void main(String[] args) throws InterruptedException {
		 //take care of driver executables
			WebDriverManager.chromedriver().setup();
			// opens empty browser
			WebDriver driver = new ChromeDriver();
			// maximizes the browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// enters the url
			driver.get("https://demoapp.skillrary.com/");
		//address of career
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		
		//downcasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",career);
		Thread.sleep(4000);
		//click action on career
		career.click();
		Thread.sleep(4000);
		driver.close();
	}

}
