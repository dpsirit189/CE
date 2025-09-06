package pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import junit.framework.Assert;


public class LandingPage {
	public WebDriver driver;
	public MyTestScreenshot m;
	WebElement el1;
	// xpath //*[@id="appBodyContainer"]/div[1]/div[2]/button
	String runurl="";
	String uid="";
	String browser_run="";
	String password="";
	Properties props;
	String workflow="";
	String procurement_req="dspproc_req8";  // change this
	String Expectedurllogin="https://somecorp.cloudeagle.us/app/signin";
	String zoomuser="";
	String zoompass="";
	//String Expectedurldashboard="https://somecorp.cloudeagle.us/app/dashboard";
	public LandingPage() throws IOException
	{
		 m=new MyTestScreenshot();
		FileReader reader=new FileReader("./src/test/resources/Cloudeagle_Automation.properties");
		props=new Properties();
		props.load(reader);
		browser_run=props.getProperty("browser");
		zoomuser=props.getProperty("zoomuserid");
		zoompass=props.getProperty("zoompassword");
		if(browser_run.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe"); //where chromedriver exists(path)
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		runurl=props.getProperty("devurl");
		workflow=props.getProperty("workflowName");
		driver.get(runurl);
	}
	public void enter_credentials() throws InterruptedException
	{
		System.out.println("inside when");

		// driver.findElement(By.name("usernamse")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("emailField")).sendKeys(props.getProperty("loginid"));
		Thread.sleep(2000);
		driver.findElement(By.name("passField")).sendKeys(props.getProperty("userpassword"));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button/h5[text()='Sign in']")).click();

		Thread.sleep(3000);
	}
	public void enter_wrongcredentials() throws InterruptedException
	{
		System.out.println("inside when");

		// driver.findElement(By.name("usernamse")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("emailField")).sendKeys("abcd@cloudeagle.ai");
		Thread.sleep(2000);
		driver.findElement(By.name("passField")).sendKeys("abc123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button/h5[text()='Sign in']")).click();

		Thread.sleep(3000);
	}
	public void dashboardpage_displayed() throws InterruptedException
	{
		Thread.sleep(3000);
m.takePageScreenshot_onPass(driver, "dashboard");
	//	driver.findElement(By.xpath("//h2[text()='Dashboard']")).click();
		ExtentCucumberAdapter.addTestStepLog(" URL is "+driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	}
	public void dashboardpage_notdisplayed() throws InterruptedException
	{
		Thread.sleep(3000);
		m.takePageScreenshot_onPass(driver, "login invalid");
		//driver.findElement(By.xpath("//h1[text()='Sign In']")).click();
		String act=driver.getCurrentUrl();
		ExtentCucumberAdapter.addTestStepLog(" URL is "+driver.getCurrentUrl());
		Thread.sleep(3000);
		//https://somecorp.cloudeagle.us/app/signin
assertEquals(act, Expectedurllogin);
		driver.close();
	}
	public void navigate_workflow() throws InterruptedException
	{
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//label[text()='Workflows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button/h7[text()='Start New Workflow']")).click();
		Thread.sleep(3000);
	}
	public void navigate_procurement() throws InterruptedException
	{
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//label[text()='Procurement']")).click();
		Thread.sleep(3000);
	}
	public void fill_workflowform() throws InterruptedException
	{
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//h5[text()='Select a workflow template']//following::div[1]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("Test FE Editing");
		Thread.sleep(3000);	
		driver.findElement(By.xpath(" //p[text()='Test FE Editing']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@name='workflowName']")).sendKeys(workflow);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[text()='Vendor ']//following::div[1]")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("cdk"+Keys.ARROW_UP+Keys.ENTER);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//label[text()='Owner ']//following::div[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).sendKeys("admin");
		Thread.sleep(3000);	
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		Thread.sleep(1000);	

		driver.findElement(By.xpath("//textarea")).sendKeys("this is a new workflow created");
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//span[@class='ant-switch-inner']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("unable to click");
		}
		Thread.sleep(2000);
		//	    driver.findElement(By.xpath("//p[text()='Slack Workspace']")).click();
		//	    Thread.sleep(5000);	
		//	    String parentHandle = driver.getWindowHandle();
		//	    Object[] windowHandles1=driver.getWindowHandles().toArray();
		//        driver.switchTo().window((String) windowHandles1[1]); //say switch to child
		//        Thread.sleep(2000);	
		//        driver.findElement(By.xpath("//button[text()='Connect']")).click();
		//	    Thread.sleep(2000);	
		//	 // Capture all handles again
		//	    Set<String> allHandles = driver.getWindowHandles();
		//
		//	    // Identify Window3 (the new one)
		//	    String window3Handle = null;
		//	    for (String handle : allHandles) {
		//	        if (!handle.equals(parentHandle) && !handle.equals(driver.getWindowHandle())) {
		//	            window3Handle = handle;
		//	            break;
		//	        }
		//	    }
		//
		//	    // Switch to Window3
		//	    driver.switchTo().window(window3Handle);
		//	    Thread.sleep(5000);	
		//	    // Do something if required, then close it
		//	    driver.close();
		//	    Thread.sleep(2000);	
		//	    driver.switchTo().window((String) windowHandles1[1]);
		//	    Thread.sleep(5000);	
		//        driver.switchTo().window((String) windowHandles1[0]);
		driver.findElement(By.xpath("//button/h7[text()='Start Workflow']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//p[text()='Test FE Editing 2']//following::div[2]")).click();
		Thread.sleep(2000);
		act.sendKeys("Digvijay");
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button/h7[text()='Confirm']")).click();
		Thread.sleep(12000);

		driver.navigate().to("https://somecorp.cloudeagle.us/app/workflow/assigned");
		Thread.sleep(7000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Workflows']")).sendKeys(workflow);
		Thread.sleep(7000);	
		driver.navigate().refresh();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Workflows']")).sendKeys(workflow);
		Thread.sleep(7000);	
		//No matches found. 
		m.takePageScreenshot_onPass(driver, workflow);
		Thread.sleep(1000);
		assertTrue("No records found",driver.findElement(By.xpath("//span[text()='Task Name']")).isDisplayed());

		driver.close();


	}
	public void procurement_formfill(String req) throws InterruptedException
	{
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//button/h7[text()='Raise a request']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//p[text()='I want to request for']//following::div[1]")).click();
		Thread.sleep(2000);	

		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(req+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(5000);	
		
		switch(req)
		{
		case "Software":
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[text()='Vendor or Product category']//following::div[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("cloudeagle");
			Thread.sleep(10000);	
			act.sendKeys(Keys.ARROW_DOWN);
			act.build().perform();
			act.sendKeys(Keys.ENTER);
			act.build().perform();
			Thread.sleep(15000);
			driver.findElement(By.xpath("(//button[text()='Request Access'])[1]")).click();
			Thread.sleep(6000);	
			driver.findElement(By.xpath("//button/h7[text()='Submit']")).click();
			Thread.sleep(2000);
			break;
		case "Hardware-Table":
			procurement_req=procurement_req+"hwtb";
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@placeholder='your answer'])[1]")).sendKeys("Cloudeagle Automation");
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//textarea")).sendKeys("Cloudeagle Automation");
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys("999");
			Thread.sleep(1000);	
			driver.findElement(By.xpath("(//input[@placeholder='your answer'])[2]")).sendKeys("automationman@cloudeagle.ai");
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//button/h7[text()='Submit']")).click();
			Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='Request Name']")).sendKeys(procurement_req);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				Thread.sleep(7000);
				driver.navigate().to("https://somecorp.cloudeagle.us/app/procurementRequest/myRequest");
				Thread.sleep(3000);	
				driver.navigate().refresh();
				Thread.sleep(7000);
				
				driver.findElement(By.xpath("//input[@placeholder='Search Requests']")).sendKeys(procurement_req);
				Thread.sleep(3000);	
				//No matches found. 
				m.takePageScreenshot_onPass(driver, procurement_req);
				Thread.sleep(1000);
				assertTrue("No records found",driver.findElement(By.xpath("//span[text()='Requested Id']")).isDisplayed());
			break;
		case "Hardware":
			procurement_req=procurement_req+"hw";
			driver.findElement(By.xpath("//p[text()='Requested for']//following::div[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("laptop");
			Thread.sleep(10000);	
			act.sendKeys(Keys.ARROW_DOWN);
			act.build().perform();
			act.sendKeys(Keys.ENTER);
			act.build().perform();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[text()='Raise New']")).click();
			Thread.sleep(4000);	
			
			driver.findElement(By.xpath("//input[@placeholder='your answer']")).sendKeys("for work !");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button/h7[text()='Submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Request Name']")).sendKeys(procurement_req);
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			Thread.sleep(7000);
			
			driver.navigate().to("https://somecorp.cloudeagle.us/app/procurementRequest/myRequest");
			Thread.sleep(3000);	
			driver.navigate().refresh();
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//input[@placeholder='Search Requests']")).sendKeys(procurement_req);
			Thread.sleep(3000);	
			//No matches found. 
			m.takePageScreenshot_onPass(driver, procurement_req);
			Thread.sleep(1000);
			assertTrue("No records found",driver.findElement(By.xpath("//span[text()='Requested Id']")).isDisplayed());
		}


		try {
	
				driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
				Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		driver.close();

	}
}
