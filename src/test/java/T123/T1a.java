package T123;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1a {
	WebDriver driver;
	
	@BeforeTest	
	public void launchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.get("http://interon-qa.s3-website-us-east-1.amazonaws.com/");
		Thread.sleep(2000);
	}
	@Test	
	public void verifyLoginPageLogo() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//verify logo is present
		if(driver.findElement(By.xpath("//button[@class='mat-focus-indicator fuse-mat-button-large w-full mt-6 ng-tns-c211-1 mat-flat-button mat-button-base mat-primary']")).isDisplayed())
		{
			System.out.println("logo displayed. Verification passed");
		}
		
		else {
			Assert.assertTrue(false, "Logo is not displayed");
		}
		
	}

	@Test(dependsOnMethods="verifyLoginPageLogo")	
	public void verifyLoginFunctionality() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//button[@class='mat-focus-indicator fuse-mat-button-large w-full mt-6 ng-tns-c211-1 mat-flat-button mat-button-base mat-primary']")).isEnabled())
		{		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@interon.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator fuse-mat-button-large w-full mt-6 ng-tns-c211-1 mat-flat-button mat-button-base mat-primary']")).click();
		}
	}
	
	@Test(dependsOnMethods="verifyLoginFunctionality")		
	public void verifyLoginSuccess()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String expected=" admin ";		
		String actual=driver.findElement(By.xpath("//div[text()=' admin ']")).getText();
	    SoftAssert verify=new SoftAssert();
	    
		if(expected.equals(actual))
		{
			System.out.println("logged in successfully");
		}
		else {
			verify.assertTrue(false, "text not matched");
		}
	}
	
	@Test(dependsOnMethods="verifyLoginSuccess")
	public void verifyLeftVerticalBarOptions()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		int num=1;
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='fuse-vertical-navigation-item-title-wrapper ng-star-inserted']/div/span"));
		Iterator<WebElement> it=options.iterator();
		while(it.hasNext())
		{
			System.out.println("The "+num+" element in the side bar is : "+it.next().getText());
		}
	}
	
	@Test(dependsOnMethods="verifyLeftVerticalBarOptions")
	
	public void addUser()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//span[text()=' Add User ']")).isDisplayed())
		{
			
			// enter email
			driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("admin123@interon.com");
			//enter password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin12");
			//re-enter password
			driver.findElement(By.xpath("//input[@placeholder='reEnterPassword']")).sendKeys("admin12");
			//enter Employee ID
			driver.findElement(By.xpath("//input[@placeholder='Employee ID']")).sendKeys("DGAInd12345");
			//enter user-name
			driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Ganesh123");
			//enter phone number
			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
			
			
			//select roles
			
			driver.findElement(By.xpath("//div[@id='mat-select-value-5']")).click();
			
			List<WebElement> allChkBox=driver.findElements(By.xpath("//mat-pseudo-checkbox"));
			
			Iterator<WebElement> it=allChkBox.iterator();
			while(it.hasNext())
			{
				it.next().click();
			}
			
			//Enter first-nme			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mohan");
			//Last Name 
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Verma");
			//enter Gender
			driver.findElement(By.xpath("//input[@placeholder='Gender']")).sendKeys("Male");
			//ennter Address1
			driver.findElement(By.xpath("//input[@placeholder='Address1']")).sendKeys("Gurugram,India");
			//enter address2
			driver.findElement(By.xpath("")).sendKeys("India");
	
		}
	}
	
	
	
	
	
	
	
	@AfterTest
	
	public void closeBrowser() throws Exception
	{
		Thread.sleep(7000);
		driver.close();
	}
	
	
	
}
