package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass3 {

	//double click swicth to iframe
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://api.jquery.com/dblclick/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//we switchto zero cuz we only have 1 frame
		driver.switchTo().frame(0);//multiple frames then use xpath
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//../div"))).perform();//double click where the current mouse is, so give exact location of double click

		
	}

}
