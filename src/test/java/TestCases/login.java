package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginobjModel;
import Resource.BaseClass;
import Resource.CommonMethod;
import Resource.Constant;

public class login extends BaseClass {
	@Test(dataProvider="testData")
	public void logincases(String username, String password) {
	
		LoginobjModel lm=new LoginobjModel(driver);
		
		lm.enterid().sendKeys(username);
		lm.enterpass().sendKeys(password);
		lm.clickonlogin().click();
		CommonMethod.handleAssertions(lm.error().getText(), Constant.actual, "Message is not matching");
		lm.clickonforgot().click();
		lm.enteremail().sendKeys(Constant.email);
		lm.clickonreset().click();
		lm.clickonremember().click();
		
	}
	@DataProvider
	public Object[][]testData(){
		Object[][]data=new Object[2][2];
		data[0][0]=Constant.name;
		data[0][1]=Constant.pass;
		data[1][0]=Constant.name1;
		data[1][1]=Constant.pass2;	
		return data;
	}
}
