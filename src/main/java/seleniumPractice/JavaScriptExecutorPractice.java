package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import util.LaunchPageInChrome;

public class JavaScriptExecutorPractice {

	public static void main(String[] args) {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("https://www.linkedin.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Code to write text to text box using JavascriptExecutor
		js.executeScript("document.getElementById('login-email').value = '9944991706';");
		js.executeScript("document.getElementById('login-password').value = 'Vishnu@12';");

		// Code to click a button using JavascriptExecutor
		WebElement elmt = driver.findElementById("login-submit");
		js.executeScript("arguments[0].click();", elmt);
	}
}