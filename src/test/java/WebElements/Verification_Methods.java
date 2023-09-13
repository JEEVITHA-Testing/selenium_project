package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Methods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement textField = driver.findElement(By.xpath("//input[@id='email']"));
		if (textField.isDisplayed()) {
			textField.sendKeys("sasikala");
		} else {
			System.out.println("Testscript is failed");

		}
		WebElement btn = driver.findElement(By.xpath("//a[@id='u_0_0_yd']"));
		
		if(btn.isEnabled()) {
			btn.submit();
		}
		else {
			System.out.println("Testscript is failed");
		}
		
		
		
		//driver.close();
	}

}
