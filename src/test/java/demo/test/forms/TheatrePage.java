package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;


public class TheatrePage extends BaseForm {
	private static String formlocator="//div[@class='top-offer m-media']/..";
	private Label afishaTitle = new Label(By.xpath("//h1[@itemprop='name']"),"title");	


	public TheatrePage() {
		super(By.xpath(formlocator), "AFISHA.TUT.BY");
	}
	
	public void titleAssert(){
		assert(afishaTitle.isPresent());
	}

}
