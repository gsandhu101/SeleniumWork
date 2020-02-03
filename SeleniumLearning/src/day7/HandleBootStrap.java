package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrap {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();//start session
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");//right click and inspect on sear and button should come
		driver.findElement(By.id("menu1")).click();
		//we have list of web ELEMENTS
		List<WebElement> allOptions=driver.findElements(By.className("dropdown-menu"));//store as a list of web elements
		
		//use for each loop, to click on 30 we need a condition
		for(WebElement ele:allOptions){
			System.out.println(ele.getText());//we need to call get text to get actual dates
			//System.out.println(ele.getAttribute("innerHTML"));
			//doesnt click
			if(ele.getText().equalsIgnoreCase("JavaScript")){
				ele.click();
				break;
			}
	}
	}
}
