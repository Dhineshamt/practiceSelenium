package seleniumPractice;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.LaunchPageInChrome;

public class ActionsPractice {

	public static void main(String[] args) {
		WebElement userID, password, submit;
		try {
			ChromeDriver driver = LaunchPageInChrome.LaunchPage("https://www.linkedin.com");

			userID = driver.findElementById("login-email");
			password = driver.findElementById("login-password");
			submit = driver.findElementById("login-submit");

			Actions builder = new Actions(driver);
			Action login = builder.sendKeys(userID, "9944991706").sendKeys(password, "Vishnu@12").moveToElement(submit)
					.click().build();

			login.perform();
		} catch (WebDriverException e) {

		}
	}

}
