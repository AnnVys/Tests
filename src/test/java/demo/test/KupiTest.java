package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class KupiTest extends BaseTest{
	
	public void runTest() {
		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(shops);
		KupiPage kp = new KupiPage();
		kp.assertIsOpen();
		kp.SearchFor(modelName); 
		logger.step(4);
		ModelPage mop = new ModelPage(modelName);
		mop.ModelAssert(modelName);
		mop.ClickText(open);
		mop.assertIsOpen();
		mop.ModelAssert(modelName);
		logger.step(5);	
	}

}
