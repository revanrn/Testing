package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSettingSystemProperty {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com");

	driver.findElement(By.name("session_key")).sendKeys("revanrn96@gmail.com");
	driver.findElement(By.name("session_password")).sendKeys("linkedin2017");
	//driver.findElement(By.cssSelector("body > nav > a.nav__button-secondary"));
	//driver.findElement(By.xpath("//*[@id="username"]");
	
	

	
	
	
}
}
