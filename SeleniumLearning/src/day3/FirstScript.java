/**
 * 
 */
package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

/**
 * @author gurmat
 * 
 * This class will have our first script
 *
 */
public class FirstScript {

	/**
	 * 
	 */
	public FirstScript() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//start session
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElementById("txtUsername");
		username.isDisplayed();
		//boolean display_status = username.isDisplayed();//check status
		
		if(driver.findElementById("txtUsername").isEnabled())
		{
			driver.findElementById("txtUsername").sendKeys("admin");
		}
		Thread.sleep(5000);
		
		WebElement password =driver.findElementById("txtPassword");
		
		password.sendKeys("admin123");
		
		WebElement submitButton = driver.findElementByName("Submit");
		
		submitButton.click();
		
		
		
		//we can do this in order to avoid lengthy code
//		if(driver.getCurrentUrl().contains("dashboard")){
	//		System.out.println("Passed"); 
		//}
		
		//In order to validate it worked succesfully we get the current url to see if we logged in
		String urlAfterLogin =driver.getCurrentUrl();//This will return a link
		
		boolean status =urlAfterLogin.contains("dashboard");//We can also use endsWith method since we're looking for the same word
	
		//Now check
		
		if(status)//is true
		{
			//Now loggin is succesfull
			System.out.println("Log in is succesfull");
		}

		else{
			
			System.out.println("Log in unsuccesful");
		}
			driver.quit();
		
		
	}

		
		//Un comment for regular code
		/*
		boolean enable_status = username.isEnabled();
		//boolean selected_status =username.isSelected();
		if(display_status && enable_status){
			
			username.sendKeys("admin");//if both are true then do this
			
		}
		

		WebElement password = driver.findElementByName("txtPassword");
		
		password.sendKeys("admin123");
		
		
		WebElement submitButton = driver.findElementByName("Submit");
		
		submitButton.click();
		
	}
*/
}
