package testcasess;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void testcase1(){
		
	System.setProperty("webdriver.chrome.driver", "\\Users\\Zeina\\Downloads\\library\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("zeina.rehei");
	driver.findElement(By.id("pass")).sendKeys("parol93");
	driver.quit();
	 
	
}


}
