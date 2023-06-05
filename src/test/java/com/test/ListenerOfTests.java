package com.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerOfTests implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		try {
			Thread.sleep(1000);
			
			System.out.println("Test strted : "+result.getName());
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public void onTestSuccess(ITestResult result) {
		try {
			Thread.sleep(1000);
			
			System.out.println("Test Run successfully : "+result.getName());
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void onTestFailure(ITestResult result) {
		try {
			Thread.sleep(1000);
			
			System.out.println("Test failed : "+result.getName());
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		try {
			Thread.sleep(1000);
			
			System.out.println("Test skipped : "+result.getName());
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public void onStart(ITestContext context) {
		try {
			Thread.sleep(1000);
			
			System.out.println("Execution strted...");
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

	public void onFinish(ITestContext context) {
		
		try {
			Thread.sleep(1000);
			
			System.out.println("execution completed...");
			
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
	

}
