package tony.skeleton.webinteraction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tony.armor.osInteraction.OsInteraction;

public class WebInteraction {
	
	private WebDriver browser;
	
	public void openBrowser(String browser) {
		this.browser = new OsInteraction().openBrowser(browser);
		this.browser.manage().window().maximize();
		this.browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void navigateToPage (String url) {
		browser.get(url);
	}
	
	public void changeFrame (String id) {
		if(id == null) browser.switchTo().defaultContent();
		else browser.switchTo().frame(browser.findElement(By.xpath(id)));
	}

	public void clickLink(String name, String locator) {
		browser.findElement(By.xpath(locator)).click();
	}
		
	public void setText(String name, String locator, String value) {
		browser.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void selectDropDownValue(String name, String locator,String value) {
		browser.findElement(By.xpath(locator)).click();
		browser.findElement(By.xpath(value)).click();
	}
}
