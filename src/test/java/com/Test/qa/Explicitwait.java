package com.Test.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitwait {
	
 WebDriver driver;
//WebDriverWait wait=new WebDriverWait(driver,20);
	
	
	@Test
	public void Explicit() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkart\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
	
		clickOn(driver,driver.findElement(By.xpath("//input[@id='u_0_2']")),20);
		
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='u_0_2']")));

                //element.findElement(By.xpath("//input[@type='email']"));
}
@Test
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	
}
}
