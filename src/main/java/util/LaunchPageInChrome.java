package util;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPageInChrome {
	/*  This method will launch the website in 
	 * @author - Dhinesh
	 */
	
	public static ChromeDriver LaunchPage(String url) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		try {
			driver.get(url);
		} catch (WebDriverException e) {
			System.out.println(e);
		}
		return driver;
	}

}
