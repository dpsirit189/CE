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
import pageobject.DocumentPO;
import pageobject.LandingPage;


public class DocumentTest extends DocumentPO {
	
public DocumentTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
@Given("user is on cloudeagle Login page and want to upload document") 
public void mygivenlogin() throws Throwable 
{
	System.out.println("inside given login page");
	
}

@When("user navigate to document module") 
public void accessmgmntuserprovision() throws Throwable 
{
	enter_credentials();
	navigate_document();
	
}

@Then("user upload document") 
public void useruploaddoc() throws Throwable 
{
	upload_doc_manual("test");
	
}
	
}
