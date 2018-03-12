package seleniumPractice;

import util.LaunchPageInChrome;

import java.security.NoSuchAlgorithmException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {
	
	/* CSS Selector Practice
	 * @author - Dhinesh on 11-Mar-2018
	 * Reference website to learn Css selector - http://www.way2automation.com/selenium-webdriver-xpath-vs-css.php
	 */

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		WebElement simpleAlertButton = null, confirmAlertButton = null, promptAlertButton = null;
		
		try {
		//Webelement of simple alert
		simpleAlertButton = driver.findElementByCssSelector("button[onclick='pushAlert()']");
			
		//Webelement of confirm alert box 
		confirmAlertButton = driver.findElementByCssSelector("button[onclick^='pushCon']");
		
		//Webelement of prompt alert
		promptAlertButton = driver.findElementByCssSelector("button[onclick$='Confirm()']");
				
		//Simple alert
		simpleAlertButton.click();
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		//Confirm alert
		Thread.sleep(3000);
		confirmAlertButton.click(); 
		Thread.sleep(3000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Prompt alert
		promptAlertButton.click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Dhinesh");
		promptAlert.accept();
		
		} catch(NoSuchElementException e) {
			System.out.println(e);
		} catch(NoAlertPresentException e) {
			System.out.println("No alert is present to click");
			
		} catch(UnhandledAlertException e) {
			System.out.println("Please handle the exception");
			
		} catch(StaleElementReferenceException e) {
			System.out.println("Element became invisible");
			
		} catch(WebDriverException e) {
			System.out.println(e.getAdditionalInformation());
		}
		
	}

}
