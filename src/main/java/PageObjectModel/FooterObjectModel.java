package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterObjectModel {
	public WebDriver driver;
	public FooterObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}
	//For customer
		private By enquiry=By.xpath("//ul[@class='fLinks']/li");
	//Claim warranty services
		private By mobile=By.xpath("//input[@id='MobileNo']");
		private By product=By.xpath("//select[@id='prd_name']");
		private By file=By.xpath("//input[@id='prod_image']");
		private By comments=By.xpath("//textarea[@name='remark']");
		private By pincode=By.xpath("//input[@id='cust_pincode']");
		private By city=By.xpath("//input[@id='cust_city']");
		private By submit=By.xpath("(//button[@class='button burnt-brown-btn'])[2]");
		
		public List<WebElement> clickonenquiry() {
			return driver.findElements(enquiry);
		}
		public WebElement entermobile() {
			return driver.findElement(mobile);
		}
		public WebElement selctproduct() {
			return driver.findElement(product);
		}
		public WebElement clickonfile() {
			return driver.findElement(file);
		}
		public WebElement entercomments() {
			return driver.findElement(comments);
		}
		public WebElement enterpincode() {
			return driver.findElement(pincode);
		}
		public WebElement entercity() {
			return driver.findElement(city);
		}
		public WebElement clickonsubit() {
			return driver.findElement(submit);
		}
		//Ticket Status
		By tikcet=By.linkText("Ticket Status");
		By mobilenum=By.xpath("//input[@id='cont']");
		By submitticket=By.xpath("//button[@id='check']");
		By ticketnum=By.xpath("//select[@id='ticket']");
		
		public WebElement clickonticket() {
			return driver.findElement(tikcet);
		}
		public WebElement entermobilenum() {
			return driver.findElement(mobilenum);
		}
		public WebElement clicksubmiticket() {
			return driver.findElement(submitticket);
		}
		public WebElement clickticketnum() {
			return driver.findElement(ticketnum);
		}
		
		
	//Contact Query
		By query=By.linkText("Contact/Query");
		By Name=By.xpath("//input[@name='Name']");
		By mobileNo=By.xpath("//input[@name='Mobile']");
		By emailId=By.xpath("//input[@name='Emailid']");
		By subject=By.xpath("//select[@name='Subject']");
		By comment=By.xpath("//textarea[@name='Comments']");
		By Submit=By.xpath("(//button[@type='submit'])[2]");
		
		public WebElement clickonquery() {
			return driver.findElement(query);
		}
		public WebElement enterName() {
			return driver.findElement(Name);
		}
		public WebElement entermobileNo() {
			return driver.findElement(mobileNo);
		}
		public WebElement enteremailId() {
			return driver.findElement(emailId);
		}
		public WebElement selectsubject() {
			return driver.findElement(subject);
		}
		public WebElement enterComment() {
			return driver.findElement(comment);
		}
		public WebElement clikSubmit() {
			return driver.findElement(submit);
		}
		
	/*	
	//Register
		private By mobileno=By.xpath("//input[@id='cust_cont']");
		private By title=By.xpath("//select[@id='cust_title']");
		private By fullname=By.xpath("//input[@id='cust_name']");
		private By email=By.xpath("//input[@id='cust_email']");
		private By address=By.xpath("//textarea[@id='cust_address']");
		private By pincod=By.xpath("//input[@id='cust_pincode']");
		private By calendar=By.xpath("//input[@max='2023-04-21']");
		private By bill=By.xpath("//input[@id='prd_dop']");
		private By purchase=By.xpath("//input[@id='prd_Price']");
		private By barcode=By.xpath("//select[@id='do']");
		private By warranty=By.xpath("//input[@id='prd_warrantycard']");
		private By register=By.xpath("//button[@type='submit']");
		public WebElement entermobileno() {
			return driver.findElement(mobileno);
		}
		public WebElement selecttitle() {
			return driver.findElement(title);
		}
		public WebElement entername() {
			return driver.findElement(fullname);
		}
		public WebElement enteremail() {
			return driver.findElement(email);
		}
		public WebElement enteraddress() {
			return driver.findElement(address);
		}
		public WebElement enterpin() {
			return driver.findElement(pincod);
		}
		public WebElement clickoncalendar() {
			return driver.findElement(calendar);
		}
		public WebElement clickonbill() {
			return driver.findElement(bill);
		}
		public WebElement enteronpurchase() {
			return driver.findElement(purchase);
		}
		public WebElement selectbarcode() {
			return driver.findElement(barcode);
		}
		public WebElement clickonwarranty() {
			return driver.findElement(warranty);
		}
		public WebElement clickonregister() {
			return driver.findElement(register);
		}
		*/

}
