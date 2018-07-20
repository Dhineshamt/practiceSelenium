package seleniumPractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		WebElement frame2 = driver.findElementById("IF2");
		driver.switchTo().frame(frame2);
		System.out.println(driver.findElementByXPath("//div[@id='tabs-1']/b").getText());
		driver.switchTo().frame("CalendarControlIFrame");
		//System.out.println(driver.findElementByXPath("//div[@id='tabs-1']/b").getText());
		driver.switchTo().defaultContent();
		//System.out.println(driver.findElementByXPath("//div[@id='tabs-1']/b").getText());
		driver.switchTo().frame(frame2);
		System.out.println(driver.findElementByXPath("//div[@id='tabs-1']/b").getText());
	}

}
