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

public class DocumentPO extends LandingPage{
	String destination=System.getProperty("user.dir")+"/documentuploads/2023 - HOMEVIEW TECHNOLOGIES.pdf";
	public DocumentPO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void navigate_document() throws InterruptedException
	{
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//label[text()='Documents']")).click();
		Thread.sleep(5000);	
	}
	public void upload_doc_manual(String doctype) throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
			//Thread.sleep(11000);	
			 
		driver.findElement(By.xpath("//button/h7[text()='Upload Documents']")).click();
		Thread.sleep(3000);	
		
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(destination);
		Thread.sleep(12000);	
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Cancel']"))));
			//driver.findElement(By.xpath("//button[text()='Cancel']")).click();
			Thread.sleep(5000);	
			
			driver.findElement(By.xpath("//*[text()='Vendor Name']/following::span[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("test vendor"+Keys.ENTER);
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//input[@name='renewalDate']")).sendKeys("30/09/25");
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//input[@name='sourceContractValue']")).sendKeys("4000");
					Thread.sleep(1000);
			
				//	driver.findElement(By.xpath("//button[text()='Save']")).click();
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//*[text()='Add Line Item']")).click();  //line1
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//tr[2]/td[2]")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//div[text()='Service']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//input[@name='description']")).sendKeys("desc");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//tr[2]/td[7]")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//*[@name='licensedBought']")).sendKeys("10");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@name='sourceUnitPrice']")).sendKeys("72");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@name='sourceUnitPrice']/following::input[1]")).sendKeys("/month"+Keys.ENTER);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@name='discount']")).sendKeys("50");
					Thread.sleep(1000);
					//line2
					driver.findElement(By.xpath("//*[text()='Add Line Item']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//tr[3]/td[2]")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("(//div[text()='Tax'])[2]")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("(//input[@name='description'])[2]")).sendKeys("description");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//tr[3]/td[6]")).click();
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//tr[3]/td[6]//input[@type='search']")).sendKeys("test2");
					Thread.sleep(8000);
					act.sendKeys(Keys.ENTER);
					act.build().perform();
					
							driver.findElement(By.xpath("(//*[@name='licensedBought'])[2]")).sendKeys("5");
							Thread.sleep(1000);
							driver.findElement(By.xpath("(//*[@name='sourceUnitPrice'])[2]")).sendKeys("50");
							Thread.sleep(1000);
							driver.findElement(By.xpath("(//*[@name='sourceUnitPrice'])[2]/following::input[1]")).sendKeys("/month"+Keys.ENTER);
							Thread.sleep(1000);
							driver.findElement(By.xpath("(//*[@name='discount'])[2]")).sendKeys("30");
							Thread.sleep(1000);
					//line3
							Thread.sleep(3000);	
							driver.findElement(By.xpath("//*[text()='Add Line Item']")).click();  //line1
							Thread.sleep(2000);	
							driver.findElement(By.xpath("//tr[4]/td[2]")).click();
							Thread.sleep(2000);	
							driver.findElement(By.xpath("(//div[text()='Discount'])[3]")).click();
							Thread.sleep(2000);	
							driver.findElement(By.xpath("(//input[@name='description'])[3]")).sendKeys("desc");
							Thread.sleep(1000);
							driver.findElement(By.xpath("//tr[4]/td[6]//input[@type='search']")).sendKeys("test2");
							Thread.sleep(8000);
							
							act.sendKeys(Keys.ENTER);
							Thread.sleep(1000);
							act.build().perform();
							act.sendKeys(Keys.TAB);
							act.build().perform();
							act.sendKeys(Keys.TAB);
							act.build().perform();
							act.sendKeys(Keys.TAB);
							act.build().perform();
							Thread.sleep(1000);
							m.takePageScreenshot_onPass(driver, "lines total pic1 dollars");
							Thread.sleep(1000);
							String totl1str=driver.findElement(By.xpath("(//input[@name='amount'])[1]")).getAttribute("value");
							int l1tot=Integer.parseInt(totl1str);
							String totl2str=driver.findElement(By.xpath("(//input[@name='amount'])[2]")).getAttribute("value");
							int l2tot=Integer.parseInt(totl2str);
							int finaltotdollar=l1tot+l2tot;
							System.out.println("dollar total "+finaltotdollar);
							ExtentCucumberAdapter.addTestStepLog("dollar total "+finaltotdollar);
							//h7[contains(text(),'Total Amount')]
							String grandtotal=driver.findElement(By.xpath("//h7[contains(text(),'Total Amount')]")).getText();
							grandtotal = grandtotal.replaceAll("\\D+","");
							System.out.println("grand total dollar displayed "+grandtotal);
							ExtentCucumberAdapter.addTestStepLog("grand total dollar displayed "+grandtotal);
							driver.findElement(By.xpath("(//span[text()='$'])[2]")).click();
							Thread.sleep(2000);	
							act.sendKeys(Keys.ARROW_DOWN);
							act.build().perform();
							act.sendKeys(Keys.ENTER);
							act.build().perform();
							m.takePageScreenshot_onPass(driver, "lines total pic2 percent");
							Thread.sleep(1000);
					String ptotl1str=driver.findElement(By.xpath("(//input[@name='amount'])[1]")).getAttribute("value");
					int pl1tot=Integer.parseInt(ptotl1str);
					String ptotl2str=driver.findElement(By.xpath("(//input[@name='amount'])[2]")).getAttribute("value");
					int pl2tot=Integer.parseInt(ptotl2str);
					int pfinaltotper=pl1tot+pl2tot;
					System.out.println("total after percent discount in line1 "+pfinaltotper);
					ExtentCucumberAdapter.addTestStepLog("total after percent discount in line1 "+pfinaltotper);
					String grandpercenttotal=driver.findElement(By.xpath("//h7[contains(text(),'Total Amount')]")).getText();
					
					grandpercenttotal = grandpercenttotal.replaceAll("\\D+","");
					System.out.println("grand total percent displayed "+grandpercenttotal);
					ExtentCucumberAdapter.addTestStepLog("grand total displayed (line1 in %) "+grandpercenttotal);
							

		//button[text()='Cancel']
		
	}
}
