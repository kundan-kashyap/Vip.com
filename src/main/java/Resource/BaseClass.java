package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public void driverIni() throws IOException {
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.Properties");
		prop =new Properties();
		prop.load(fs);
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}else {
		System.out.println("please make sure you have correct browser");
	}
	}
	@BeforeMethod
public void openUrl() throws IOException {
	//System.setProperty("webdriver.http.factory", "jdk-http-client");
	driverIni();
	driver.manage().window().maximize();
	String urlName=prop.getProperty("url1");
	driver.get(urlName);
}
}



