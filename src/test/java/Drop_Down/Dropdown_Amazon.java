package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Amazon {

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
		// addrees of thdropdown
		WebElement drop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		// create an object for select class
		Select s = new Select(drop);
		// selecting the values through index
		s.selectByIndex(7);
		Thread.sleep(2000);
		// select by value
		s.selectByValue("search-alias=automotive");
		// select by visible text
		s.selectByVisibleText("Books");
		if (s.isMultiple()) {
			System.out.println("THis is multidropdown");
		} else {
			System.out.println("THis is single dropdown");
		}
		// print all the option which are in dropdown
		List<WebElement> allOption = s.getOptions();
		for (WebElement b : allOption) {
			System.out.println(b.getText());
		}

	}

}
