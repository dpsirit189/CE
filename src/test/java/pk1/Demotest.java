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


public class Demotest extends LandingPage {
public Demotest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Given("user is cloudeagle Login page") 
	public void mygivenlogin() throws Throwable 
	{
		System.out.println("inside given login page");
		
	}
	
	@When("user enter cloudeagle credentials") 
	public void mywhencredentials() throws Throwable 
	{
		System.out.println("inside  cloudeagle login page");
		 
		 enter_credentials();
		 
	}
	
	@Then("user navigate to workflow module") 
	public void workflow_page() throws Throwable 
	{
		System.out.println("inside navigate to workflow module");
		navigate_workflow();
	}
	
	@Then("user fill workflow form and submit") 
	public void fill_workflow() throws Throwable 
	{
		System.out.println("inside navigate to workflow module and fill");
		fill_workflowform();
	}
	
//	
//	@Then("raise a new request <request for> <vendor>")
//	public void addmob_fromexample(String mobname) throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.findElement(By.linkText(mobname)).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Add to cart")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Cart")).click();
//		Thread.sleep(2000);
//		ExtentCucumberAdapter.addTestStepLog("addd mobile to cart");
//	
//	}
}
