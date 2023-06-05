package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	

@Given("user launched url and went to login page")
public void user_launched_url_and_went_to_login_page() throws Exception {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   Thread.sleep(5000);
	
	
	
	
}

@Then("user enters email or mob numb")
public void user_enters_email_or_mob_numb() throws Exception {
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cucumberTest@123");
	Thread.sleep(3000);
}

@Then("user enters password")
public void user_enters_password() throws Exception {
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("cucumberTest@123");
	Thread.sleep(3000);
}

@Then("user clicks on login button")
public void user_clicks_on_login_button() throws Exception {
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(10000);
	driver.close();
}
	
	
	
	
	
	
	
	

}
