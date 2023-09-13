package Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

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
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		//WebElement drop = driver.findElement(By.xpath("//select[@class='select select-initialized']"));
		WebElement drop = driver.findElement(By.xpath("//div[@style='width: 22rem;'][1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",drop);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();",drop);
		
		//WebElement values = driver.findElement(By.xpath("//div[@style='width: 22rem;'][1]//select"));
		//Thread.sleep(5000);
		//values.getSize();
		
		//drop.click();
		
		
		
		//Select s = new Select(drop);
		//s.selectByIndex(1);

	}

}
