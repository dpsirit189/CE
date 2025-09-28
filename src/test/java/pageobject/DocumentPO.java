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
	String invoicefile=System.getProperty("user.dir")+"/documentuploads/ARInvoice INV INV207379.pdf";
	String invoicefile2=System.getProperty("user.dir")+"/documentuploads/2023-2025 LVT - Sendoso Order Form-MSA.pdf";
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
	public void verifyactivecontract() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
			//Thread.sleep(11000);	
		
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Search Contract']"))));
		 Thread.sleep(2000);	
		String totalcontract= driver.findElement(By.xpath("//input[@placeholder='Search Contract']/following::p[2]")).getText().toString();
			m.takePageScreenshot_onPass(driver,"pic1"+totalcontract);
			ExtentCucumberAdapter.addTestStepLog(" total contracts "+totalcontract);
			Thread.sleep(2000);	
			
			driver.findElement(By.xpath("//*[text()='Active Contracts']")).click();
			Thread.sleep(3000);	
			String activecontract= driver.findElement(By.xpath("//input[@placeholder='Search Contract']/following::p[2]")).getText().toString();
			
			ExtentCucumberAdapter.addTestStepLog(" total contracts "+activecontract);
			m.takePageScreenshot_onPass(driver,"pic2"+totalcontract);
			Thread.sleep(5000);	
			driver.close();
	}
	public void upload_doc_manual(String doctype) throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
			//Thread.sleep(11000);	
			 
		driver.findElement(By.xpath("//*[text()='Upload Documents']")).click();
		Thread.sleep(3000);	
		
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(destination);
		Thread.sleep(12000);	
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Cancel']"))));
			//driver.findElement(By.xpath("//button[text()='Cancel']")).click();
			Thread.sleep(6000);	
			
		//	driver.findElement(By.xpath("//*[text()='Vendor Name']/following::span[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("test vendor");
					Thread.sleep(3000);	
					act.sendKeys(Keys.ARROW_DOWN);
					act.build().perform();
					act.sendKeys(Keys.ENTER);
					act.build().perform();
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//input[@name='renewalDate']")).sendKeys("09-30-25 "+Keys.ENTER);
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//input[@name='sourceContractValue']")).sendKeys("4000");
					Thread.sleep(1000);
			
				//	driver.findElement(By.xpath("//button[text()='Save']")).click();
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//*[text()='Add Line Item']")).click();  //line1
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//tr[2]/td[2]")).click();
					Thread.sleep(2000);	
