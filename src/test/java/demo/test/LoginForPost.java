package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class LoginForPost extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(post);
		PostPage pp = new PostPage();
		pp.Login (login, pass);
		logger.step(4);
		MailPage mail = new MailPage();		
		mail.assertIsOpen();
	}
}
