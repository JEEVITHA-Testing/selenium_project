package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*WebElement sign = driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		Actions a=new Actions (driver);
		a.moveToElement(sign).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();*/
		Thread.sleep(5000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='navBarCell1Rev']")).click();
		driver.switchTo().defaultContent();
	}
	}


