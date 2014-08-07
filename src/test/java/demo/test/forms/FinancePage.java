package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;
public class FinancePage extends BaseForm {
	
	private static String formlocator="//div[@id='mainmenu']/..";
	private Label searchAssert = new Label(By.xpath("//h2[@class='b-h2']"),"header testing");
	
	
	public FinancePage() {
		super (By.xpath(formlocator), "ФИНАНСЫ");
	}

	public void FinanceAssert (String curr) {
		assert(searchAssert.getText().contains(curr) );
	}
}
