package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.HeaderOjectModel;
import Resource.BaseClass;
import Resource.CommonMethod;
import Resource.Constant;

public class VerifyHeader extends BaseClass{
	
	@Test
	public void header() {
		
		HeaderOjectModel hom=new HeaderOjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Product
		Actions a=new Actions(driver);
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "All");
		CommonMethod.loop(hom.clickoncheckbox());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-light']")));
		//hom.clickonclear().click();
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "HARD LUGGAGE UPRIGHT");
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "SOFT LUGGAGE UPRIGHT");
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "DUFFEL  TROLLEYS");
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "BACKPACKS"); 
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "BACKPACK  TROLLEYS");
		a.moveToElement(hom.clickproduct()).perform();
		CommonMethod.forloop(hom.clickonall(), "BUSINESS");
		
		//Holiday
		hom.clickonholidays().click();
		
		//Store
		hom.clickonstore().click();
		CommonMethod.selectmethod(hom.selectstate(), "7");
		
		//Contact
		hom.clickoncontact().click();
		hom.enterfname().sendKeys(Constant.fname);
		hom.enteremail().sendKeys(Constant.email);
		hom.entermessage().sendKeys(Constant.message);
		hom.clickonsubmit().click();
		
		//Search
		hom.clickonsearch().click();
	
		
		
		
		
	}

}
