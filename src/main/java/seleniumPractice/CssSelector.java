package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import util.LaunchPageInChrome;

public class CssSelector {

	public static void main(String[] args) {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("https://www.google.co.in");
		driver.manage().window().maximize();
		
		driver.findElementByCssSelector("input#lst-ib").sendKeys("Google");
		
		driver.findElementByCssSelector("").clear();
	}

}
