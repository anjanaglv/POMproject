package Mytests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Drivers.Driversclass;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.Newcustomer;

public class Basetest {
	
	
	Loginpage LP;
	Homepage HP;
 	Newcustomer NC;
	Properties prop;
	
	
	@BeforeTest
	void openapp() throws IOException {
		prop=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\Vasantha\\eclipse-workspace\\POMproject\\src\\test\\resources\\config.properties");
		prop.load(file);
		Driversclass.initdrivers(prop.getProperty("URL"));
		LP=new Loginpage(Driversclass.getdriver());
		HP=new Homepage(Driversclass.getdriver()); 
		NC=new Newcustomer(Driversclass.getdriver());
		
	}
	
	@AfterTest
	void closeapp() {
		Driversclass.Teardown();
	}
	
	

}
