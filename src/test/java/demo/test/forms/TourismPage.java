package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class TourismPage extends BaseForm {
	private static String formlocator="//div[@id='cboxOverlay']/..";

	private Button btnSubmitSearch = new Button (By.xpath("//input[@type='image'][@class='submit']"),"search button");
	private Label searchAssert = new Label(By.xpath("//h1[contains(.,'Туры')]"),"label testing");
	
	
	public TourismPage() {
		super(By.xpath(formlocator), "ТУРИЗМ");
	}
	
	public void SearchPropeties() {
    	btnSubmitSearch.click();
	}
	
	public void SearchAssert(){
		assert(searchAssert.isPresent());
	}
	
}
