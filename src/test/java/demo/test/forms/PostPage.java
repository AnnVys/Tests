package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class PostPage extends BaseForm{
	private static String postLocator="//div[@id='container']/..";
	private TextBox userLogin = new TextBox(By.id("Username"), "login");
	private TextBox userPass = new TextBox(By.id("Password"), "password");
	private Button btnEnterLogin = new Button(By.xpath ("//input[@type='submit']"), "login button");
	
	public PostPage() {
		super(By.xpath(postLocator), "ВАША ПОЧТА ТУТ");
	}
	
    public void Login (String userName, String password) {
	    userLogin.type(userName);
	    userPass.type(password);
 	    btnEnterLogin.click();
    }
}


