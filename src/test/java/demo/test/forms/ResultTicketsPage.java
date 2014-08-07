package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;

public class ResultTicketsPage extends BaseForm {

	private static String aeroLocator="//body[@class='style_v2 inner']";


	
	public ResultTicketsPage() {
		super(By.xpath(aeroLocator), "TUT.BY");
	}
	
}
