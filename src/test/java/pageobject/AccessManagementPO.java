package pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.runtime.model.WebDriverValue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class AccessManagementPO extends LandingPage{
	
	public AccessManagementPO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void navigatetoaccessmgmt() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		enter_credentials();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//label[text()='Access Management']")).click();
		Thread.sleep(3000);	
		
			
	}
	public void navigatetoactiveuser() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[text()='Active Users'])[1]")).click();
		Thread.sleep(3000);	
	}
	public void searchuser_provision(String user,String app) throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(50));
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@placeholder='Search Users']")).sendKeys(user);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[text()='Provision']")).click();
		Thread.sleep(9000);	
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(app);
		Thread.sleep(2000);	
		m.takePageScreenshot_onPass(driver, app+"provision pic1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='"+app+"'])[1]//preceding::input[@type='checkbox'][1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[text()='Start Provisioning Process']")).click();
		Thread.sleep(3000);	
		try {
			driver.findElement(By.xpath("//button[text()='Yes']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("yes button not there");
		}	
		try {
		driver.findElement(By.xpath("//*[text()='Assign License Type']/following::input[@type='search']")).sendKeys("Basic");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		Thread.sleep(2000);	
		m.takePageScreenshot_onPass(driver, "select basic on provision");
			driver.findElement(By.xpath("//*[text()='Save']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("save button not there");
		}	
		try {
			driver.findElement(By.xpath("//button[text()='Yes']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("yes button not there");
		}	
		m.takePageScreenshot_onPass(driver, app+"provision pic2");
		Thread.sleep(9000);
		// verify
		driver.navigate().to("https://somecorp.cloudeagle.us/app/workflow/assigned");
		driver.navigate().refresh();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//p[contains(text(),'Provisioning')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Search Workflows']")).sendKeys(user);
		Thread.sleep(4000);	
		
		driver.findElement(By.xpath("(//*[contains(text(),'User Provisioning')])[1]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		//driver.findElement(By.xpath("(//*[contains(text(),'User Provisioning')])[1]")).click();
		Thread.sleep(5000);
		
				driver.findElement(By.xpath("(//span[text()='Assign License'])[1]")).click();
				Thread.sleep(5000);
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label//child::div[text()='Assign']")));
		String actapp=driver.findElement(By.xpath("(//span[text()='Application']//following::div[@role='cell']//a)[1]")).getText();
		Thread.sleep(4000);
		ExtentCucumberAdapter.addTestStepLog("actual app name "+actapp);
		m.takePageScreenshot_onPass(driver, "userapp provision "+user+app);
		Thread.sleep(4000);
		assertEquals(app,actapp);
		
				try {
					driver.findElement(By.xpath("(//*[text()='Assign'])[2]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//*[text()='Assign'])[3]")).click();
					Thread.sleep(5000);
				} catch (Exception e) {
				
				}
				
	}
	
	public void applicationdetectedconfirm(String application) throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		//TExperience LLC']
		
		//driver.close();
	}
}
