package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framd_Id {

	public static void main(String[] args) throws Throwable {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disabled-notifications");

		// take care of driver executables
		WebDriverManager.chromedriver().setup();
		// opens empty browser
		WebDriver driver = new ChromeDriver(option);
		// maximizes the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enters the url
		driver.get("https://www.snapdeal.com/");
		WebElement sign = driver
				.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));

		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();

		driver.findElement(By.xpath("//a[text()='login']")).click();

		// shifting the control to frame id value
		driver.switchTo().frame("loginIframe");
Thread.sleep(5000);
		// performing action on frame
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("123456");
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		// to come out of this frame
		driver.switchTo().defaultContent();
		// performing action on normal webpage
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("1234");

	}

}
