package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		String appUrl = "https://premierenroll.com";
		driver.get(appUrl);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().to(appUrl);
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.close();
		
		
		//driver.navigate().to("https://premierenroll.com");
		//driver.manage().window().maximize();	
		//Thread.sleep(5000);
		//driver.navigate().forward();
		//Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		//Thread.sleep(5000);
		//driver.close();
	}
		
	
	
}
