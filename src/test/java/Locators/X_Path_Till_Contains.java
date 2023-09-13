package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_Till_Contains {
	public static void main (String[]args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//WebDriverWait wait=new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOf());
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sasi");
	driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("kala");
driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
//wait.until(ExpectedConditions.elementToBeClickable(c).
driver.close();
}
}
