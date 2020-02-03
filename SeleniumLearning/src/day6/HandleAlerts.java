package day6;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();//start session
		
		driver.get("https://ksrtc.in/oprs-web/");//right click and inspect on sear and button should come
	
		driver.findElement(By.id("corover-close-btn")).click();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("Ben");//throws unhandeled alert exception
		
		driver.findElement(By.xpath("//*[contains(text(),'Search for Bus')]")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String altText= alt.getText();
		
		if(altText.contains("Please select start place")){
			System.out.println("Validation passed");
		}
		alt.accept();
		
		//alt.dismiss();
		//alt.sendKEys("Alert");
		
		Thread.sleep(2000);
		
		
		
		//driver.quit();
		//the locators keyword-search for buses
		//find web element which contains text search for buses
		//driver.findElement(By.xpath("//*[contains(text(),'Search for Bus')]")).click();//when u click it will start alert
		//driver.findElement(By.id("fromPlaceName")).sendKeys("Ben");
		/*	
		
		
		
		Alert alt=driver.switchTo().alert();
		//alert is an interface
		
		//alt.getText();//return in form of string
		
		String altText=alt.getText();
		
		if(altText.contains("Please select start place")){
			System.out.println("Validation passed");
		}
		
	
	*/
	}

}
