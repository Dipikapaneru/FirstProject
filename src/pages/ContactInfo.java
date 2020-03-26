package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 

public class ContactInfo {
	WebDriver driver;
	
	public ContactInfo(WebDriver args) {
		driver = args;
	}
	
 
	By phone=By.name("agent_phone1");
	By time=By.name("timezone");
	By email=By.name("agent_email");
	By phoneno=By.id("phone2");
	By fax=By.id("phone3");
	By next4=By.id("fourthNext");
	
	public void phonenum(String number) {
		driver.findElement(phone).sendKeys(number);
	}
	
	 
	
		//}
		public void details(String em, String pn, String fn) {
			//driver.findElement(time).sendKeys("tm");
			driver.findElement(email).sendKeys("em");
			driver.findElement(phoneno).sendKeys("pn");
			driver.findElement(fax).sendKeys("fn");
		}
			public void nextf() {
			driver.findElement(next4).click();
		}
	} 

