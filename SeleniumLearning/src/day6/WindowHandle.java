package day6;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//start session
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindow=driver.getWindowHandle();//not in readble format, to String by java generated at run time
		
		//click on linkedin see how many window id
		System.out.println(driver.getWindowHandles().size());//before clicking link
		
		
		driver.findElementByXPath("//img[contains(@alt,'LinkedIn OrangeHRM group')]").click();
		
		
		//this will open a new tab, in selenium a new tab is a new window
		//driver.getWindowHandles();//return set of strings
		
		
		Set<String> allWindows=driver.getWindowHandles();//returns parent and new tab that opens
		System.out.println(allWindows.size());//count how many windows we have
		System.out.println(allWindows);
		System.out.println(parentWindow);//return parent window id
		//driver.quit();
	}
		
}
