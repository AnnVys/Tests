package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;

public class MailPage extends BaseForm {

	private static String maillocator="//div[@class='wrapper']/..";

	
	public MailPage() {
		super(By.xpath(maillocator), "gmail");
	}
	
}
