package pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.runtime.model.WebDriverValue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class WorklfowScenarioPO extends LandingPage{
	
	public WorklfowScenarioPO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean anybuttonpresent()
	{
		
		 By[] buttons = new By[] {
		            By.xpath("//button[text()='Sync Now']"),
		            By.xpath("//button[text()='Connect']"),
		            By.xpath("//button[text()='Disconnect']")
		        };

	

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        boolean buttonFound = wait.until(driver -> {
		            for (By button : buttons) {
		                List<WebElement> elements = driver.findElements(button);
		                for (WebElement element : elements) {
		                	try
		                	{
		                    if (element.isDisplayed()) {
		                    	System.out.println(element.getText());
		                        return true;
		                    }
		                	}
		                    catch(StaleElementReferenceException e)
		                    {
		                    	System.out.println(""+e.getMessage()); 
		                    }
		                	catch(NoSuchElementException e1)
		                	{
		                		System.out.println(""+e1.getMessage()); 
		                	}
		            
		                    }
		                
		            }
		            return false;
		        });

		        if (buttonFound) {
		            System.out.println("Page loaded with one of the buttons");
		            return true;
		        } else {
		            System.out.println("Page did not load with any of the buttons");
		            return false;
		        }

	}
	
	public void navigateto_workflows() throws InterruptedException
	{
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//label[text()='Workflows']")).click();
		Thread.sleep(9000);
		
	}
	public void topcardstofilterworkflow() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//p[text()='Contract Renewal']
		//p[text()='Procurement']
				//p[text()='Application Access']
				//p[text()='Provisioning / Deprovisioning']
				//p[text()='Others']
		driver.findElement(By.xpath("//p[text()='Contract Renewal']")).click();
		Thread.sleep(5000);
		//get text 
		String st1=driver.findElement(By.xpath("(//p[contains(text(),'Total Workflows')])[1]")).getText();
		System.out.println(st1.substring(0, 2));
		Thread.sleep(2000);
		
		String st2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p/div/span")).getText();
		System.out.println(st2.substring(0, 2));
		//assertEquals(st2.substring(0, 2),st1.substring(0, 2)); nee to chanfe to out of
		//procurement
		driver.findElement(By.xpath("//p[text()='Procurement']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//p[contains(text(),'Total Workflows')])[2]")));
		//get text 
		String st3=driver.findElement(By.xpath("(//p[contains(text(),'Total Workflows')])[2]")).getText();
		System.out.println(st3.substring(0, 2));
		Thread.sleep(2000);
		
		String st4=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p/div/span")).getText();
		System.out.println(st4.substring(0, 2));
		//assertEquals(st4.substring(0, 2),st3.substring(0, 2));
		//app access
		driver.findElement(By.xpath("//p[text()='Application Access']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Application Access']/following::p[1]")));
		//get text 
		String st5=driver.findElement(By.xpath("//p[text()='Application Access']/following::p[1]")).getText();
		st5=st5.substring(0);
		st5=st5.trim();
		System.out.println(st5);
		Thread.sleep(2000);
		
		String st6=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p/div/span")).getText();
		st6=st6.substring(0,2);
		st6=st6.trim();
		//System.out.println(st6.substring(0, 2));
		//assertEquals(st6,st5);
		//prov
		driver.findElement(By.xpath("//p[text()='Provisioning / Deprovisioning']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Provisioning / Deprovisioning']/following::p[1]")));
		//get text 
		String st7=driver.findElement(By.xpath("//p[text()='Provisioning / Deprovisioning']/following::p[1]")).getText();
		st7=st7.substring(0);
		st7=st7.trim();
		Thread.sleep(2000);
		
		String st8=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p/div/span")).getText();
		//System.out.println(st8.substring(0, 2));
		st8=st8.substring(0,2);
		st8=st8.trim();
	//	assertEquals(st8,st7);
		//others
		driver.findElement(By.xpath("//p[text()='Others']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Others']/following::p[1]")));
		//get text 
		String st9=driver.findElement(By.xpath("//p[text()='Others']/following::p[1]")).getText();
		st9=st9.substring(0);
		st9=st9.trim();
		Thread.sleep(2000);
		
		String st10=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p/div/span")).getText();
		st10=st10.substring(0,2);
		st10=st10.trim();
	//	assertEquals(st10,st9);
		Thread.sleep(3000);	
		driver.navigate().refresh();
		Thread.sleep(9000);	
	}
	public void givenuseronworkflow() throws InterruptedException
	{
	//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button"))));
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id='appBodyContainer']/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//label[text()='Workflows']")).click();
		Thread.sleep(3000);
	}
	public void filtercriteria() throws InterruptedException
	{
		Actions act=new Actions(driver);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='All'])[1]")));
		driver.findElement(By.xpath("(//div[text()='All'])[1]")).click();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(3000);
		resetcriteria();
		driver.navigate().refresh();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Workflows']/following::div[1]")));
		driver.findElement(By.xpath("//input[@placeholder='Search Workflows']/following::div[1]")).click();
		Thread.sleep(3000);
		
		
				driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]")).sendKeys("Workflow Category");
				Thread.sleep(3000);
				act.sendKeys(Keys.ENTER);
				act.build().perform();
			//	driver.findElement(By.xpath("(//span[text()='Workflow Category'])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@aria-label='Search'])[2]")).click();
				Thread.sleep(3000);
				act.sendKeys(Keys.ENTER);
				act.build().perform();
				driver.findElement(By.xpath("(//input[@aria-label='Search'])[3]")).click();
				Thread.sleep(3000);
				act.sendKeys("contract");
				act.build().perform();
				act.sendKeys(Keys.ENTER);
				act.build().perform();
				driver.findElement(By.xpath("//p[text()='Apply']")).click();
				Thread.sleep(2000);
				m.takePageScreenshot_onPass(driver, "filter Workflow Category contract");
				Thread.sleep(1000);
			//	assertTrue(driver.findElement(By.xpath("(//span[text()='Contract Renewal'])[1]")).isDisplayed());
				
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Workflows']/following::div[1]")));
				driver.findElement(By.xpath("//input[@placeholder='Search Workflows']/following::div[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//p[text()='Add filters']")).click();
				Thread.sleep(2000);
				
			driver.findElement(By.xpath("(//input[@aria-label='Search'])[4]")).click();
						Thread.sleep(2000);
						
								driver.findElement(By.xpath("(//input[@aria-label='Search'])[4]")).sendKeys("Workflow Status");
								Thread.sleep(2000);
								act.sendKeys(Keys.ENTER);
								act.build().perform();
								
										driver.findElement(By.xpath("(//input[@aria-label='Search'])[5]")).click();
										Thread.sleep(1000);
										act.sendKeys(Keys.ENTER);
										act.build().perform();
										driver.findElement(By.xpath("(//input[@aria-label='Search'])[6]")).click();
										Thread.sleep(3000);
										act.sendKeys("in prog");
										act.build().perform();
										act.sendKeys(Keys.ENTER);
										act.build().perform();
										driver.findElement(By.xpath("//p[text()='Apply']")).click();
										Thread.sleep(2000);
										ExtentCucumberAdapter.addTestStepLog("after apply filter");
										m.takePageScreenshot_onPass(driver, "filter2 Workflow Category status pic1");
										Thread.sleep(1000);
										//span[text()='Contract Renewal'])[1]
										act.click(driver.findElement(By.xpath("(//span[text()='Contract Renewal'])[1]")));
										act.build().perform();
										for(int i=0;i<20;i++)
										{
										act.sendKeys(Keys.ARROW_RIGHT);
										act.build().perform();
										}
										ExtentCucumberAdapter.addTestStepLog("after apply filter verify category and status");
										m.takePageScreenshot_onPass(driver, "filter2 Workflow Category status pic2");
										Thread.sleep(1000);
										for(int i=0;i<20;i++)
										{
										act.sendKeys(Keys.ARROW_UP);
										act.build().perform();
										}
										Thread.sleep(1000);
	}
	public void resetcriteria() throws InterruptedException
	{
		Actions act=new Actions(driver);
		for(int i=0;i<20;i++)
		{
		act.sendKeys(Keys.ARROW_UP);
		act.build().perform();
		}
		try {
			driver.findElement(By.xpath("//p[text()='Reset']")).click();
			Thread.sleep(3000);
			ExtentCucumberAdapter.addTestStepLog("after reset");
			m.takePageScreenshot_onPass(driver, "reset filter");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void saveview() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/div[text()='Save view']")));
		//button/div[text()='Save view']
		driver.findElement(By.xpath("//button/div[text()='Save view']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("automation view");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save view']")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, "filter view saved pic1");
		Thread.sleep(2000);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Workflows']/following::button[2]")));
		
		driver.findElement(By.xpath("//input[@placeholder='Search Workflows']/following::button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Default View']")).click();
		Thread.sleep(5000);
		//input[@placeholder='Search Workflows']/following::div[10]
		String rows=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p")).getText();
ExtentCucumberAdapter.addTestStepLog(rows);
driver.findElement(By.xpath("//input[@placeholder='Search Workflows']/following::button[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//p[text()='automation view']")).click();
Thread.sleep(5000);
String rowsafterfilter=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[3]/p")).getText();
ExtentCucumberAdapter.addTestStepLog(rowsafterfilter);
		
		
		
	}
	public void shareview() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		ExtentCucumberAdapter.addTestStepLog("share view");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/span")).click();
		try {
			act.click(driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/span")));
			act.build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'https')]/following::button[1]")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "share view");
		
	}
	public void wfhangedate_markcomplete() throws InterruptedException
	{
		Actions act=new Actions(driver);
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='All'])[1]")));
	driver.findElement(By.xpath("(//div[text()='All'])[1]")).click();
	Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Workflows']")));
		
		 driver.findElement(By.xpath("//input[@placeholder='Search Workflows']")).sendKeys(workflow);
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("(//*[text()='"+workflow+"'])[1]")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//*[text()='Due Date:']/following::div[1]")).click();
			Thread.sleep(2000);
			//div[text()='30']
			driver.findElement(By.xpath("//div[text()='30']")).click();
			//driver.findElement(By.xpath("//*[text()='Today']")).click();
			Thread.sleep(5000);
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Mark Complete'])[1]")));
		
				try {
					for(int i=1;i<5;i++)
					{
						//WebElement element = driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]"));
						Thread.sleep(1000); 
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]")));
		
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Mark Complete'])[1]")));
					driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]")).click();
					Thread.sleep(5000);
					m.takePageScreenshot_onPass(driver, "wk markcomplete"+i);
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("workflow automation comment");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//button[text()='Confirm']")).click();
					Thread.sleep(6000);
					m.takePageScreenshot_onPass(driver, "wk markcomplete pic"+i);
					Thread.sleep(1000);
				
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("button over");
				}
			
	}
	}
