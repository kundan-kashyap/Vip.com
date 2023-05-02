package TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.FooterObjectModel;
import Resource.BaseClass;
import Resource.CommonMethod;
import Resource.Constant;

public class VerifyFooter extends BaseClass {
	@Test
	public void footer() throws InterruptedException {
		FooterObjectModel fom=new FooterObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//For customer
				CommonMethod.forloop(fom.clickonenquiry(), "Enquiry and claim service");
				Set<String> obj=driver.getWindowHandles();
				Iterator<String> it=obj.iterator();
				String parent=it.next();
				String child=it.next();
				
				driver.switchTo().window(child);
		fom.entermobile().sendKeys(Constant.mobileno);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='prd_name']")));
		fom.selctproduct().click();
		fom.selctproduct().click();
		//CommonMethod.selectmethod(fom.selctproduct(), "DFTCACH67RED-VBBJ1806819");
		fom.clickonfile().sendKeys("C:\\Users\\Admin\\Downloads\\vip bag.jpg");
		fom.entercomments().sendKeys(Constant.comments);
		fom.enterpincode().sendKeys(Constant.pincode);
		fom.entercity().sendKeys(Constant.city);
		fom.clickonsubit().click();
		
		//Ticket Status
		fom.clickonticket().click();
		fom.entermobilenum().sendKeys(Constant.mobileno);
		fom.clicksubmiticket().click();
		
		CommonMethod.selectmethod(fom.clickticketnum(), "480056");
		
		//Query
		fom.clickonquery().click();
		fom.enterName().sendKeys(Constant.name);
		fom.entermobileNo().sendKeys(Constant.mobileno);
		fom.enteremailId().sendKeys(Constant.email);
		CommonMethod.selectmethod(fom.selectsubject(), "Product Enquiry");
		fom.enterComment().sendKeys(Constant.comment);
		
		//fom.clikSubmit().click();
		
		
		
		
		/*
		//Register Product
		driver.switchTo().window(parent);
		CommonMethod.forloop(fom.clickonenquiry(), "Register Product");
		Set<String> obj1=driver.getWindowHandles();
		Iterator<String> a=obj1.iterator();
		String par=a.next();
		String chi=a.next();
		
		fom.entermobileno().sendKeys(Constant.mobileno);
		CommonMethod.selectmethod(fom.selecttitle(), "Mr");
		fom.entername().sendKeys(Constant.fname);
		fom.enteremail().sendKeys(Constant.email);
		fom.enteraddress().sendKeys(Constant.address);
		fom.enterpin().sendKeys(Constant.pincode);
		fom.clickoncalendar().click();
		fom.clickonbill().sendKeys("C:\\Users\\Admin\\Downloads\\bill.png");
		fom.enteronpurchase().sendKeys(Constant.purchase);
		CommonMethod.selectmethod(fom.selectbarcode(), "1");
		fom.clickonwarranty().sendKeys("C:\\Users\\Admin\\Downloads\\warranty.jpeg");
		fom.clickonregister().click();
		
		*/
				
	}

}
