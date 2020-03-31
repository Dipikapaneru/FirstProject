package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddressInfo;
import pages.ContactInfo;
import pages.Landing;
import pages.Signature;

public class FirstTestcase {

	public static void main(String[] args) throws InterruptedException {
		 
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://premierenroll.com");
		
		driver.manage().window().maximize();
		
		Landing landing = new Landing(driver);
		ContactInfo contactinfo=new ContactInfo(driver);
		AddressInfo adressinfo =new AddressInfo(driver);
		
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
		contactinfo.details("","saaw@go.com", "34567", "567889");
		contactinfo.tzone("Samoa (UTC-11)");
		contactinfo.nextf();
		
	
		Thread.sleep(5000);
		adressinfo.adressIn("37873", "2353", "34353", "76556767");
		adressinfo.stateinfo("Ohio (OH)");
		adressinfo.nextfi("", "");
		// regtype info
		Thread.sleep(5000);
		adressinfo.regtype("Individual");
		adressinfo.nexxt();
		//businessinfo
		Thread.sleep(5000);
		adressinfo.businessinfo();
		
		Thread.sleep(5000);
		adressinfo.paymentinfo();
		adressinfo.infopayment("042000013", "Test Fed", "6743647", "987483", "");
		
		
		Thread.sleep(5000);
		Signature signature = new Signature(driver);
		String verificationCode = signature.retriveVerificationCode();
		signature.enterVerificationCode(verificationCode);
	}
		 
}
		
		
		
		
		
		
		
//new WebDriverWait(driver, 20)
//.until(ExpectedConditions.elementToBeClickable(By.id("agent_fname")))
//.click();

//	landing.myname("Dipika");