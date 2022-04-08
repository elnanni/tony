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
	webInteraction.setText("email", "//input[@id='input-type-email']","itstark@hotmail.com");
	webInteraction.setText("password", "//input[@id='input-type-password']","password");
	webInteraction.selectDropDownValue("select box", "//select[@id='input-select']", "//select[@id='input-select']/optgroup[@label='Group1']/option[.='2']");
	webInteraction.setText("input text", "//input[@id='input-type-text']","Lorem ipsum dolor sit amet, consectetur");
	webInteraction.setText("search","//input[@id='input-type-search']", "search");
	webInteraction.setText("url","//input[@id='input-type-url']", "https://codepen.io/anon/pen/XgzJmQ");
	webInteraction.inputClick("radio", "//input[@type='radio'][@name='input-radio'][@value='2']");
	webInteraction.setText("enter phone","//input[@id='input-type-tel']" ,"8234563458");
	webInteraction.numInput("enter number","//input[@id='input-type-number']" ,"15");
	webInteraction.selectMultipleOption("multiple option", "//select[@id='input-select-multiple']/option[.='REPLACE']", "1;3;2");
	webInteraction.setText("date", "//input[@id='input-type-date']", "04212022");
	webInteraction.setText("time", "//input[@id='input-type-time']", "10:20PM");
	webInteraction.setTextmonth("month", "//input[@id='input-type-month']", "April","2022");
	webInteraction.setText("week", "//input[@id='input-type-week']", "18,2020");
	webInteraction.setTextlocal("local time", "//input[@id='input-type-datetime-local']", "05282021","10:25AM");
	webInteraction.clickSummary("question 1", "//details/summary[contains(., 'Question 1')]");
	webInteraction.color ("color", "//input[@id='input-type-color']", "20", "15", "89");
	webInteraction.inputClick("normal button", "//button[text()='Normal button']");
	webInteraction.selectFile("file", "//input[@id='input-type-file']", "C:\\development\\file.txt");
	webInteraction.range("range", "//*[@id=\"input-type-range\"]");
	webInteraction.changeFrame(null);
	//test
}
}