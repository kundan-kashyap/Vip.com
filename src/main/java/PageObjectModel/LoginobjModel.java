package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginobjModel {
	
	public WebDriver driver;
	
	private By id=By.xpath("//input[@name='username']");
	private By pass=By.xpath("//input[@name='password']");
	private By login=By.xpath("//button[@name='login']");
	private By invalid=By.xpath("//div[@class='callout callout-danger']");
	private By forgot=By.xpath("//a[@class='forgPass']");
	private By email=By.xpath("//input[@id='email']");
	private By reset=By.xpath("//button[@name='resetPassw']");
	private By remember=By.xpath("//input[@name='remember-me']");
	
	
	
	
	
	public LoginobjModel(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterid() {
		return driver.findElement(id);
	}
	public WebElement enterpass() {
		return driver.findElement(pass);
	}
	public WebElement clickonlogin() {
		return driver.findElement(login);
	}
	public WebElement error() {
		return driver.findElement(invalid);
	}
	public WebElement clickonforgot() {
		return driver.findElement(forgot);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement clickonreset() {
		return driver.findElement(reset);
	}
	public WebElement clickonremember() {
		return driver.findElement(remember);
	}
	
	

}
