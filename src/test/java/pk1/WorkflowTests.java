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
import pageobject.WorklfowScenarioPO;


public class WorkflowTests extends WorklfowScenarioPO {
	
public WorkflowTests() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
@When("user navigate to workflows") 
public void workflows() throws Throwable 
{
	System.out.println("inside navigate to workflow module");
	enter_credentials();
	 navigateto_workflows();
}
@Then("Click on top cards to filter workflows") 
public void clicktopcardtofilter() throws Throwable 
{
	System.out.println("Click on top cards to filter workflows");
	topcardstofilterworkflow();
}
@When("user is in workflows")
public void useronworkflow() throws InterruptedException
{
	givenuseronworkflow();
}

@Then("Workflow list should be filtered as per selected criteria") 
public void filterselectcriteria() throws Throwable 
{
	filtercriteria();
}

@Then("reset criteria") 
public void resetcriteriafilter() throws Throwable 
{
	resetcriteria();
}
@Then("save filter view") 
public void saveviewcriteria() throws Throwable 
{
	saveview();
}
@Then("share view and copy link") 
public void shareviewcriteria() throws Throwable 
{
	shareview();
}
 
@Then("change due date and mark complete") 
public void workflowhangedate_markcomplete() throws Throwable 
{
	wfhangedate_markcomplete();
}
}
