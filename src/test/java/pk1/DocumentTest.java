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

@Then("user upload document save and verify line totals") 
public void useruploaddoc() throws Throwable 
{
	upload_doc_manual("test");
	
}
@Then("user edit line and verify line totals") 
public void usereditdoc() throws Throwable 
{
	manual_edit_lineaftersave();
	
}
@Then("user upload invoice document save and verify line totals") 
public void useruploadinvoicedoc() throws Throwable 
{
	uploadinvoice();
	
}
@Then("publish document and search") 
public void useruploadinvoicedocpublish() throws Throwable 
{
	publish();
	editpublish_invoice();
	
}

@Then("extract document data and verify") 
public void extractdataverify() throws Throwable 
{
	extractdata();
	
}
@Then("verify Active contracts") 
public void verifycontracts() throws Throwable 
{
	verifyactivecontract();
	
}

	
}
