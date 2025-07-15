package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepage {

	WebDriver driver;

	public Basepage(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void sendkeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public void forcesleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public void refresh() {
		driver.navigate().refresh();
	}

}
