package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_value {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement sign = driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		Actions a=new Actions (driver);
		a.moveToElement(sign).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("loginIframe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id=\'inputValEnter\']")).sendKeys("1234");
			
	}

}
