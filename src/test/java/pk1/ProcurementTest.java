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
import pageobject.LandingPage;
import pageobject.ProcurementPO;


public class ProcurementTest extends ProcurementPO {
public ProcurementTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Given("user is Login page prior to creating procurement") 
	public void mygivenlogin() throws Throwable 
	{
		System.out.println("inside given login page");
		
	}
	
	@When("user enter cloudeagle credentials prior to creating procurement") 
	public void mywhencredentials() throws Throwable 
	{
		System.out.println("inside cloudeagle login page and enter credentials"); 
		 enter_credentials();
		 
	}
	
	@Then("user navigate to procurement module") 
	public void procurement_page() throws Throwable 
	{
		System.out.println("inside navigate to workflow module");
		navigate_procurement();
	}
	
	
	@Then("raise a new request {string}")
	public void addmob_fromexample(String req) throws InterruptedException
	{
		Thread.sleep(1000);
		procurement_formfill(req);
}
	
	@Then("procurement reset criteria")
	public void procurementresetcriteria() throws InterruptedException
	{
		Thread.sleep(1000);
		procurementresetfilter();
}
	
	@Then("procurement apply filter and save")
	public void procurementsave() throws InterruptedException
	{
		Thread.sleep(1000);
		procurement_filter_save();
}
	@Then("procurement share view and copy link")
	public void procurementsharelink() throws InterruptedException
	{
		Thread.sleep(1000);
		procurementshareview();
}
	@Then("user mark Approve and auto trigger move to next")
	public void procurementautotrigger() throws InterruptedException
	{
		Thread.sleep(1000);
		procurechangedate_markcomplete();
}
}
