package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement> values = driver.findElements(By.className(
				"sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 AdHolder sg-col s-widget-spacing-small sg-col-12-of-16"));

		for (WebElement b : values) {
			System.out.println(b.getText());
		}
	
		Thread.sleep(5000);
		driver.close();

	}

}
