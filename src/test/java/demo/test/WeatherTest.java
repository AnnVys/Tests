package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class WeatherTest extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate(url);
		logger.step(2);
		MainPage mp = new MainPage();
		mp.assertLogo();
		logger.step(3);
		mp.GoLink(weather);
		logger.step(4);
		WeatherPage wp = new WeatherPage();
		wp.WeatherLogo();
		logger.step(5);
		wp.SearchWeather(cityName);
		wp.SearchWeatherAssert(cityName);
	}



}
