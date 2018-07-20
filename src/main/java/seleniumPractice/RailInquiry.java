package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.ArrayList;

public class RailInquiry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://enquiry.indianrail.gov.in/ntes/");
		driver.manage().window().maximize();
		
		if(driver.getTitle().equalsIgnoreCase("National Train Enquiry System -Indian Railways")) {
			System.out.println("Page is loaded");
		}
		
		else {
			System.out.println("Expected Page is not loaded"+ driver.getTitle());
		} 
			
		
		
		driver.findElementById("ui-id-3").click();
		
		driver.findElementById("station1").sendKeys("MS");
		
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='ui-id-13']/li/a")));
		
		List<WebElement> stations = driver.findElementsByXPath("//ul[@id='ui-id-13']/li/a");

		for(WebElement station: stations){			
			if(station.getText().contains("EGMORE")) {
				station.click();
			}
			break;
		}
		
		driver.findElementById("station2").sendKeys("TPJ");
		
		
	}

}
