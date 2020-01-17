package DeloitteDemoPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSettingSystemProperty2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.className("makeFlex")).click();
		driver.findElement(By.id("username")).sendKeys("revanrn96@gmail.com");
		driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button")).click()      ;
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("makemytrip2019");
		try {
			Thread.sleep(400);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button")).click();		
		
	}
}

