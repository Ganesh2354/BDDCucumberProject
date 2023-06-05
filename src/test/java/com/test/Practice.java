package com.test;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

//	@DataProvider
//	public Object[][] Testdata()
//	{
//		Object[][] o= new Object[2][2];
//		o[0][0]="test1";
//		o[0][1]="test2";
//		o[1][0]="test3";
//		o[1][1]="test4";
//		return o;
//	}
	
	@Test
	public void t1() throws Exception
	{	
		String un="life";
		String pa="web";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://"+un+":"+pa+"@"+"donor.dev1.lifeweb.ca/admin/?import_db=0&staging=keep"+"@"+un+":"+"pa");
		Thread.sleep(3000);

		
		
//		DevTools devtool=((ChromeDriver)driver).getDevTools();
//		devtool.createSession();
//		devtool.send(Network.enable(null, null, null));	
//		Map<String, Object> header=new HashMap<String, Object>();		
//		String auth="Basic "+new String(new Base64().encode(String.format("%s:%s", un,pa).getBytes()));	
//		header.put("Authorization", auth);
//		
//		devtool.send(Network.setExtraHTTPHeaders(new Headers(header)));
		
		
//		Alert alrt=driver.switchTo().alert();
//		Actions act=new Actions(driver);
//		alrt.sendKeys("list");
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
//		alrt.sendKeys("web");
//		System.out.println(s1);
//		System.out.println(s2);
	}
	
	
	
}
