package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class AeroticketsPage extends BaseForm {

	private static String formlocator="//body[@class='style_v2']";
	
	private TextBox fromCity = new TextBox(By.id("fs_from_text"),"from");
	private TextBox toCity = new TextBox(By.id("fs_to_text"),"to");
	private Button btnSubmitSearch = new Button (By.xpath("//input[@type='submit'][@class='rounded']"),"search button");
	private Button menuitem = new Button (By.id("ui-active-menuitem"),"menuitem");

	public void SearchTickets(String city1, String city2) {
		fromCity.type(city1);
		menuitem.click();
		toCity.type(city2);
		menuitem.click();
		btnSubmitSearch.click();
	}
	

	public AeroticketsPage() {
		super(By.xpath(formlocator), "ПОИСК АВИАБИЛЕТОВ");
	}
	
}
