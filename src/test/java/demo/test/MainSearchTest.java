package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class MainSearchTest extends BaseTest {


	public void runTest() {

		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage tsf = new MainPage();
		tsf.assertLogo();
		logger.step(3);
		tsf.searchFor(searchWord);
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		tsf.searchAssert(searchWord);
	}

}
