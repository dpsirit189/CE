package pageobject;

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

public class AdminTabIntegrationPO extends LandingPage{
	
	public AdminTabIntegrationPO() throws IOException {
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
	public void navigatetoadminintegration() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		enter_credentials();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"appBodyContainer\"]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);	
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
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
		Thread.sleep(15000);	
		 // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Integrations']"))));
		try {
			driver.findElement(By.xpath("//*[text()='Integrations']")).click();
			Thread.sleep(7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
			
	}
	public void verifyadmintab() throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			//Thread.sleep(11000);	
			  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Single Sign On']"))));
		driver.findElement(By.xpath("//span[text()='Single Sign On']")).click();
		Thread.sleep(2000);
		
		boolean sso=anybuttonpresent();
		m.takePageScreenshot_onPass(driver, "Single Sign On tab");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Finance Systems']")).click();
		Thread.sleep(3000);
		boolean fs=anybuttonpresent();
		m.takePageScreenshot_onPass(driver, "Finance Systems tab");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Direct Integrations']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "Direct Integrations tab");
		boolean di=anybuttonpresent();
		
		driver.findElement(By.xpath("//span[text()='HRIS']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "HRIS tab");
		boolean hris=anybuttonpresent();
		
		driver.findElement(By.xpath("//span[text()='Contract Management']")).click();
		m.takePageScreenshot_onPass(driver, "Contract mgmnt tab");
		boolean contact=anybuttonpresent();
		
		driver.findElement(By.xpath("//span[text()='Messaging']")).click();
		m.takePageScreenshot_onPass(driver, "messaging tab");
		boolean msg=anybuttonpresent();
		
		driver.findElement(By.xpath("//span[text()='Service Desk']")).click();
		m.takePageScreenshot_onPass(driver, "service desk tab");
		boolean service=anybuttonpresent();
	
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		Thread.sleep(1000);	
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//span[text()='Security']")).click();
		m.takePageScreenshot_onPass(driver, "security tab");
		boolean sec=anybuttonpresent();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='SAM']")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='SAM']"))));
		driver.findElement(By.xpath("//span[text()='SAM']")).click();
		m.takePageScreenshot_onPass(driver, "SAM tab");
		boolean sam=anybuttonpresent();
		Thread.sleep(1000);	
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		act.sendKeys(Keys.ARROW_RIGHT);
		act.build().perform();
		Thread.sleep(2000);	
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Settings']"))));
		driver.findElement(By.xpath("//span[text()='Settings']")).click();
		m.takePageScreenshot_onPass(driver, "Settings tab");
		Thread.sleep(1000);	
		driver.close();
		//boolean setting=anybuttonpresent();
		
	}
	public void viewdownload_instruction() throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			//Thread.sleep(11000);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Single Sign On']"))));
			driver.findElement(By.xpath("//span[text()='Single Sign On']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Direct Integrations']")).click();
			Thread.sleep(2000);
			m.takePageScreenshot_onPass(driver, "Direct Integrations tab");
			boolean di=anybuttonpresent();
			driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys("Zoom");
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//button[text()='Connect'])[1]/preceding::button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@download,'Zoom')])[1]")).click();
			Thread.sleep(2000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		
	}
	public void zoomconnect() throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			//Thread.sleep(11000);	
			  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Single Sign On']"))));
		driver.findElement(By.xpath("//span[text()='Single Sign On']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Direct Integrations']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "Direct Integrations tab");
		boolean di=anybuttonpresent();
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys("Zoom");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Connect'])[1]")).click();
		Thread.sleep(5000);	
			    String parentHandle = driver.getWindowHandle();
			    Object[] windowHandles1=driver.getWindowHandles().toArray();
		        driver.switchTo().window((String) windowHandles1[1]); //say switch to child
		        Thread.sleep(2000);	
		        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(zoomuser);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(zoompass);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()=' Sign In ']")).click();
				Thread.sleep(7000);
				
				
				//        Thread.sleep(2000);	
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Allow']")));
					driver.findElement(By.xpath("//button[text()='Allow']")).click();
					Thread.sleep(6000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				
				}
				try {
					driver.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
				
				}
				 driver.switchTo().window((String) windowHandles1[0]); 
				 Thread.sleep(1000);
				m.takePageScreenshot_onPass(driver, "zoom connected for dsp");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()='Sync Now']/following::div[1]")).click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath("//button[text()='Disconnect']")).click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				Thread.sleep(5000);
				
				driver.close();
		      
		
		
	}
	public void uservoiceconnect(String accesstoken,String subdomain) throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			//Thread.sleep(11000);	
			  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Single Sign On']"))));
		driver.findElement(By.xpath("//span[text()='Single Sign On']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Direct Integrations']")).click();
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "Direct Integrations tab");
		boolean di=anybuttonpresent();
		driver.findElement(By.xpath("//input[@placeholder='Search Applications']")).sendKeys("uservoice");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Connect'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='ACCESS_TOKEN']")).sendKeys(accesstoken);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='SUB_DOMAIN']")).sendKeys(subdomain);
		Thread.sleep(2000);
		m.takePageScreenshot_onPass(driver, "uservoice before connect pic1");
		driver.findElement(By.xpath("(//*[text()='Connect'])[3]")).click();
		Thread.sleep(5000);
		m.takePageScreenshot_onPass(driver, "uservoice after connect pic2");
		Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Sync Now'])[1]"))));
		 driver.findElement(By.xpath("(//button[text()='Sync Now'])[1]")).click();
			Thread.sleep(4000);
			m.takePageScreenshot_onPass(driver, "uservoice after sync pic3");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[text()='Sync Now'])[1]/following::div[1]")).click();
			Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Disconnect']"))));
		
			driver.findElement(By.xpath("//button[text()='Disconnect']")).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Proceed']"))));
			
			
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			Thread.sleep(7000);
			m.takePageScreenshot_onPass(driver, "uservoice disconnected sync pic4");
			Thread.sleep(2000);
			driver.close();
		
	}
	}
