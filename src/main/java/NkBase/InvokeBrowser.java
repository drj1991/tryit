package NkBase;

import java.time.Duration;
//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {

	public WebDriver driver;
	public WebDriverWait wait;

	public void browserOpen() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//// driver.switchTo().alert().?
		// String parentCx=driver.getWindowHandle();
		// Set<String> childCx=driver.getWindowHandles();
		
		
		
		
		
//		Actions act= new Actions(driver);
//		act.

	}

}
