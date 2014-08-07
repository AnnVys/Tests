package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class ModelPage extends BaseForm {
	private static String modelLocator="//body[@class='m-footer_fix']";
	private Label modelAssert = new Label(By.xpath("//h1[@class='big']"),"model assert");

	
	public Button paramClick (String link) {

		return new Button(By.linkText(link), link);
	}
   
	public void ModelAssert (String model) {
		assert(modelAssert.getText().contains(model) );
	}
	
    public void ClickText (String levelName) {
    	paramClick(levelName).click();
    }
    	
	public ModelPage(String title) {
		super(By.xpath(modelLocator), title);
	}
}