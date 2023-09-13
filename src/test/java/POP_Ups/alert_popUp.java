package POP_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_popUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		// mouse overing on course
		WebElement course = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();

		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();

		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	

		Alert pop = driver.switchTo().alert();
		System.out.println(pop.getText());

		pop.accept();
		// pop.dismiss();

	}

}
