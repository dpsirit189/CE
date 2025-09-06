package pageobject;

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

public class ExternalData extends LandingPage{
	
	public ExternalData() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void navigatetoexternal_vendor() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		enter_credentials();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		act.click(driver.findElement(By.xpath("//*[@id='innerSideNav']/div/div[1]")));
		act.build().perform();
		Thread.sleep(2000);	
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(1000);	
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(2000);
		
		act.click(driver.findElement(By.xpath("//label[text()='External Data']")));
		act.build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("//div[text()='Vendors Detected']")));
		act.build().perform();
		Thread.sleep(5000);
		
		
	}
	public void navigatetoexternal_application() throws InterruptedException
	{
		Actions act=new Actions(driver);
		enter_credentials();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		act.click(driver.findElement(By.xpath("//*[@id='innerSideNav']/div/div[1]")));
		act.build().perform();
		Thread.sleep(2000);	
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(1000);	
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		Thread.sleep(2000);
		
		act.click(driver.findElement(By.xpath("//label[text()='External Data']")));
		act.build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("//div[text()='Applications Detected']")));
		act.build().perform();
		Thread.sleep(5000);
		
		
	}
	public void vendordetectedconfirm(String vendor) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//button[text()='Confirm Vendor'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]")).click();
		Thread.sleep(7000);
		ac.sendKeys(driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")),"nudge, llc");
		ac.build().perform();
		Thread.sleep(7000);
		ac.sendKeys(Keys.ARROW_DOWN);
		ac.build().perform();
		ac.sendKeys(Keys.ENTER);
		ac.build().perform();
		//driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("nudge, llc"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button/h7[text()='Confirm']")).click();
	
		
		Thread.sleep(12000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Vendors']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(8000);
		m.takePageScreenshot_onPass(driver, "vendor confirm "+vendor);
		assertTrue(driver.findElement(By.xpath("//span[text()='Nudge Experience LLC']")).isDisplayed());
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.close();
		
	}
	public void singlevendor_reject(String vendor) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		
		try {
			driver.findElement(By.xpath("//*[@id='appBodyContainer']/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("no side button");
		}
		driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		int f=0;
		try {
			driver.findElement(By.xpath("//span[text()='Vendor']/preceding::input[1]")).click();
			Thread.sleep(2000);
			f=1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		if(f==0)
		{
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(2000);
		}
				driver.findElement(By.xpath("//button[text()='Reject Vendors']")).click();
				Thread.sleep(2000);
				
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, vendor+"rejected pic1");
	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Rejected Vendors')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);	
		m.takePageScreenshot_onPass(driver, vendor+"rejected pic2");
		Thread.sleep(2000);
		
		
	}
	public void rejected_vendor_revert(String vendor) throws InterruptedException
	{
		
		driver.navigate().refresh();
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Rejected Vendors')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Rejected Vendors')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);	
		driver.findElement(By.xpath("//button[text()='Revert Vendor']")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, vendor+"reject revert pic1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(vendor);
		Thread.sleep(9000);
		m.takePageScreenshot_onPass(driver, vendor+"reject revert pic2");
		Thread.sleep(2000);
		driver.close();
	}
	public void rejected_multiplevendor_revert() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		
		try {
			driver.findElement(By.xpath("//*[@id='appBodyContainer']/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("no side button");
		}
		driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
				// -gettext
						
		String v1=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/following::div[1]")).getText();
		String v2=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]/following::div[1]")).getText();
		String v3=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]/following::div[1]")).getText();
		ExtentCucumberAdapter.addTestStepLog("vendors are "+v1+","+v2+","+v3);	
		driver.findElement(By.xpath("//button[text()='Reject Vendors']")).click();
		Thread.sleep(2000);
		
Thread.sleep(5000);
m.takePageScreenshot_onPass(driver, "rejected multiple vendors pic1");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Rejected Vendors')]")).click();
Thread.sleep(2000);
m.takePageScreenshot_onPass(driver, "rejected multiple vendors pic2");
wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Rejected Vendors')]")));
driver.findElement(By.xpath("//div[contains(text(),'Rejected Vendors')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//button[text()='Revert Vendors'])[1]")).click();
Thread.sleep(5000);
m.takePageScreenshot_onPass(driver, "reject multiple vendor revert pic1");
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
Thread.sleep(3000);
m.takePageScreenshot_onPass(driver, "reject multiple vendor revert pic2");
Thread.sleep(2000);
String revertedv1=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/following::div[1]")).getText();
String revertedv2=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]/following::div[1]")).getText();
String revertedv3=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]/following::div[1]")).getText();
ExtentCucumberAdapter.addTestStepLog("vendors are "+revertedv1+","+revertedv2+","+revertedv3);
	}
	public void applicationdetectedconfirm(String application) throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Apps')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//div[contains(text(),'New App')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//button[text()='Confirm App'])[1]")).click();
		
//		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]")).click();
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("AB computer"+Keys.ARROW_DOWN+Keys.ENTER);
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//button/h7[text()='Confirm']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(12000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Applications']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Apps')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(application);
		Thread.sleep(8000);
		m.takePageScreenshot_onPass(driver, "app confirm "+application);
		assertTrue(driver.findElement(By.xpath("//span[text()='Connectors']")).isDisplayed());
		Thread.sleep(1000);
		//span[text()='Nudge Experience LLC']
		
		driver.close();
	}
}
