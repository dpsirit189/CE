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
import pageobject.LandingPage;


public class AccessMgmtTest extends AccessManagementPO {
	
public AccessMgmtTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
@Given("user is Login page of CE prior to Access Mgmt active user") 
public void mygivenlogin() throws Throwable 
{
	System.out.println("inside given login page");
	
}

@When("navigate to Access Mgmt active user and search user") 
public void accessmgmntuserprovision() throws Throwable 
{
	System.out.println("inside accessmgmntuserprovision");
	 
	 navigatetoaccessmgmt();
	 navigatetoactiveuser();
}

@Then("provision {string}{string} and start provisioning process") 
public void mywhencredentials(String user,String app) throws Throwable 
{
	System.out.println("inside  cloudeagle login page");
	 searchuser_provision(user, app);
	 
}
	
}
