package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableLoginTest {
	WebDriver driver;

@Given("user comesto loginpage")
public void user_comesto_loginpage() throws Exception {
   
	WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(5000);
	   driver.switchTo().frame(0);
}

@Then("user will enter email and pass")
public void user_will_enter_email_and_pass(DataTable dataTable) throws Exception {
	
	List<List<String>> data=dataTable.cells();
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(data.get(0).get(1));
	Thread.sleep(3000);
	
}

@Then("user will click on login button")
public void user_will_click_on_login_button() throws Exception {
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(10000);
	driver.close();
}
	
	

}
