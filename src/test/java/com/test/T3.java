package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.test.ListenerOfTests.class)

public class T3 {
	
	@DataProvider(name="LoginData")
	
	public Object[] [] loginCredentials()
	{
		Object[][] obj= {
			
				{"test1@123", "1234"}
//				{"test2@123", "1234"},
//				{"test3@123", "1234"},
//				{"test4@123", "1234"},
//				{"test5@123", "1234"},
//				{"test6@123", "1234"},
				
		};
		
		return obj;
	}
	
	
	
	
	@Test(dataProvider="LoginData")	
	public void loginWithMultipleData(String userID, String pass)
	{
		
		System.out.println("Entering the user ID : "+userID+" | "+Thread.currentThread().getName());
		System.out.println("Entering the Password : "+pass+" | "+Thread.currentThread().getName());
		
		
	}
	
	@Test
	
	public void testFunctionality()
	{
		try {
			Thread.sleep(2000);
			System.out.println("Clicked on view link |"+Thread.currentThread().getName());
			System.out.println("opened view link |"+Thread.currentThread().getName());
			System.out.println("testing done view link |"+Thread.currentThread().getName());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	

}
