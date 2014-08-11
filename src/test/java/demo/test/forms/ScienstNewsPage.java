package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.Button;

public class ScienstNewsPage extends BaseForm {
	private static String newsLocator="//div[@class='tooltip']/..";
    private Label newsLogo = new Label(By.xpath("//div[@class='m_header']"),"news logo");
    private Button newsLink = new Button(By.xpath("//ul[@id='newsBlock1']/li[3]/div[2]/a"), "news opener");
	private Label titleNews = new Label(By.tagName("h1"), "news title");

	public ScienstNewsPage() {
		super(By.xpath(newsLocator), "IT.TUT.BY");
	}
	
	public void NewsLogo(){
		assert(newsLogo.isPresent());
	}
	
	public void OpenNews() {
		newsLink.click();
	}
	
	public void AssertNewsTitle(){
		assert(titleNews.isPresent());
	}
}
