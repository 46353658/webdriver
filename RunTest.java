package pblc.dflt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org");
		System.setProperty("webdriver.gecko.driver", "/home/user/bin");
		
		WebElement link;
		link = driver.findElement(By.id("js-link-box-en"));
		link.click();
		
		Thread.sleep(5000);
		 
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Java");
		searchBox.submit();
		
		
		Thread.sleep(5000);
		
		//closes browser
		driver.quit();
	}
}
