package POP_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_SendKeys {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//addrees of upload
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		//uploading through sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Resumes\\Sasi_Resume.pdf");
		Thread.sleep(6000);
		driver.quit();
		

	}

}
