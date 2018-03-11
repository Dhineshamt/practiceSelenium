package seleniumPractice;

import util.LaunchPageInChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class TagNameLocator {

	public static void main(String[] args) {
		ChromeDriver driver = LaunchPageInChrome.LaunchPage("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElementById("customers");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = null;
		
		for(WebElement row: rows) {
			 columns = row.findElements(By.tagName("td"));
			 for(WebElement column: columns) {
					System.out.println(column.getText());
				}
		}
		
		
		
	}

}
