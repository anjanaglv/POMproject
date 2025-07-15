package Drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversclass {

	private static WebDriver driver;

	public static void initdrivers(String link) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(link);
	}

	public static WebDriver getdriver() {
		return driver;
	}

	public static void Teardown() {
		driver.close();

	}

}
