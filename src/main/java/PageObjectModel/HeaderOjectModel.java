package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderOjectModel {
	public WebDriver driver;
	public HeaderOjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
	//Products
	private By product=By.xpath("//li[@class='link l1']");
	private By all=By.xpath("//ul[@class='product-menu']/li");
	private By checkbox=By.xpath("//li[@class='option']");
	private By clearall=By.xpath("//span[normalize-space()='Clear all']");//a[@class='btn btn-light']
	public WebElement clickproduct() {
		return driver.findElement(product);
	}
	public List<WebElement> clickonall() {
		return driver.findElements(all);
	}
	public List<WebElement> clickoncheckbox() {
		return driver.findElements(checkbox);
	}
	public WebElement clickonclear() {
		return driver.findElement(clearall);
	}
	//Holidays
		private By holidays=By.xpath("//li[@class='link l2']/a");
		
	public WebElement clickonholidays() {
		return driver.findElement(holidays);
	}
	//Store
	private By store=By.xpath("//li[@class='link l3']");
	private By state=By.xpath("//select[@name='state']");
	private By city=By.xpath("//select[@name='city']");
	public WebElement clickonstore() {
		return driver.findElement(store);
	}
	public WebElement selectstate() {
		return driver.findElement(state);
	}
	public WebElement selectcity() {
		return driver.findElement(city);
	}
	//Contact Us
	private By contact=By.xpath("//li[@class='link l4']");
	private By fname=By.xpath("//input[@name='fname']");
	private By email=By.xpath("//input[@name='email']");
	private By message=By.xpath("//input[@id='message']");
	private By submit=By.xpath("//button[@class='btn btn-common submitButton']");
	private By search=By.xpath("//i[@class='fas fa-search']");
	
	public WebElement clickoncontact() {
		return driver.findElement(contact);
	}
	public WebElement enterfname() {
		return driver.findElement(fname);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement entermessage() {
		return driver.findElement(message);
	}
	public WebElement clickonsubmit() {
		return driver.findElement(submit);
	}
	public WebElement clickonsearch() {
		return driver.findElement(search);
	}
	
	


}
