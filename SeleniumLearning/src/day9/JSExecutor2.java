package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;

public class JSExecutor2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("hp-widget__depart")).sendKeys("3 Mar, Tue");
		
		//call in one statement
		
		((JavascriptExecutor)driver).executeAsyncScript("document.getElementById('email').value='Hello';");
	
		//((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click();", driver.findElement(By.id("hp-widget__depart")));
//value is method of w.e value u will pass
		
		//arg[0].value=arg[1], "GGG", "PPPP"//gg goes to first arg and ppp to second
	
	}

}
