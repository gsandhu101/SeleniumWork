package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//we switch to zero because we only have 1 frame
		driver.switchTo().frame(0);
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).perform();

	
	
	}
}