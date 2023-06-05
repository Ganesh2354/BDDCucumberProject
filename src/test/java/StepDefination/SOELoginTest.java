package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SOELoginTest {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(5000);
		
	}

	@Given("user enter {string} and {string}")
	public void user_enter_and(String email, String pass) throws Exception {
	   
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
		Thread.sleep(3000);	
	}
	
	@Given("user clicklogin button")	
	public void user_clickslogin_button() throws Exception
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
