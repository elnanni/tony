package tony.unit.login;

import org.testng.annotations.Test;
import tony.armor.webInteraction.WebInteraction;

public class PositiveLoginTest {
	
	private WebInteraction webInteraction;
	@Test
	public void setUp() { 
	webInteraction = new WebInteraction();
	
	webInteraction.openBrowser("chrome");
	webInteraction.navigateToPage("https://codepen.io/anon/pen/XgzJmQ");
	webInteraction.changeFrame("//iframe[contains(@id, 'index.html-')]");
	webInteraction.clickLink("author link", "//a[contains(., 'lorem.in.th')]");
	webInteraction.setText("email", "//input[@id='input-type-email']","mariela0509_alv@live.com.mx");
	webInteraction.setText("password", "//input[@id='input-type-password']","password");
	webInteraction.selectDropDownValue("select box", "//select[@id='input-select']", "//select[@id='input-select']/optgroup[@label='Group1']/option[.='2']");
	webInteraction.setText("input text", "//input[@id='input-type-text']","Lorem ipsum dolor sit amet, consectetur");
	webInteraction.changeFrame(null);
	//prueba
}
}