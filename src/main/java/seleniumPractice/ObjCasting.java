package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjCasting {

	public static void main(String[] args) {
		System.setProperty("", "");
		
		WebDriver driver = new ChromeDriver();
		//driver.findElementById("");
		driver.findElement(By.id(""));

	}

}
