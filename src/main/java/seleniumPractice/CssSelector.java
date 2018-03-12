package seleniumPractice;

import util.LaunchPageInChrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssSelector {
	
	/* CSS Selector Practice
	 * @author - Dhinesh on 11-Mar-2018
	 * Reference website to learn Css selector - http://www.way2automation.com/selenium-webdriver-xpath-vs-css.php
	 */

	public static void main(String[] args) {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		/*Css selector using id (#) and child (>)
		 * Css explanation: * div -> node, * # -> ID, * content -> value of ID attribute,  * > child, * h1 child of div node
		 * Ex:	<div id='content'>
		 * 			<h1>Dhinesh</h1>
		 * 		</div>
		 * Css selector used below will select h1
		 */	   
		WebElement pageHeader = driver.findElementByCssSelector("div#content>h1");
		
		/* Css selector using class. the dot '.' denotes the class
		 * Css selector used below will select element with h2 tag
		 * <div class='wf-container-main'>
		 * 		<div id='content'>
		 * 			<h2>I am dhinesh</h2>
		 * 		</div>
		 *	</div>
		 */
		WebElement pageContext = driver.findElementByCssSelector("div.wf-container-main>div#content>h2");
		
		
		/* Css Selector using attribute value
		 * Syntax to get element by matching attribute and attribute value: "tag[attribute='attribute Value']"
		 * Css Selector used below will select element with tag as button and onclick attribute value as 'pushAlert()'
		 * <button onclick="pushAlert()">Simple Alert</button>
		 */
		WebElement simpleAlert = driver.findElementByCssSelector("button[onclick='pushAlert()']");
		
		//Css selector with partial attribute where ^ demotes starts-with. 
		WebElement confirmAlert = driver.findElementByCssSelector("button[onclick^='pushCon']");
		//WebElement ;
		
		//Click Simple Alert
		driver.findElementByXPath("//button[text()='Simple Alert']").click();
		

		
		/*Actions build = new Actions(driver);
		build.keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();*/
		
		
	}

}
