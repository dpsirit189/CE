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
	Actions act;
	String transactionvalidfile=System.getProperty("user.dir")+"/documentuploads/CE Transaction Template.csv";
	String transactioninvalidfile=System.getProperty("user.dir")+"/documentuploads/CE Transaction Invalid data.csv";

	String invalidvendorfile=System.getProperty("user.dir")+"/documentuploads/CE Existing Invalid Vendor List.csv";
	String validvendorfile=System.getProperty("user.dir")+"/documentuploads/CE Existing Vendor List (1).csv";
	public ExternalData() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		act=new Actions(driver);
	}
	public void navigatetoexternal_vendor() throws InterruptedException
	{


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
	public void navigatetoexternal_exceldata() throws InterruptedException
	{

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
		act.click(driver.findElement(By.xpath("//*[text()='Excel Data Upload']")));
		act.build().perform();
		Thread.sleep(5000);


	}
	public void vendordetectedconfirm(String vendor) throws InterruptedException
	{

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
		act.sendKeys(driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")),"nudge");
		act.build().perform();
		Thread.sleep(7000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("nudge, llc"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[text()='Confirm']")).click();


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
		Thread.sleep(2000);
		driver.close();
	}
	public void confirm_multiplevendor_revert() throws InterruptedException {

		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(45));

		try {
			driver.findElement(By.xpath("//*[@id='appBodyContainer']/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("no side button");
		}
		driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(confirm_mult_ven);
		Thread.sleep(9000);
		//wt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='checkbox'])[2]")));
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		// -gettext
		Thread.sleep(2000);		
		String v1=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/following::div[1]")).getText();
		String v2=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]/following::div[1]")).getText();

		ExtentCucumberAdapter.addTestStepLog("vendors are "+v1+", "+v2);	
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Confirm Vendors']")));
		driver.findElement(By.xpath("//button[text()='Confirm Vendors']")).click();
		Thread.sleep(4000);
		// nudge llc
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Vendor']//following::div[1]")));
		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]")).click();
		Thread.sleep(7000);
		act.sendKeys(driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")),confirm_mult_ven);
		act.build().perform();
		Thread.sleep(7000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("nudge, llc"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[text()='Confirm']")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, "confirm multiple vendors pic1");
		//dba
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Vendor']//following::div[1]")));
		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]")).click();
		Thread.sleep(7000);
		act.sendKeys(driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")),confirm_mult_ven);
		act.build().perform();
		Thread.sleep(7000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("nudge, llc"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Confirm']")).click();
		Thread.sleep(3000);
		try {

			driver.findElement(By.xpath("(//button[text()='Merge'])[1]")).click();
			Thread.sleep(7000);
			m.takePageScreenshot_onPass(driver, "vendor merged "+confirm_mult_ven);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("no merge button");
		}
		try {

			driver.findElement(By.xpath("(//button[text()='Merge'])[1]")).click();
			Thread.sleep(7000);
			m.takePageScreenshot_onPass(driver, "vendor merged "+confirm_mult_ven);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("no merge button");
		}
		try {
			driver.findElement(By.xpath("//*[text()='Confirm']")).click();
			Thread.sleep(17000);
		} catch (Exception e) {

		}

		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")));
		m.takePageScreenshot_onPass(driver, "confirm multiple vendors pic2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "confirm multiple vendors pic2");
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")));
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(confirm_mult_ven);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Revert Vendors'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Revert']")).click();
		Thread.sleep(38000);

		try {
			wt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'New Vendors')])[1]")));

			//m.takePageScreenshot_onPass(driver, "confirm multiple vendor revert pic1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'New Vendors')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(confirm_mult_ven);
			Thread.sleep(9000);
			m.takePageScreenshot_onPass(driver, "confirm multiple vendor revert pic2");
			Thread.sleep(2000);
			String revertedv1=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/following::div[1]")).getText();
			String revertedv2=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]/following::div[1]")).getText();
			ExtentCucumberAdapter.addTestStepLog("vendors are "+revertedv1+", "+revertedv2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("done revert after confirm");
		}
		driver.close();
	}
	public void allvendor_confirm_revert() throws InterruptedException
	{

		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(45));
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//button[text()='Confirm Vendor'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]")).click();
		Thread.sleep(7000);
		act.sendKeys(driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")),allvenname);
		act.build().perform();
		Thread.sleep(7000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.build().perform();
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		//driver.findElement(By.xpath("//p[text()='Vendor']//following::div[1]//input")).sendKeys("nudge, llc"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[text()='Confirm']")).click();


		Thread.sleep(12000);
		m.takePageScreenshot_onPass(driver, "all vendor confirm "+allvenfullname+"  pic1");
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Vendors']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(9000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Vendors')])[1]")).click();
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Vendors']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(8000);
		m.takePageScreenshot_onPass(driver, "all vendor confirm "+allvenfullname+" pic2");
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//button[text()='Revert Vendor'])[1]")).click();
		Thread.sleep(15000);
		m.takePageScreenshot_onPass(driver, "all vendor revert "+allvenfullname+" pic3");
		Thread.sleep(1000);
		driver.close();

	}
	public void allvendor_reject_revert() throws InterruptedException
	{

		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(45));
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]")).click();
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Vendors']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(9000);	
		driver.findElement(By.xpath("(//button[text()='Confirm Vendor'])[1]/following::div[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()='Reject'])[1]")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, "all vendor reject "+allvenfullname+" pic1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Rejected Vendors')]")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, "all vendor reject "+allvenfullname+" pic2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[1]")).click();
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Vendors']"))));
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Vendors']")).sendKeys(allvenfullname);
		Thread.sleep(9000);	
		driver.findElement(By.xpath("(//button[text()='Revert Vendor'])[1]")).click();
		Thread.sleep(3000);
		m.takePageScreenshot_onPass(driver, "all vendor revert reject "+allvenfullname+" pic3");
		Thread.sleep(1000);
		driver.close();

	}
	public void alltab_confirmapp_revert() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(15));

		Thread.sleep(4000);	
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'All Apps')])[1]")));
		driver.findElement(By.xpath("(//div[contains(text(),'All Apps')])[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys("connectors");
		Thread.sleep(9000);	

		driver.findElement(By.xpath("(//button[text()='Confirm App'])[1]")).click();
		Thread.sleep(5000);	
		m.takePageScreenshot_onPass(driver, "confirmed all app pic1");
		Thread.sleep(5000);	
		//need to check
		driver.findElement(By.xpath("(//button[text()='Revert App'])[1]")).click();
		Thread.sleep(35000);
		m.takePageScreenshot_onPass(driver, "confirmed all app tab pic2");
		driver.navigate().refresh();
		Thread.sleep(9000);	
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys("connectors");
		Thread.sleep(9000);	
		m.takePageScreenshot_onPass(driver, "confirmed all app tab pic3");
		driver.close();

	}

	public void confirm_multiple_revertapp() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(multiapp);
		Thread.sleep(9000);	

		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		m.takePageScreenshot_onPass(driver, "confirmed zoominfo pic0");
		// -gettext
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[text()='Confirm Apps']")).click();
		Thread.sleep(3000);	
		m.takePageScreenshot_onPass(driver, "confirmed zoominfo pic1");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[contains(text(),'Confirmed Apps')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Revert Apps']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[text()='Revert']")).click();
		Thread.sleep(35000);
		m.takePageScreenshot_onPass(driver, "confirmed zoominfo pic2");
		driver.navigate().refresh();
		Thread.sleep(9000);	
		try {
			driver.findElement(By.xpath("(//div[contains(text(),'New App')])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(multiapp);
			Thread.sleep(9000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		m.takePageScreenshot_onPass(driver, "confirmed zoominfo pic3");
		driver.close();
	}
	public void multipleappreject_revert() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(multiapp);
		Thread.sleep(9000);	

		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		m.takePageScreenshot_onPass(driver, "rejected zoominfo pic0");
		// -gettext
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[text()='Reject Apps']")).click();
		Thread.sleep(3000);	
		m.takePageScreenshot_onPass(driver, "rejected zoominfo pic1");
		Thread.sleep(3000);	
		//
		driver.findElement(By.xpath("(//div[contains(text(),'Rejected Apps')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Revert Apps']")).click();
		Thread.sleep(3000);	
		//driver.findElement(By.xpath("//button[text()='Revert']")).click();

		m.takePageScreenshot_onPass(driver, "rejected zoominfo revert pic2");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//div[contains(text(),'New App')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys(multiapp);
		Thread.sleep(9000);	
		m.takePageScreenshot_onPass(driver, "rejected zoominfo revert pic3");
		driver.close();
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
	public void transactionupload_download() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		Actions act=new Actions(driver);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[text()='Transactions'])[1]"))));
		driver.findElement(By.xpath("(//*[text()='Transactions'])[1]")).click();
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[text()='Download Template'])[1]"))));
		//driver.findElement(By.xpath("(//*[text()='Download Template'])[1]")).click();
		Thread.sleep(3000);
		m.takePageScreenshot_onPass(driver, "trans template download pic1");	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Upload File']")).click();
		Thread.sleep(3000);
		
		//invalid file
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(transactioninvalidfile);
		Thread.sleep(6000);
		m.takePageScreenshot_onPass(driver, "trans template upload invalid pic1");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Download Failed File']")).click();
		Thread.sleep(6000);
		act.sendKeys(Keys.ESCAPE);
		act.build().perform();
		//valid file

		try {
			driver.findElement(By.xpath("//*[text()='Upload File']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(transactionvalidfile);
		Thread.sleep(6000);
		m.takePageScreenshot_onPass(driver, "trans template upload pic1");	
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Your file is ready for processing']/following::div[text()='Process']"))));
		driver.findElement(By.xpath("//*[text()='Your file is ready for processing']/following::div[text()='Process']")).click();
		Thread.sleep(4000);
		m.takePageScreenshot_onPass(driver, "trans template upload pic2");	
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[text()='CE Transaction Template.csv'])[1]"))));
		act.click(driver.findElement(By.xpath("(//*[text()='CE Transaction Template.csv'])[1]")));
		act.build().perform();
		for(int j=1;j<14;j++)
		{
			act.sendKeys(Keys.ARROW_RIGHT);
			act.build().perform();
		}
		Thread.sleep(1000);
		m.takePageScreenshot_onPass(driver, "trans template upload pic3");	
		Thread.sleep(1000);


	}
	public void vendormetadata() throws InterruptedException
	{

		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(40));
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Vendor Metadata']"))));
		driver.findElement(By.xpath("//*[text()='Vendor Metadata']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Download Existing Vendor List']")).click();
		Thread.sleep(11000);

		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Upload File']"))));
		driver.findElement(By.xpath("//*[text()='Upload File']")).click();
		Thread.sleep(3000);
		//invalid file
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(invalidvendorfile);
		Thread.sleep(6000);
		m.takePageScreenshot_onPass(driver, "vendor template upload invalid pic1");	
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//p[text()='File format is invalid, please use the template and try again']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		act.sendKeys(Keys.ESCAPE);
		act.build().perform();
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Upload File']"))));
		driver.findElement(By.xpath("//*[text()='Upload File']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(validvendorfile);
	Thread.sleep(6000);
	m.takePageScreenshot_onPass(driver, "vendor template upload pic1");	
	Thread.sleep(1000);
	wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Your file is uploaded successfully']/following::div[text()='Process']"))));
	driver.findElement(By.xpath("//*[text()='Your file is uploaded successfully']/following::div[text()='Process']")).click();
	Thread.sleep(4000);
	m.takePageScreenshot_onPass(driver, "vendor template upload pic2");	
	Thread.sleep(1000);
	}
}
