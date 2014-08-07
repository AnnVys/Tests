package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class JobsTest extends BaseTest {

	public void runTest() {
		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage tsf = new MainPage();
		tsf.assertLogo();
		logger.step(3);
		tsf.GoLink(jobs);
		logger.step(4);
		JobsPage jp = new JobsPage();	
		logger.step(5);
		jp.searchFor(job);
		logger.step(6);
		jp.sortBy(sortBy);
		logger.step(7);
		jp.clickVacancy();
		logger.step(8);
		VacancyPage vp = new VacancyPage();
		vp.assertIsOpen();
		
		
	}

}
