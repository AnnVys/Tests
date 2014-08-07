package demo.test;

import demo.test.forms.FinancePage;
import demo.test.forms.MainPage;
import webdriver.BaseTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FinanceTest extends BaseTest{

	public void runTest() {
		
		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage tsf = new MainPage();
		tsf.assertLogo();
		logger.step(3);
		tsf.GoLink(finances);
		tsf.GoLink(currency);
		logger.step(4);
		FinancePage fp = new FinancePage();
		fp.assertIsOpen();
		logger.step(5);
        fp.FinanceAssert(currency);

		
	}

}
