package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class MainPage extends BaseForm  {
	private static String formlocator="//body[@class='main-page']";

	private Label lbLogo = new Label(By.id("pageLogo"),"tutby logo");	
	private TextBox txbSearchBar = new TextBox(By.id("search_from_str"),"search bar");
	private Button btnSubmitSearch = new Button (By.xpath("//input[@name='search']"),"search button");
	private Label searchAssert = new Label(By.xpath("//ol[@class='b-results-list']/li"),"label testing");
	
	public Button linkClick (String link) {

		return new Button(By.linkText(link), link);
	}
	
	
	public void assertLogo(){
		assert(lbLogo.isPresent());
	}
	
    public void GoLink (String name ) {
    	linkClick(name).click();
    }
    
	public MainPage() {
		super(By.xpath(formlocator), "TUT.BY");
	}
	
	public void searchAssert(String searchText){
		assert(searchAssert.getText().contains(searchText));
	}
	
    public void searchFor(String text) {
    	txbSearchBar.type(text);
    	btnSubmitSearch.click();
    }

}
