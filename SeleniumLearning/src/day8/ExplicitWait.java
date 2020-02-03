package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		//find where popup is by xpath and click it, put code here
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,30);//seperate explicit class wait object
		//conditions to which element you want to wait, for us it is driver
		
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		
		alt.accept();
		
		
		
		
		
	}

}
