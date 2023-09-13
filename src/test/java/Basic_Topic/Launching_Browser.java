package Basic_Topic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
		
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.zomato.com/");
Thread.sleep(7000);
String title = driver.getTitle();
String url = driver.getCurrentUrl();
System.out.println(title);
System.out.println(url);
driver.close();
	}

}
