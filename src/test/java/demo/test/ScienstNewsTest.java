package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class ScienstNewsTest extends BaseTest {
	
	public void runTest() {

		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(typeNews);
		logger.step(4);
		NewsPage np = new NewsPage();
		np.NewsLogo();
		np.openNewsSublevel(sublevelNews);
		logger.step(5);
		ScienstNewsPage snp = new ScienstNewsPage();
		snp.NewsLogo();
		logger.step(6);
		snp.OpenNews();
		snp.AssertNewsTitle();
		logger.step(7);			
	}

}
