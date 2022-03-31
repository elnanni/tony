package tony.armor.osInteraction;

import org.openqa.selenium.WebDriver;

public class OsInteraction {
	tony.skeleton.osinteraction.OsInteraction OsInteraction = new tony.skeleton.osinteraction.OsInteraction(); 
	WebDriver browser = null; 
	public WebDriver openBrowser(String browser){ 
	if(browser.toLowerCase().equals("chrome"))System.setProperty("webdriver.chrome.driver","C:/drivers/chrome/chromedriver.exe"); 
	if(browser.toLowerCase().equals("firefox"))System.setProperty("webdriver.gecko.driver","C:/drivers/firefox/geckodriver.exe"); 
	if(browser.toLowerCase().equals("edge"))System.setProperty("webdriver.edge.driver","C:/drivers/edge/msedgedriver.exe"); 
	return this.browser = OsInteraction.openBrowser(browser); 
	}
}
