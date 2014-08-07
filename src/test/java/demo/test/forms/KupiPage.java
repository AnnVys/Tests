package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class KupiPage extends BaseForm {
	private static String kupiLocator="//body[@class='m-footer_fix']";
	private TextBox kupiSearchBar = new TextBox(By.name("str"),"kupi search bar");
		
	public Button kupiClick = new Button(By.xpath("//span[@class='b-sug-i']//strong"), "suggestions");
	
	
	public KupiPage() {
		super(By.xpath(kupiLocator), "KUPI.TUT.BY");
	}
	
    public void SearchFor(String text) {
    	kupiSearchBar.type(text);
    	kupiClick.click();
    }

}
