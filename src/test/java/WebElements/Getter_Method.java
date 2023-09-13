package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		 WebElement textField = driver.findElement(By.xpath("//input[@id='email']"));
		Point loc = textField.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getX());
		Dimension size = textField.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

	}

}
