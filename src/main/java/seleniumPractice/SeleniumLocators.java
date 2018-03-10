package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

import util.LaunchPageInChrome;

public class SeleniumLocators {

	public static void main(String[] args) {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		String windowToGo = null;
		int iterate=1;
		
	
		//Xpath locator get almost last preference.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Create an account']"))).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String winHandle: windowHandles) {
			
			System.out.println(winHandle);
			if(iterate == 2){
			windowToGo = winHandle;
			}
			
			iterate++;
		}
		
		driver.switchTo().window(windowToGo);
		
		// id locator gets first preference 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("FirstName"))).sendKeys("Dhinesh");
		
		// name locator gets second preference
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("LastName"))).sendKeys("Anbalagan");

	}

}
