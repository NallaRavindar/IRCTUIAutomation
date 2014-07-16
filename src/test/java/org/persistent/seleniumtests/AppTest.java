package org.persistent.seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void loginTest(){
    	
    	WebDriver dr = new FirefoxDriver();
    	dr.get("https://www.google.co.in");
    	Assert.assertTrue(true);
    	Reporter.log("Opend the google page.");
    	System.out.println("Opend the google page.");
    	
    	dr.quit();
    }
}
