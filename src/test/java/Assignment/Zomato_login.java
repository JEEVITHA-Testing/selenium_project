package Assignment;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Zomato_login {
	public static void main(String[] args) throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("14567891");
	driver.findElement(By.partialLinkText("Send One Time Password")).click();
	driver.close();
}
}
