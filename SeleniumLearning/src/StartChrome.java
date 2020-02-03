import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gurma\\Desktop\\Seleniumjar\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver= new ChromeDriver();
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.getCommandExecutor();
		
		//driver.getCurrentUrl();//since it returns in String data we have to do it so
		String e= driver.getCurrentUrl();
		System.out.println(e);
		
		String q = driver.getTitle();
		System.out.println(q);
		//WebElement searchBox = driver.findElement(By.name("q"));//in java we put class next to variable
		
		//searchBox.sendKeys("Seleniumhq.org");
		
		//Thread.sleep(3000);

		//Can do driver.quit(); for webpage to shutdown
		//searchBox.submit();
	}

}
