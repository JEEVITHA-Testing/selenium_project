package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_1 {

	public static void main(String[] args) throws Throwable {
		// take care of driver executables
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
	//x and y coordinates
	Point points = career.getLocation();
	int x = points.getX();
	int y = points.getY();
	//downcasting
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(4000);
	//click action on career
	career.click();
	Thread.sleep(4000);
	driver.close();
	
	
	
	
	
	}

}
