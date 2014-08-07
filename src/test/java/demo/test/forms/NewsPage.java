package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class NewsPage extends BaseForm {
	private static String newsLocator="//div[@class='tooltip']/..";
	
	public Button sublevelLink (String link) {

		return new Button(By.linkText(link), link);
	}
    private Label newsLogo = new Label(By.xpath("//div[@class='logo']"),"news logo");

	
	public void NewsLogo(){
		assert(newsLogo.isPresent());
	}
    public void openNewsSublevel (String sublevelName) {
     	sublevelLink(sublevelName).click();
    }
	
	public NewsPage() {
		super(By.xpath(newsLocator), "IT.TUT.BY");
	}
}