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
