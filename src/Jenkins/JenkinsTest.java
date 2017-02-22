package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void jenkinsTest(){
		System.out.println("Hello Jenkins");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\riponctg\\neon\\workspace\\SeleniumProject1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

}