//					driver.findElement(By.xpath("//div[text()='Service']")).click();
//					Thread.sleep(2000);	
					driver.findElement(By.xpath("//div[text()='App']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//input[@name='description']")).sendKeys("desc");
					Thread.sleep(2000);
					act.sendKeys(Keys.TAB);
					act.build().perform();
					Thread.sleep(1000);
				//	driver.findElement(By.xpath("(//input[@name='description'])[1]/following::input[1]")).sendKeys("all"+Keys.ARROW_DOWN+Keys.ENTER);
					
							//act.sendKeys(driver.findElement(By.xpath("(//input[@name='description'])[1]/following::input[1]")),"");
					act.sendKeys(Keys.ENTER);
					act.build().perform();
					Thread.sleep(2000);
							act.build().perform();
							act.sendKeys(Keys.ARROW_DOWN);
							act.build().perform();
							Thread.sleep(2000);
							act.sendKeys(Keys.ENTER);
							act.build().perform();
							
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
					ExtentCucumberAdapter.addTestStepLog("line1 total "+pl1tot);
					ExtentCucumberAdapter.addTestStepLog("line2 total "+pl2tot);
					int pfinaltotper=pl1tot+pl2tot;
					System.out.println("total after percent discount"+pfinaltotper);
					ExtentCucumberAdapter.addTestStepLog("total after percent discount"+pfinaltotper);
					String grandpercenttotal=driver.findElement(By.xpath("//h7[contains(text(),'Total Amount')]")).getText();
					
					grandpercenttotal = grandpercenttotal.replaceAll("\\D+","");
					System.out.println("grand total percent displayed "+grandpercenttotal);
					ExtentCucumberAdapter.addTestStepLog("grand total "+grandpercenttotal);
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//button[text()='Save']")).click();
					Thread.sleep(5000);	
					m.takePageScreenshot_onPass(driver, "saved manual upload doc dsp pic1");
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//button[text()='Cancel']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//input[@placeholder='Search Unpublished Documents']")).sendKeys("test vendor");
					Thread.sleep(1000);
					
							act.click(driver.findElement(By.xpath("(//span[text()='TEST Vendor Demo - TestUpdate'])[1]")));
							act.build().perform();
							Thread.sleep(1000);
							for(int j=1;j<30;j++)
							{
							act.sendKeys(Keys.ARROW_RIGHT);
							act.build().perform();
							}
							Thread.sleep(1000);
							m.takePageScreenshot_onPass(driver, "unpublished manual doc dsp pic2");
							Thread.sleep(1000);	
								driver.close();
	}
	public void manual_edit_lineaftersave() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
		 Thread.sleep(2000);	
		 
				 driver.findElement(By.xpath("(//*[contains(text(),'Unpublished Docs')])[1]")).click();
					Thread.sleep(7000);	
			driver.findElement(By.xpath("//input[@placeholder='Search Unpublished Documents']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			driver.findElement(By.xpath("//input[@placeholder='Search Unpublished Documents']")).sendKeys("test vendor");
			Thread.sleep(1000);
			//Thread.sleep(11000);	
		 driver.findElement(By.xpath("(//span[text()='2023 - HOMEVIEW TECHNOLOGIES.pdf'])[1]")).click();
			Thread.sleep(12000);	
			driver.findElement(By.xpath("(//input[@name='description'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@name='description'])[1]")).sendKeys("line1 edited");
			driver.findElement(By.xpath("(//input[@name='sourceUnitPrice'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@name='sourceUnitPrice'])[1]")).sendKeys("82");
			Thread.sleep(1000);
			for(int j=1;j<6;j++)
			{
			act.sendKeys(Keys.TAB);
			act.build().perform();
			}
			String totl1str=driver.findElement(By.xpath("(//input[@name='amount'])[1]")).getAttribute("value");
			int l1tot=Integer.parseInt(totl1str);
			String totl2str=driver.findElement(By.xpath("(//input[@name='amount'])[2]")).getAttribute("value");
			int l2tot=Integer.parseInt(totl2str);
			int finaltotdollar=l1tot+l2tot;
			m.takePageScreenshot_onPass(driver, "HOMEVIEW after edit line1");
			System.out.println("dollar total "+finaltotdollar);
			ExtentCucumberAdapter.addTestStepLog("dollar total "+finaltotdollar);
			String grandpercenttotal=driver.findElement(By.xpath("//h7[contains(text(),'Total Amount')]")).getText();
			
			grandpercenttotal = grandpercenttotal.replaceAll("\\D+","");
			
			ExtentCucumberAdapter.addTestStepLog("grand total "+grandpercenttotal);
			driver.close();
					 
	}
	public void delete_lines_extract() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
		 Thread.sleep(2000);	
		 
				 driver.findElement(By.xpath("(//*[contains(text(),'Unpublished Docs')])[1]")).click();
					Thread.sleep(7000);	
			driver.findElement(By.xpath("//input[@placeholder='Search Unpublished Documents']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			driver.findElement(By.xpath("//input[@placeholder='Search Unpublished Documents']")).sendKeys("test vendor");
			Thread.sleep(1000);
			//Thread.sleep(11000);	
		 driver.findElement(By.xpath("(//span[text()='2023 - HOMEVIEW TECHNOLOGIES.pdf'])[1]")).click();
			Thread.sleep(12000);	
		
			 driver.findElement(By.xpath("//tr[2]/td[13]/span")).click();
			 Thread.sleep(1000);
			 m.takePageScreenshot_onPass(driver, "delete_lines_extract");
		//button[text()='Extract Data']
		//button[text()='Proceed']
	}
	public void uploadinvoice() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		 Actions act=new Actions(driver);
			//Thread.sleep(11000);	
			 
		driver.findElement(By.xpath("//*[text()='Upload Documents']")).click();
		Thread.sleep(3000);	
		
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(invoicefile2);
		Thread.sleep(12000);	
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Cancel']"))));
			//driver.findElement(By.xpath("//button[text()='Cancel']")).click();
			Thread.sleep(5000);	
			driver.findElement(By.xpath("//input[@value='INVOICE']")).click();
			Thread.sleep(3000);	
			
			
		//	driver.findElement(By.xpath("//*[text()='Vendor Name']/following::span[1]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("vantage");
					Thread.sleep(3000);	
					act.sendKeys(Keys.ENTER);
					act.build().perform();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='dueDate']")).sendKeys("30/09/25"+Keys.ENTER);
					Thread.sleep(1000);	
					driver.findElement(By.xpath("//input[@name='sourceTotalAmount']")).sendKeys("4000");
					Thread.sleep(1000);
			
				//	driver.findElement(By.xpath("//button[text()='Save']")).click();
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//*[text()='Add Line Item']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//tr[2]/td[2]")).click();
					Thread.sleep(2000);	
//					driver.findElement(By.xpath("//div[text()='Service']")).click();
//					Thread.sleep(2000);	
					driver.findElement(By.xpath("//div[text()='App']")).click();
					Thread.sleep(2000);	
					driver.findElement(By.xpath("//input[@name='description']")).sendKeys("desc");
					Thread.sleep(2000);
					act.sendKeys(Keys.TAB);
					act.build().perform();
					Thread.sleep(3000);
				//	driver.findElement(By.xpath("(//input[@name='description'])[1]/following::input[1]")).sendKeys("all"+Keys.ARROW_DOWN+Keys.ENTER);
					
							act.sendKeys(driver.findElement(By.xpath("(//input[@name='description'])[1]/following::input[1]")),"vantage");
							act.build().perform();
							Thread.sleep(4000);
							act.sendKeys(Keys.ARROW_DOWN);
							act.build().perform();
							act.sendKeys(Keys.ENTER);
							act.build().perform();
							
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
							for(int j=1;j<7;j++)
							{
							act.sendKeys(Keys.TAB);
							act.build().perform();
							}
							String totl1str=driver.findElement(By.xpath("(//input[@name='amount'])[1]")).getAttribute("value");
							int l1tot=Integer.parseInt(totl1str);
							String totl2str=driver.findElement(By.xpath("(//input[@name='amount'])[2]")).getAttribute("value");
							int l2tot=Integer.parseInt(totl2str);
							int finaltotdollar=l1tot+l2tot;
							m.takePageScreenshot_onPass(driver, "invoice pic1");
							System.out.println("dollar total "+finaltotdollar);
							ExtentCucumberAdapter.addTestStepLog("Invoice dollar total "+finaltotdollar);
							String grandpercenttotal=driver.findElement(By.xpath("//h7[contains(text(),'Total Amount')]")).getText();
							
							grandpercenttotal = grandpercenttotal.replaceAll("\\D+","");
							
							ExtentCucumberAdapter.addTestStepLog("Invoice grand total "+grandpercenttotal);
	}
	
	public void publish() throws InterruptedException
	{
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[text()='Publish']")).click();
		Thread.sleep(3000);	
		m.takePageScreenshot_onPass(driver, "publish invoice pic1");
		try {
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		Thread.sleep(1000);	
		try {
			driver.findElement(By.xpath("//button[text()='Publish']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		Thread.sleep(4000);	
		m.takePageScreenshot_onPass(driver, "publish invoice pic1");
		driver.navigate().refresh();
	}
	public void editpublish_invoice() throws InterruptedException
	{
		
				Thread.sleep(4000);	
				 Actions act=new Actions(driver);
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Invoices'])[1]")));
				driver.findElement(By.xpath("(//*[text()='Invoices'])[1]")).click();
				
				//	driver.navigate().to("https://somecorp-charlie.cloudeagle.us/app/documents/invoices");
				Thread.sleep(10000);	
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Invoice']")));
				driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			//	driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys("inv207");
				if(uploadedfile.equals("sendoso"))
				{
					System.out.println("file is sendoso");
				driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys("Sendoso Order");
				}
				else
				{
					System.out.println("file is inv");
					driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys("inv207");
					
				}
				Thread.sleep(9000);
				
				driver.findElement(By.xpath("//h7[text()='Line Item View']/preceding::button[1]")).click();
				Thread.sleep(9000);	
				driver.findElement(By.xpath("(//span[contains(text(),'Sendoso')])[1]/following::button[1]")).click();
				Thread.sleep(2000);	
				
//				act.click(driver.findElement(By.xpath("(//span[text()='Vantage Software'])[1]")));
//				act.build().perform();
				Thread.sleep(1000);
				
						driver.findElement(By.xpath("(//span[contains(text(),'Sendoso')])[1]/following::input[2]")).sendKeys(" edited desc");
						Thread.sleep(1000);
						act.sendKeys(Keys.TAB);
						act.build().perform();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath("//input[@widgetid='licensedBought']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
						driver.findElement(By.xpath("//input[@widgetid='licensedBought']")).sendKeys("100");
				
				Thread.sleep(1000);
				m.takePageScreenshot_onPass(driver, "publish manual invoice doc edit pic1");
				Thread.sleep(1000);	
				driver.findElement(By.xpath("(//span[text()='Vantage Software'])[1]/following::button[1]")).click();
				Thread.sleep(2000);
				m.takePageScreenshot_onPass(driver, "publish manual invoice doc edit pic2");
				Thread.sleep(1000);	
				driver.close();
	}
	public void extractdata() throws InterruptedException
	{
		Thread.sleep(2000);	
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(195));
		 Actions act=new Actions(driver);
		driver.findElement(By.xpath("(//*[text()='Invoices'])[1]")).click();
		Thread.sleep(9000);	
		driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
		
	if(uploadedfile.equals("sendoso"))
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys("Sendoso Order");
		Thread.sleep(5000);
				driver.findElement(By.xpath("(//span[text()='2023-2025 LVT - Sendoso Order Form-MSA.pdf'])[1]")).click();
	}
	else
	{driver.findElement(By.xpath("//input[@placeholder='Search Invoice']")).sendKeys("INV207");
	Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='ARInvoice INV INV207379'])[1]")).click();
	}
				Thread.sleep(9000);
		driver.findElement(By.xpath("//button[text()='Extract Data']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		m.takePageScreenshot_onPass(driver, "extract started pic1");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		Thread.sleep(12000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'AI Extraction Done')]")));
		Thread.sleep(1000);
		m.takePageScreenshot_onPass(driver, "extract started pic2");
		Thread.sleep(1000);
		String vcity=driver.findElement(By.xpath("//*[@name='vendorCity']")).getAttribute("value").toString();
		//*[@name='vendorCity']  get value
		//*[@name='invoiceDate']
		String invoiceDate=driver.findElement(By.xpath("//*[@name='invoiceDate']")).getAttribute("value").toString();
		//*[@name='invoiceNumber']
		String invoiceNumber=driver.findElement(By.xpath("//*[@name='invoiceNumber']")).getAttribute("value").toString();
		//*[@name='dueDate']
		String dueDate=driver.findElement(By.xpath("//*[@name='dueDate']")).getAttribute("value").toString();
		//*[@name='sourceTotalAmount']
		String sourceTotalAmount=driver.findElement(By.xpath("//*[@name='sourceTotalAmount']")).getAttribute("value").toString();
	//	
		String description=driver.findElement(By.xpath("(//*[@name='description'])[2]")).getAttribute("value").toString();
		ExtentCucumberAdapter.addTestStepLog("vendor city "+vcity);
		ExtentCucumberAdapter.addTestStepLog("vendor invoiceDate "+invoiceDate);
		ExtentCucumberAdapter.addTestStepLog("vendor invoiceNumber "+invoiceNumber);
		ExtentCucumberAdapter.addTestStepLog("vendor dueDate "+dueDate);
		ExtentCucumberAdapter.addTestStepLog("vendor sourceTotalAmount "+sourceTotalAmount);
		ExtentCucumberAdapter.addTestStepLog("vendor desc "+description);
		if(uploadedfile.equals("sendoso"))
		{
			Thread.sleep(1000);
			String l1license=driver.findElement(By.xpath("(//*[@name='licensedBought'])[1]")).getAttribute("value");
			String l1unitprice=driver.findElement(By.xpath("(//*[@name='sourceUnitPrice'])[1]")).getAttribute("value");
			String l1discount=driver.findElement(By.xpath("(//*[@name='discount'])[1]")).getAttribute("value");
			String l1total=driver.findElement(By.xpath("(//*[@name='amount'])[1]")).getAttribute("value");
			assertEquals("1", l1license);
			assertEquals("40000", l1unitprice);
			assertEquals("48", l1discount);
			assertEquals("20798.75", l1total);
			//line2
			String l2license=driver.findElement(By.xpath("(//*[@name='licensedBought'])[2]")).getAttribute("value");
			String l2unitprice=driver.findElement(By.xpath("(//*[@name='sourceUnitPrice'])[2]")).getAttribute("value");
			String l2discount=driver.findElement(By.xpath("(//*[@name='discount'])[2]")).getAttribute("value");
			String l2total=driver.findElement(By.xpath("(//*[@name='amount'])[2]")).getAttribute("value");
			assertEquals("40", l2license);
			assertEquals("27840", l2unitprice);
			assertEquals("31.03", l2discount);
			assertEquals("19201.25", l2total);
			
			driver.findElement(By.xpath("//h7[text()='Vendor Name']/following::input[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
			driver.findElement(By.xpath("//h7[text()='Vendor Name']/following::input[1]")).sendKeys("sendoso");
			
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER);
			act.build().perform();
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath("//button[text()='Confirm']")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
			driver.findElement(By.xpath("(//input[@name='description'])[1]/following::span[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='description'])[1]/following::input[@type='search'][1]")).sendKeys("sendoso");
			
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER);
			act.build().perform();
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath("//button[text()='Confirm']")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
		}
		else {
		assertTrue("city", vcity.equals("South Jordan"));
		assertTrue("invoiceDate", invoiceDate.equals("01/12/22"));
		assertTrue("invoiceNumber", invoiceNumber.equals("INV207379"));
		assertTrue("sourceTotalAmount", sourceTotalAmount.equals("56103.39"));
		}
		act.click(driver.findElement(By.xpath("(//*[@name='description'])[2]")));
		act.build().perform();
		Thread.sleep(1000);
		for(int x=1;x<=10;x++)
		{
			act.sendKeys(Keys.TAB);
			act.build().perform();
			
		}
		String l1tot=driver.findElement(By.xpath("(//input[@name='amount'])[1]")).getAttribute("value").toString();
		String l2tot=driver.findElement(By.xpath("(//input[@name='amount'])[2]")).getAttribute("value").toString();
		//String l3tot=driver.findElement(By.xpath("(//input[@name='amount'])[3]")).getAttribute("value").toString();
		double l1=Double.parseDouble(l1tot);
		double l2=Double.parseDouble(l2tot);
	//	double l3=Double.parseDouble(l3tot);
		double total=l1+l2;
		ExtentCucumberAdapter.addTestStepLog("expected total "+total);
		Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@name='licensedBought'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
				driver.findElement(By.xpath("(//input[@name='licensedBought'])[1]")).sendKeys("5");
				 Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@name='sourceUnitPrice'])[1]")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
				driver.findElement(By.xpath("(//input[@name='sourceUnitPrice'])[1]")).sendKeys("120");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[text()='Publish']")).click();
				Thread.sleep(1000);
		//assertTrue("dueDate", dueDate.equals("01/12/22"));
		//driver.close();
		 
		
	}
}
