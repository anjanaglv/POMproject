package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Basepage {
	
	
	WebDriver driver;
	
	public Homepage (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//locators - name Id Xpath linktext partiallinktext
	
	By Newcustomer=By.linkText("New Customer");
	By Editcustomer=By.linkText("Edit Customer");
	By Deletecustomer=By.linkText("Delete Customer");
	 
	
	//Methods and Actions
	
	public void selectnew_Customer() {
		click(Newcustomer);
		refresh();
		click(Newcustomer);
		
		
	}
	
	public void selectedit_Customer() {
		click(Editcustomer);
	}
	
	public void selectdelete_Customer() throws InterruptedException {
		click(Deletecustomer);
		forcesleep(3000);  
	}
     
	
}
