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
	webInteraction.inputClick("author link", "//a[contains(., 'lorem.in.th')]");
	webInteraction.setText("email", "//input[@id='input-type-email']","mariela0509_alv@live.com.mx");
	webInteraction.setText("password", "//input[@id='input-type-password']","password");
	webInteraction.selectDropDownValue("select box", "//select[@id='input-select']", "//select[@id='input-select']/optgroup[@label='Group1']/option[.='2']");
	webInteraction.setText("input text", "//input[@id='input-type-text']","Lorem ipsum dolor sit amet, consectetur");
	webInteraction.setText("search","//input[@id='input-type-search']", "search");
	webInteraction.setText("url","//input[@id='input-type-url']", "https://codepen.io/anon/pen/XgzJmQ");
	webInteraction.inputClick("radio", "//input[@type='radio'][@name='input-radio'][@value='2']");
	webInteraction.selectMultipleOption("multiple option", "//select[@id='input-select-multiple']/option[.='REPLACE']", "1;3;2");
	webInteraction.inputClick("normal button", "//button[text()='Normal button']");
	webInteraction.changeFrame(null);
	//prueba
}
}