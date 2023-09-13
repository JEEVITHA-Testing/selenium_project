package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// open amazon and type computer and clear the data
public class Actions_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement textField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		textField.sendKeys("computers");
		Thread.sleep(5000);

		textField.clear();

		Thread.sleep(5000);

		driver.close();

	}

}
