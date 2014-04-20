package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest 
{
	WebDriver driver;
	
	
		@Before
		public void open()
		{
			driver= new FirefoxDriver();
		}
		
	
	@After
	public void end()
	{
		driver.quit();
		
	}
	

}
