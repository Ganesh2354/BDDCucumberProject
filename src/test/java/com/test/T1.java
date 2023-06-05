package com.test;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	
	public void t1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebDriverWait waits=new WebDriverWait(driver,25);
		waits.until(ExpectedConditions.visibilityOfElementLocated(null));
		
	//	String tab=Keys.chord(Keys.CONTROL, Keys.RETURN);
		
//		WebElement log=driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]"));
//		String color=log.getAttribute("href");
//		log.sendKeys(tab);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByxpath('//input[@name=email').value='test@123'");
		
//		Actions act=new Actions(driver);
//		act.keyDown(Keys.CONTROL).sendKeys("t");
//		log.sendKeys(color);
		
		
		
		
		
		
//		Actions act=new Actions(driver);
//		System.out.println("clicking ctrl");
//		act.keyDown(Keys.CONTROL).build().perform();
//		System.out.println("clicked ctrl");
//		System.out.println("clicking shift");
//		act.keyDown(Keys.SHIFT).build().perform();
//		System.out.println("clicked shift");
//		System.out.println("sending n");
//		act.sendKeys("n").build().perform();
//		System.out.println("send n");
//		
//		act.keyUp(Keys.CONTROL).build().perform();
//		act.keyUp(Keys.SHIFT).build().perform();
		
	}

}




