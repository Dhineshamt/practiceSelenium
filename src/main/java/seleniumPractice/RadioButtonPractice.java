package seleniumPractice;

import util.LaunchPageInChrome;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	/*
	 * @author - Dhinesh Create on 10-Mar-2018 This code explains how to click Radio
	 * button
	 */
	public static void main(String[] args) {

		try {
			// Launches the app
			ChromeDriver driver = LaunchPageInChrome
					.LaunchPage("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
			driver.manage().window().maximize();

			// Switch to the frame where Radio button exist
			try {
				driver.switchTo().frame("iframeResult");
			} catch (NoSuchFrameException e) {

			}

			// Get list of all the radio buttons
			List<WebElement> radioButtons = driver.findElementsByXPath("//input[@type='radio' and @name='gender']");
			System.out.println(radioButtons.size());

			for (WebElement radioButton : radioButtons) {
				if (radioButton.getAttribute("value").equalsIgnoreCase("Other")) {
					radioButton.click();
				}
			}
		} catch (NoSuchElementException e) {

		} catch (WebDriverException e) {
			System.out.println(e);
		}
	}

}