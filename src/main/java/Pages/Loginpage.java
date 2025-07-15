package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

public class Loginpage extends Basepage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// locators - name Id Xpath linktext partiallinktext

	By username = By.name("uid");
	By Password = By.name("password");
	By submit = By.name("btnLogin");

	// Methods and Actions

	public void Login(String id, String pwd) {
		sendkeys(username, id);
		sendkeys(Password, pwd);

	}

	public void clicksubmit() {
		click(submit);
	}

}
