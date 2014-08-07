package webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * An abstract class that describes the basic test application contains
 * methods for logging and field test settings (options)
 */
public abstract class BaseTest extends BaseEntity{

 /**
  * To override.
  */
	public String url, searchWord, cityName, weather, typeNews, sublevelNews, aviatickets, city1, city2, 
	              afisha, sublevelAfisha, finances, currency, allResources, tourism, shops, modelName,
	              open, jobs, job, sortBy, post, login, pass;
		
	@Test
	 @Parameters({"url","searchWord", "cityName", "weather", "typeNews", "sublevelNews", "aviatickets", "city1", "city2", 
	              "afisha", "sublevelAfisha", "finances", "currency", "allResources", "tourism", "shops", "modelName",
	              "open", "jobs", "job", "sortBy", "post", "login", "pass" })
	 public void readParams(String url, String searchWord, String cityName, String weather, String typeNews,
			 String sublevelNews, String aviatickets, String city1, String city2, 
			 String afisha, String sublevelAfisha, String finances, String currency, String allResources, 
			 String tourism, String shops, String modelName, String open, String jobs, String job, 
			 String sortBy, String post, String login, String pass) throws Throwable {
		this.url = url;
		this.searchWord = searchWord;
		this.cityName = cityName;
		this.weather = weather;
		this.typeNews = typeNews; 
		this.sublevelNews = sublevelNews;
		this.aviatickets = aviatickets;
		this.city1 = city1;
		this.city2 = city2; 
		this.afisha = afisha;
		this.sublevelAfisha = sublevelAfisha;
		this.finances = finances;
		this.currency = currency; 
		this.allResources = allResources;
		this.tourism = tourism;
		this.shops = shops; 
		this.modelName = modelName;
		this.open = open;
		this.jobs = jobs;
		this.job = job;
		this.sortBy = sortBy;
		this.post = post;
		this.login = login; 
		this.pass = pass;
			
		
		
	  xTest();
	 }
	
	 @Parameters()
	
 public abstract void runTest();

 /**
  * Test
  * @throws Throwable Throwable
  */
 
 

 public void xTest() throws Throwable {
  Class<? extends BaseTest> currentClass = this.getClass();
  
  try {
   logger.logTestName(currentClass.getName());
   runTest();
   logger.logTestEnd(currentClass.getName());
  } catch (Throwable e) {
   
    logger.warn("");
    logger.warnRed(getLoc("loc.test.failed"));
    logger.warn("");
    throw e;
   }
  
 }

 /**
  * Format logging
  * @param message Message
  * @return Message
  */
 protected String formatLogMsg(final String message) {
  return message;
 }

}