package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class TourismTest extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(allResources);
		mp.GoLink(tourism);
		TourismPage tp = new TourismPage();
		tp.SearchPropeties(); 
		logger.step(4);
		tp.SearchAssert();
		logger.step(5);			
	}
}
