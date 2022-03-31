package tony.skeleton.osinteraction;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class OsInteraction {
	public WebDriver openBrowser(String browser) { 
		if(browser.toLowerCase().equals("chrome"))return new ChromeDriver(); 
		if(browser.toLowerCase().equals("firefox"))return new FirefoxDriver(); 
		if(browser.toLowerCase().equals("edge"))return new EdgeDriver(); 
		return null; 
		} 
	public void closeBrowser(WebDriver browser) { 
		browser.quit(); 
		} 
}
