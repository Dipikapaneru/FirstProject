package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressInfo {
	WebDriver driver;

	public AddressInfo(WebDriver args) {
		driver=args;
	
	}
	By Add= By.id("agent_address1");
	By apart= By.id("agent_address2");
	By city=By.id("agent_city");
	By state=By.id("agent_state");
	By zipp=By.id("agent_zip");
	By nextfive=By.id("fifthNext");
	By check=By.id("bypass");
	By regt=By.id("reptype");
	By nex=By.id("rtNext");
	By check2=By.id("bypass1");
	By next6=By.id("sixthNext");
	
	
	public void adressIn(String Sa, String Apt, String Ci, String Zip ) {
		driver .findElement(Add).sendKeys(Sa);
		driver.findElement(apart).sendKeys(Apt);
		driver.findElement(city).sendKeys(Ci);
		
		stateinfo("Ohio (OH)");
		
		driver.findElement(zipp).sendKeys(Zip);
		
	}
	public void stateinfo(String St) {
	Select sts= new Select(driver.findElement(state)); 
	 sts.selectByVisibleText(St);
	}
	 
	 
	 public void nextfi(String C, String N) {
			driver.findElement(check).click();
			driver.findElement(nextfive).click();
	 }
	 
	 public void regtype(String Rt) {
		 Select reg= new Select(driver.findElement(regt));
		 reg.selectByVisibleText(Rt);
	 }
		
			public void nexxt() { 
			
			 driver.findElement(nex).click();
			 
			}
		public void businessinfo() {
			 driver.findElement(check2).click();
			 driver.findElement(next6).click();
	 }
	 
	 
	 
}
