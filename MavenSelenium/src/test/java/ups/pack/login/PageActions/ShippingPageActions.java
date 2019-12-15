package ups.pack.login.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ups.pack.login.pageElements.LoginPageElements;
import ups.pack.login.pageElements.ShippingPageElements;

public class ShippingPageActions {

	
	 ShippingPageElements ShippingPageElement;

	public ShippingPageActions(WebDriver driver) {
		ShippingPageElement= new ShippingPageElements(driver);
	}
     
	public void shippingLink() {
		ShippingPageElement.shipping().click();
	}

	public void createShippingLink() {
		ShippingPageElement.createShipment().click();
	}
	
	public void countryTerritory () {
	    ShippingPageElement.countryTerritory().selectByVisibleText("Germany");
	} 
	
	public void orgName () {
		ShippingPageElement.orgName().sendKeys("Intex");
	}
	public void contactName () {
		ShippingPageElement.contactName().sendKeys("Nibras");
	}
	public void addStreet() {
		ShippingPageElement.addStreet().sendKeys("65-58 Maurice ave");
	}
	public void addApt() {
		ShippingPageElement.addApt().sendKeys("1st fl");
	}
	public void addDept() {
		ShippingPageElement.addDept().sendKeys("SQA");
	}
	public void zipCode() {
		ShippingPageElement.zipCode().sendKeys("11377");
	}
	public  void city() {
		ShippingPageElement.city().sendKeys("Queens");
	
	}
	
	public void state() {
	ShippingPageElement.state().selectByVisibleText("NewYork");
	
	}
	
	public void residentialAdd () {
		ShippingPageElement.restAdd().sendKeys("123");
	}
	public void phone() {
		ShippingPageElement.phone().sendKeys("7188430067");
	}
	
		public void extension() {
		ShippingPageElement.extension().sendKeys("123");
	}
	    public void chkBox() {
		ShippingPageElement.chkBox().click();
	}
	    public void toggleBtn() {
		ShippingPageElement.toggleBtn().click();
	}
	    public void cancelShipment() {
		ShippingPageElement.cancelShipment().click();
	}
	    public void yesBtn() {
			ShippingPageElement.yesBtn().click();
		}
		
}
