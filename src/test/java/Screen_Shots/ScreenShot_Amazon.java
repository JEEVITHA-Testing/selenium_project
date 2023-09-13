package Screen_Shots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Amazon {

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
				driver.get("https://www.amazon.in/");
				
				
				//Typcasting
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				//we access the method and store it in RAM
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				//i have specify the location
				File dest = new File("./Screen-Shots/amazon.png");
				
				//copy paste from RAM to required location
				FileUtils.copyFile(src, dest);
				
				
				driver.close();
	}

}
