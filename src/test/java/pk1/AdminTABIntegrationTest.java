package pk1;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AccessManagementPO;
import pageobject.AdminTabIntegrationPO;
import pageobject.LandingPage;


public class AdminTABIntegrationTest extends AdminTabIntegrationPO {
	
public AdminTABIntegrationTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
@Given("user is Login page of CE prior to Admin Integrations") 
public void mygivenlogin() throws Throwable 
{
	System.out.println("inside given login page");
	
}

@Then("navigate to Admin Integrations and Verify All Tab Loads") 
public void adminintegrationtab() throws Throwable 
{
	System.out.println("inside accessmgmntuserprovision");
	 navigatetoadminintegration();
	verifyadmintab();
}
 
@Then("navigate to the Direct Integrations tab search for Zoom and connect providing credentials and verifying success") 
public void adminintegrationzoomconnect() throws Throwable 
{
	System.out.println("inside accessmgmntuserprovision");
	 navigatetoadminintegration();
	zoomconnect();
}
@Then("uservoice connect{string}{string} and verifying success") 
public void adminintegrationuservoiceconnect(String accesstoken,String subdomain) throws Throwable 
{
	System.out.println("inside accessmgmntuserprovision");
	 navigatetoadminintegration();
	uservoiceconnect(accesstoken,subdomain);
}
	
}
