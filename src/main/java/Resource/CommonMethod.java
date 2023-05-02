package Resource;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void handleAssertions(String actual, String expected, String message) {
		SoftAssert a=new SoftAssert();
		String ac=actual;
		String exp=expected;
		a.assertEquals(ac, exp,message);
		a.assertAll();
		
	}
	public static void forloop(List<WebElement> a,String y) {
		for(WebElement z:a) {
			z.getText().equalsIgnoreCase(y);
			z.click();
			break;
		}
	}
	public static void loop(List<WebElement>a) {
		for(int i=0;i<a.size();i++) {
			a.get(i).click();
		}
	}
public static void selectmethod(WebElement b,String c) {
	Select s=new Select(b);
	s.selectByValue(c);
}
}
