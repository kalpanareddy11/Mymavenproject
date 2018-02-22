package com.Test.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterannotationtest {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"URL"})
	public void setup(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(URL);

	}
		
			
	
@ Test
@Parameters({"Email", "password"})
    public void parameterTest(String Email,String password) {
	driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys(Email);
	driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	
}
	
 @AfterMethod
	public  void teardown() {
		driver.quit();
	
	
	
}


}
