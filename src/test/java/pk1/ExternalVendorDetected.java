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
import pageobject.ExternalData;
import pageobject.LandingPage;


public class ExternalVendorDetected extends ExternalData {
public ExternalVendorDetected() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Given("user is Login page prior to confirming vendor") 
	public void mygivenlogin() throws Throwable 
	{
		System.out.println("inside given login page");
		
	}
	
	@When("user navigate to External Data Vender Detected and New Vendor") 
	public void mywhencredentials() throws Throwable 
	{
		System.out.println("navigate to vendor"); 
		navigatetoexternal_vendor();
		 
	}

	
	
	@Then("user confirm new vendor {string}")
	public void confirmvendor(String vendor) throws InterruptedException
	{
		vendordetectedconfirm(vendor);
}
	@Then("user reject new vendor {string}")
	public void rejecvendor(String vendor) throws InterruptedException
	{
		singlevendor_reject(vendor);
}
	@Then("user revert the rejected vendor {string}")
	public void revertrejecvendor(String vendor) throws InterruptedException
	{
		rejected_vendor_revert(vendor);
}
	
		@Then("user reject multiple vendors and revert")
		public void revertrejecmultiplevendor() throws InterruptedException
		{
			rejected_multiplevendor_revert();
	}
	// app
	@Given("user is Login page prior to confirming Application") 
	public void mygivenlogin_app() throws Throwable 
	{
		System.out.println("inside given login page");
		
	}
	
	@When("user navigate to External Data Application Detected and New Application") 
	public void mywhencredentials_app() throws Throwable 
	{
		System.out.println("navigate to vendor"); 
		navigatetoexternal_application();
		 
	}

	
	@Then("user confirm new Application {string}")
	public void confirmapp(String app) throws InterruptedException
	{
		applicationdetectedconfirm(app);
}
}
