package seleniumPractice;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		
		
		//Clicking the button to open new pages
		driver.findElementById("button1").click();
		driver.findElementByXPath("//button[text()='New Message Window']").click();
		driver.findElementByXPath("//button[text()='New Browser Tab']").click();
		
		//Declaring Set variable to store all window handles
		Set<String> winHandles = driver.getWindowHandles();
		
		//Declaring string array to store window handles which can be used to handle every page separately
		String[] splitWinHandles = new String[winHandles.size()];
		
		
		//Declaring integer variable to maintain index of string array inside for each loop
		int i = 0;
		
	
		StringBuilder pageTitle;
	
		//Looping for each to store each window handle into array
		for(String winHandle: winHandles) {
			driver.switchTo().window(winHandle);
			System.out.println(i + "window is: " +driver.getTitle());
			
			splitWinHandles[i] = winHandle;
			i++;
		}
		
		//Switch to parent window using array. Every window can be accessed in same way using array.
		String parentWindow = splitWinHandles[0];
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
	}

}
