package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login {
     //Declaration
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTb;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTb;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement longinBtn;

	// getter and setter method
	public WebElement getEmailTb() {
		return emailTb;
	}

	public void setEmailTb(WebElement emailTb) {
		this.emailTb = emailTb;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public void setPasswordTb(WebElement passwordTb) {
		this.passwordTb = passwordTb;
	}

	public WebElement getLonginBtn() {
		return longinBtn;
	}

	public void setLonginBtn(WebElement longinBtn) {
		this.longinBtn = longinBtn;
	}

	// initialization
	public Fb_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void emailTextField(String data) {
		emailTb.sendKeys(data);
	}

	public void passwordTextField(String data) {
		passwordTb.sendKeys(data);
	}

	public void loginButton() {
		longinBtn.click();
	}

}
