package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;

public class VacancyPage extends BaseForm {
	private static String formlocator="//body[@class='l-tutby']";

	public VacancyPage() {
		super(By.xpath(formlocator), "Вакансия");
	}
	
}
