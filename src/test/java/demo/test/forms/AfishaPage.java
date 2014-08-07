package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class AfishaPage extends BaseForm {

	private static String formlocator="//div[@id='mainmenu']/..";
	private Button afishaLogo = new Button(By.xpath("//li[@class='lists__li center']//a"),"afisha logo");	

	
	public AfishaPage() {
		super(By.xpath(formlocator), "AFISHA.TUT.BY");
	}
	
	public void chooseTheatre() {
		afishaLogo.click();
	}
	
	
	

}
