package demo.test;



import webdriver.BaseTest;
import demo.test.forms.*;

public class AviaTicketsTest extends BaseTest {

	public void runTest() {
		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(allResources);
		mp.GoLink(aviatickets);
		logger.step(4);
		AeroticketsPage atp = new AeroticketsPage();	
		logger.step(5);
		atp.SearchTickets(city1, city2);
		ResultTicketsPage rp = new ResultTicketsPage();	
		rp.assertIsOpen();
		browser.getDriver().quit();
	}
	

}
