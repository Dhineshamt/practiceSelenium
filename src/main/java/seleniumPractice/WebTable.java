package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String cellValue = null;
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElementByXPath("//table[@id='customers']/tbody");

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < columns.size(); j++) {
				System.out.println(columns.get(j).getText());
			}
		}

	}
}
