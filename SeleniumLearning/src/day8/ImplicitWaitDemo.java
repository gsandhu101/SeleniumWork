package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
//give more time if elements are not coming in 10 seconds, then fail test
	
		//implictiit wait only checks for presence of element
		//
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//selenium webdriver comes after 10 seconds
	
		System.out.println("Title is "+driver.getTitle());

	
			
			
			driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

			
			
			System.out.println(driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed());
			
			
	}

}
