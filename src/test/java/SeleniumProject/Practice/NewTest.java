package SeleniumProject.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class NewTest {
	private WebDriver driver;
	

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
		
	}

	@BeforeTest
	public void beforeTest() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIGNESH BOYAPATI\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.4.0\\selenium-chrome-driver-3.4.0.jar");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();	
		
	}
}
