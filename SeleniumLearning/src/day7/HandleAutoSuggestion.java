package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();//start session
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");//right click and inspect on sear and button should come
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("S");
		
	//we can use implicit wait	//Thread.sleep(2000);
		//we have list of web ELEMENTS
		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//li//div"));
		
		
		for(WebElement ele:allOptions){
			System.out.println(ele.getText());//
			if(ele.getText().contains("Selenium")){
				ele.click();
				break;
			}
	}
	}
}
