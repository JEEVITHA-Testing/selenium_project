package Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_Group_Index {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("phone");
	
		
		Thread.sleep(5000);
		List<WebElement> value = driver.findElements(By.xpath("//li[@data-view-type='1'][4]"));

	for(WebElement b:value) {
		System.out.println(b.getText());
		
	}
	
	
	driver.close();
	
	
	}

}
