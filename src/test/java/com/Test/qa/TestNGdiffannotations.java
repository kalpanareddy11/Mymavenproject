package com.Test.qa;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGdiffannotations {
	
	
	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();

@BeforeMethod
public void setup() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.freecrm.com/index.html");

}
	
/*@Test
	public void getTitle() {
	String title = driver.getTitle();
	System.out.println("title");
	softassert.assertEquals("title", "CRMPRO");
	
		
	}*/

@Test
       public void Forgetpassword() {
	
	driver.findElement(By.xpath("/html/body/div[2]/div/a[2]/button")).click();
	 
		
//	driver.findElement(By.xpath("//input[@type='text' and @placeholder='Login']")).sendKeys("naveenk");
//	
//	driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("test@123");
//	
//	driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']")).click();
//	
}
	
//@Test
//	public void Login() {
//		
//    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
//	
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
//	driver.switchTo().frame(0);
//	driver.findElement(By.xpath("//a[@title='Tasks']")).click();
//	driver.findElement(By.xpath("//input[@name='cs_keyword' ]")).sendKeys("urgent");
//	boolean b = driver.findElement(By.xpath("//input[@name='cs_submit' and @type='submit']")).isDisplayed();
//	System.out.println(b);
//	Assert.assertEquals(b, true);
//	boolean b1 = driver.findElement(By.xpath("//input[@name='cs_submit' and @type='submit']")).isEnabled();
//	System.out.println(b1);
//	Assert.assertEquals(b1, true);
//	driver.findElement(By.xpath("//input[@name='cs_submit' and @type='submit']")).click();
//	}
//	

	


//@Test
//
//public void getheaderusertext() {
//	
//	
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
//	
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
//	String text= driver.findElement(By.xpath("//td[@class='headertext' and @align='left']")).getText();
//	System.out.println("text");
//	softassert.assertEquals("text", "User: Naveen K");
//	
//}

	
//@AfterMethod
//	public void teardown() {
//		
//		driver.quit();
//}


}