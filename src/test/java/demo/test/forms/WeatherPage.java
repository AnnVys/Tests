package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class WeatherPage extends BaseForm{
	private static String weatherLocator="//ul[@class='typeahead dropdown-menu']/..";
	private Label weatherLogo = new Label(By.xpath("//div[@class='logo']"),"weather logo");
	private TextBox weatherSearchBar = new TextBox(By.name("str"),"weather search bar");
	private Button btnSubmitSearch = new Button (By.xpath("//input[@class='button big']"),"weather search button");
	private Label searchAssert = new Label(By.xpath("//a[@class='dotted'][@data-weathercode]"),"label testing");
	
	public WeatherPage() {
		super(By.xpath(weatherLocator), "POGODA.TUT.BY");
	}
	
	public void WeatherLogo(){
		assert(weatherLogo.isPresent());
	}
	
	public void SearchWeather(String city ) {
    	weatherSearchBar.type(city);
    	btnSubmitSearch.click();
	}
	
	public void SearchWeatherAssert (String city) {
		assert(searchAssert.getText().contains(city) );
	}
}
