package ups.pack.login.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPageElements {
	
	WebDriver driver;

	public ShippingPageElements(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement shipping() {
		WebElement shipping = driver.findElement(By.xpath("//*[@id=\"ups-menuLinks1\"]"));
		return shipping;
	}
	public WebElement createShipment() {
		WebElement createShipment = driver.findElement(By.xpath("//*[@id=\"ups-menuPanel1\"]/div[1]/div[1]/ul/li[1]/a"));
		return createShipment;
	}
	public Select countryTerritory() {
		Select counTerri = new  Select(driver.findElement(By.name("countryDropdown"))); 
		return  counTerri ;
		
		//counTeri.selectByVisibleText("United States");
	
	}
	public WebElement orgName() {
		WebElement orgName = driver.findElement(By.name ("organization"));
		return orgName ;
	}
	public WebElement contactName() {
		WebElement contactName = driver.findElement(By.xpath("//*[@id=\"origincontactName\"]"));
		return contactName;
	}
	public WebElement addStreet() {
		WebElement addStreet = driver.findElement(By.xpath("//*[@id=\"originaddress1Label\"]"));
		return addStreet ;
    }
	public WebElement  addApt() {
		WebElement addApt = driver.findElement(By.xpath("//*[@id=\"originaddress2\"]"));
		return addApt ;
	}
	public WebElement addDept() {
		WebElement addDept = driver.findElement(By.xpath("//*[@id=\"originaddress3\"]"));
		return addDept;
	}
		public WebElement zipCode() {
		WebElement zipCode= driver.findElement(By.xpath("//*[@id=\"originpostal\"]"));   
		return zipCode ;
    }
	public WebElement city () {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"origincityLabel\"]"));
		return city ;
	}
	
	public WebElement restAdd () {
		WebElement residentialAdd = driver.findElement(By.xpath("//*[@id=\"originisResidentialLabel\"]/span/span"));
		return residentialAdd ;
	}
	public Select state  () {
		Select state = new Select(driver.findElement(By.name("stateDropdown"))); 
		return  state ;
	}
	public WebElement email  () {
		   WebElement email = driver.findElement(By.xpath("//*[@id=\"originemail\"]"));
		return email ;
	}
	public WebElement phone  () {
		   WebElement phone = driver.findElement(By.name("//*[@id=\"originphone\"]"));
		return phone ;
	}
	
	public WebElement extension () {
		   WebElement extension = driver.findElement(By.name("//*[@id=\"originextension\"]"));
		return extension ;
	}
	public WebElement chkBox () {
	       WebElement chkBox = driver.findElement(By.className("ups-checkbox-custom-label"));
	       return chkBox;
	    }
	     
	 public WebElement toggleBtn () {
	        WebElement toggleBtn = driver.findElement(By.className("ups-lever_switch_bg"));
			return  toggleBtn ;
		    }
	 public WebElement cancelShipment () {
		    WebElement cancelShipment = driver.findElement(By.xpath("//*[@id=\"nbsBackForwardNavigationCancelShipmentButton\"]"));
		    return cancelShipment ;
	    }
		
	        
	 public WebElement yesBtn () {
		    WebElement yesBtn = driver.findElement(By.xpath("//*[@id=\"nbsCancelShipmentWarningYes\"]"));
		    return yesBtn ;
	    }
}
	 