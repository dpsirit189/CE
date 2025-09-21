package pageobject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class ProcurementPO extends LandingPage{
	String testimgdestination=System.getProperty("user.dir")+"/documentuploads/test img.jpeg";
	public ProcurementPO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void procurementresetfilter() throws InterruptedException
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

		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Requests']/following::div[1]")));
		driver.findElement(By.xpath("//input[@placeholder='Search Requests']/following::div[1]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]")).sendKeys("requested for");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//	driver.findElement(By.xpath("(//span[text()='Workflow Category'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[2]")).sendKeys("=");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[3]")).click();
		Thread.sleep(3000);
		act.sendKeys("laptop");
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		driver.findElement(By.xpath("//p[text()='Apply']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "filter procurement Category laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Reset']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "filter procurement reset");

	}
	public void procurement_filter_save() throws InterruptedException
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

		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Requests']/following::div[1]")));
		driver.findElement(By.xpath("//input[@placeholder='Search Requests']/following::div[1]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]")).sendKeys("requested for");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//	driver.findElement(By.xpath("(//span[text()='Workflow Category'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[2]")).sendKeys("=");
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[3]")).click();
		Thread.sleep(3000);
		act.sendKeys("laptop");
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();

		// filter2
		driver.findElement(By.xpath("//p[text()='Add filters']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@aria-label='Search'])[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@aria-label='Search'])[4]")).sendKeys("Status");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		driver.findElement(By.xpath("(//input[@aria-label='Search'])[5]")).sendKeys("=");
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
		m.takePageScreenshot_onPass(driver, "procurement multiple filter apply");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Save view']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("proc_automation");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Save view'])[2]")).click();
		Thread.sleep(3000);
		m.takePageScreenshot_onPass(driver, "procurement save view pic1");
		Thread.sleep(1000);
		String rowsafterfilter=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[3]/div/div/div[1]/div[1]/div[3]/p")).getText();
		ExtentCucumberAdapter.addTestStepLog(rowsafterfilter);
		
		
		
	}
	public void procurementshareview() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		ExtentCucumberAdapter.addTestStepLog("procurementshareview");
		Thread.sleep(2000);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='proc_automation']/following::div[1]/span")));
			driver.findElement(By.xpath("//*[text()='proc_automation']/following::div[1]/span")).click();
			act.click(driver.findElement(By.xpath("//*[text()='proc_automation']/following::div[1]/span")));
			act.build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		try {
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div[3]/div/div/div[1]/div[1]/div[1]/div[4]/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		Thread.sleep(5000);
		
		String prourl=driver.findElement(By.xpath("//*[contains(text(),'https')]")).getText().toString();
		driver.findElement(By.xpath("//*[contains(text(),'https')]/following::button[1]")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "share view pic1");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(prourl);
		Thread.sleep(15000);
		ExtentCucumberAdapter.addTestStepLog("procurementshareview is "+prourl);
		m.takePageScreenshot_onPass(driver, "share view pic2");
		Thread.sleep(1000);
		driver.quit();
		
		
	}
	public void procurechangedate_markcomplete() throws InterruptedException
	{
		Actions act=new Actions(driver);
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='All'])[1]")));
	driver.findElement(By.xpath("(//div[text()='All'])[1]")).click();
	Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Requests']")));
		 procurement_req=procurement_req+"hw";
		 driver.findElement(By.xpath("//input[@placeholder='Search Requests']")).sendKeys(procurement_req);
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("(//*[text()='"+procurement_req+"'])[1]")).click();
			Thread.sleep(9000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Due Date:']/following::div[1]")));
			//driver.findElement(By.xpath("//*[text()='Due Date:']/following::div[1]")).click();
			 driver.findElement(By.xpath("//input[@placeholder='Select date']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			 driver.findElement(By.xpath("//input[@placeholder='Select date']")).sendKeys("Sep 30, 2025");
				Thread.sleep(2000);
			//div[text()='30']
		//	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='30']")));
		//	driver.findElement(By.xpath("//div[text()='30']")).click();
			//driver.findElement(By.xpath("//*[text()='Today']")).click();
			Thread.sleep(5000);
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Mark Complete'])[1]")));
		
				try {
					for(int i=1;i<7;i++)
					{
						//WebElement element = driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]"));
						Thread.sleep(1000); 
					
						
					 try {
						 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//p[text()='Upcoming'])[1]")));
						 Thread.sleep(1000); 
						driver.findElement(By.xpath("(//p[text()='Upcoming'])[1]")).click();
						Thread.sleep(7000);
						 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='In Progress'])[1]")));
//						if(driver.findElement(By.xpath("(//p[text()='In Progress'])[1]")).isDisplayed())
//						{
//						 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='Mark Complete'])[1]")));
//						}
						 
						 Thread.sleep(1000); 
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
								
						
						
						 
						try {
							 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]")));
							 Thread.sleep(1000); 
							driver.findElement(By.xpath("(//p[text()='Mark Complete'])[1]")).click();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							System.out.println("no mark complete button");
						}
						 try {
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//p[text()='Approve'])[1]")));
							 Thread.sleep(1000); 
							 driver.findElement(By.xpath("(//p[text()='Approve'])[1]")).click();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					Thread.sleep(5000);
					m.takePageScreenshot_onPass(driver, "wk markcomplete"+i);
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("procurement automation comment");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//button[text()='Confirm']")).click();
					Thread.sleep(6000);
					m.takePageScreenshot_onPass(driver, "procurement markcomplete pic"+i);
					Thread.sleep(3000);
				
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("button over");
				}
				Thread.sleep(3000);
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@id='mentions_input'])[1]")));
				try {
					driver.findElement(By.xpath("(//textarea[@id='mentions_input'])[1]")).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					
				}
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//p[text()='Workflow Activities']/following::textarea[@id='mentions_input']")));
				//driver.findElement(By.xpath("//textarea[@id='mentions_input']")).sendKeys("workflow automation comment @Digvijay"+Keys.ENTER);
				driver.findElement(By.xpath("(//textarea[@id='mentions_input'])[1]")).sendKeys("procurement automation comment @Digvijay"+Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='file']")).sendKeys(testimgdestination);
				Thread.sleep(4000);
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Send']")));
				try {
					driver.findElement(By.xpath("//*[text()='Send']")).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					
				}
				//p[text()='Workflow Activities']/following::textarea[@id='mentions_input']
				//span[starts-with(@class, 'workflowSettings')]
				//input[@type='file']
	}

}
