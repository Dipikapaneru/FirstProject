package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ContactInfo;
import pages.Landing;

public class FirstTestcase {

	public static void main(String[] args) throws InterruptedException {
		 
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://premierenroll.com");
		
		driver.manage().window().maximize();
		
		Landing landing = new Landing(driver);
		ContactInfo contactinfo=new ContactInfo(driver);
		
		landing.accesscode("NENY0000");
		landing.summit();
		landing.accses();
		landing.registeration();
		landing.nextbutton();
		
		Thread.sleep(5000);
		

		landing.fillPersonalInfo("Test", "","Test","123454676","10", "23", "1984");
		landing.next2button();
		
		Thread.sleep(5000);
		contactinfo.phonenum("7890008789");
		 
		contactinfo.details("email@xyz.com", "344657657", "47658769");
		contactinfo.nextf();
	}
	
	
	
	
	}
//new WebDriverWait(driver, 20)
//.until(ExpectedConditions.elementToBeClickable(By.id("agent_fname")))
//.click();

//	landing.myname("Dipika");