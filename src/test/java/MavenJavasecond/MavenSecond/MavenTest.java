package MavenJavasecond.MavenSecond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MavenTest {

	public WebDriver driver;
	
	  @Test
	  public void getTitle() {
		  driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\singhalk\\Downloads\\Setup\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			  driver.get("http://demo.guru99.com/test/guru99home/");  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	
	
}
