package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutException {

	
	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//set time out
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);//if page not loading in 5 seconds then it will timeout
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		
		FileInputStream fis = new FileInputStream(new File("/home/file.txt"));//not error
	
			System.out.println("Title is "+driver.getTitle());
			
	}

}
