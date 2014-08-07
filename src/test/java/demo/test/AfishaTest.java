package demo.test;

import demo.test.forms.*;
import webdriver.BaseTest;

public class AfishaTest extends BaseTest {

	public void runTest() {
		
		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage tsf = new MainPage();
		tsf.assertLogo();
		logger.step(3);
		tsf.GoLink(afisha);
		logger.step(4);
		tsf.GoLink(sublevelAfisha);
		AfishaPage ap = new AfishaPage();
		logger.step(5);
		ap.chooseTheatre();
		TheatrePage tp = new TheatrePage();
		tp.titleAssert();
		
	}

}
