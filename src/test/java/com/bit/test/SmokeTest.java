package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest 
{
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.bluefly.com");

		driver.findElement(By.xpath("//li[@id='main-nav-men']/a")).click();
		driver.findElement(By.xpath("//*[@id='departmentLeftNaviContainer']/div[1]/ul[1]/li[3]/a")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}
	

}
