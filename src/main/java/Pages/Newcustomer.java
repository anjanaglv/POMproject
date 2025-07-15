package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newcustomer extends Basepage {
	 WebDriver driver;
	
	public Newcustomer (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//locators
	By customername=By.name("name");
	By female=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
	By dob=By.name("dob");
	
	 public void Newwcustomer(String name,String dofb)  {
		 
		sendkeys(customername, name);
		click(female);
		sendkeys(dob, dofb);
		
		
	}
	
	

}
