package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class JobsPage extends BaseForm{
	private static String formlocator="//body[@class='l-tutby index']";
	private TextBox txbSearchBar = new TextBox(By.id("main-search-applicant"),"search bar");
	private Button btnSubmitSearch = new Button (By.xpath("//input[@type='submit'][@class='searchbox-submit']"),"search button");
	private Button sortParam = new Button (By.xpath("//span[@data-qa='serp_settings__order-by']"));
	private Button firstVacancy = new Button (By.xpath("//a[@class='b-vacancy-list-link b-marker-link']"));
	
	public Button linkClick (String link) {

		return new Button(By.linkText(link), link);
	}
	
	public JobsPage() {
		super(By.xpath(formlocator), "РАБОТА.TUT.BY");
	}
	
    public void clickVacancy () {
    	firstVacancy.click();
    }
	
	public void searchFor(String text) {
	   	txbSearchBar.type(text);
	   	btnSubmitSearch.click();
	}
	   
    public void sortBy (String name ) {
    	sortParam.click();
       	linkClick(name).click();
    }
}
