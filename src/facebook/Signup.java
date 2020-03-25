package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	static WebElement element;
	static Select sel;
	
	
	public static void main(String[] args) {
	 
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Abc");
		
		 driver.findElement(By.name("lastname")).sendKeys("Cde");
		 driver.findElement(By.name("reg_email__")).sendKeys("12345");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("98765");
		
		 element=driver.findElement(By.id("month"));
		 sel=new Select(element);
		 sel.selectByVisibleText("Jul");
		
		 element=driver.findElement(By.id("day"));
		 sel=new Select(element);
		 sel.selectByValue("13");
		
		 element=driver.findElement(By.id("year"));
		 sel=new Select(element);
		 sel.selectByValue("1987");
		
	}

}
