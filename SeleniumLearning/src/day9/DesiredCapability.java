package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;

public class DesiredCapability {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setAcceptInsecureCerts(true);
		
		//pass desired cap and chrome together
		
		//in selenium is about desired capabilities
		options.addArguments("==disable-infobars");
		options.addArguments("--disable-notifications");
		
		options.merge(cap);//need to merge, after arguments, pass options
		
		WebDriver driver = new ChromeDriver(options);
		
		//constructor overloading, calling same chrome driver with different options
//method overloading in selenium is used with javascript
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.redbus.in/");
		
		
		
		
	
	
	}

}
