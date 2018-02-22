package com.Test.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicsetup {

	WebDriver driver;

@ BeforeMethod
public void setup() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.half.ebay.com");
}
@Test
public void getTitle() {
String title = driver.getTitle();
System.out.println(title);

}
@ AfterMethod
public void teardown() {
	driver.quit();

	
}
}