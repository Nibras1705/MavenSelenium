package ups.pack.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ups.pack.baseDriver.BaseDriverClass;
import ups.pack.login.PageActions.LoginPageActions;
import ups.pack.login.PageActions.ShippingPageActions;

public class UpsShippingTest extends BaseDriverClass  {

   WebDriver driver= getChromeDriver();
   ShippingPageActions ShipAction = new ShippingPageActions(driver);

   @BeforeTest
	public void beforeMethod() {
		driver.get(
				"https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
	}
   @Test
	public void shippingTest() {
		ShipAction.shippingLink();
		ShipAction.createShippingLink();
		ShipAction.countryTerritory();
		ShipAction.orgName();
		ShipAction.contactName();
		ShipAction.addStreet();
		ShipAction.addApt();
		ShipAction.addDept();
		ShipAction.zipCode();
		ShipAction.city();
		ShipAction.residentialAdd();
		ShipAction.state();
		ShipAction.phone();
		ShipAction.extension();
		ShipAction.chkBox();
		ShipAction.toggleBtn();
		ShipAction.cancelShipment();
		ShipAction.yesBtn();
	
		

		WebElement submitMsg = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div[8]/app/ng-component/div/div/div/div/ng-component/section/h2"));
		String msg = submitMsg.getText();
		System.out.println();
		System.out.println(msg);

		if (msg.contains("Hello. Where are you shipping from?")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
   }
  
		@AfterTest
		public void afterTest() {
			driver.close();
		}
   }
   
	