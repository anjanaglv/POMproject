package Mytests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Pages.Homepage;
import Pages.Loginpage;

//anjana //sweety
@Listeners(Reports.Extentreportsmanager.class)

public class Gurutest extends Basetest{
	
	@Test(priority=1)
	void login() {
		LP.Login(prop.getProperty("ID"),prop.getProperty("PS"));
		LP.clicksubmit();	
	}
	@Test(priority=2)
	void selectnewcustomer()  {
		HP.selectnew_Customer();
		NC.Newwcustomer(prop.getProperty("Customername"),prop.getProperty("DOB"));
	}
	@Test(priority=3)
	void editcustomer() {
		HP.selectedit_Customer();
	}
	@Test(priority=4)
	void deletecustomer() throws InterruptedException {
		HP.selectdelete_Customer();
		Thread.sleep(4000);
	}
	
	
	
}
	
	
	
	
	


