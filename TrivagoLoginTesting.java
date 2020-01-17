package DeloitteTrivago;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoLoginTesting {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		driver.findElement(By.cssSelector("#js_navigation > div > div.pos-relative.has-popover > button")).click();
		driver.findElement(By.id("check_email")).sendKeys("revanrn96@gmail.com");
		driver.findElement(By.id("login_email_submit")).click();
		driver.findElement(By.id("login_password")).sendKeys("Trivago2020");
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		driver.findElement(By.id("login_password")).sendKeys("makemytrip2020");
		try {
			Thread.sleep(400);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		driver.findElement(By.id("login_submit")).click();		
		
	}
}



