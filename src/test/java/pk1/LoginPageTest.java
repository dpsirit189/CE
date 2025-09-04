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


public class LoginPageTest extends LandingPage {
	
public LoginPageTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}


	@Given("user is Login page of Cloudeagle") 
	public void mygivenlogin() throws Throwable 
	{
		System.out.println("inside given login page");
		
	}
	
	@When("user enter right credentials") 
	public void mywhencredentials() throws Throwable 
	{
		System.out.println("inside  cloudeagle login page");
		 
		 enter_credentials();
		 //takePageScreenshot_onPass(driver, "login valid");
		 
	}
	
	@When("user enter wrong credentials") 
	public void wrongcredentials() throws Throwable 
	{
		System.out.println("inside  cloudeagle login page");
		 
		enter_wrongcredentials();
		 
	}

	@Then("Dashboard page should be displayed") 
	public void dashboard() throws Throwable 
	{
		System.out.println("inside dashboard");
		dashboardpage_displayed();
	}
	@Then("Dashboard page should not be displayed") 
	public void invalidlogin() throws Throwable 
	{
		System.out.println("inside dashboard");
		dashboardpage_notdisplayed();
		
		//dashboardpage_notdisplayed();
	}
	
}
