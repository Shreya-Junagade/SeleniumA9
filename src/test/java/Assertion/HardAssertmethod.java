package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardAssertmethod {
	
	public void main() {
		
		String expected_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.demowebshop.tricentis.com/");
		String actual_url=driver.getCurrentUrl();
		assertEquals(expected_url,actual_url,"iam not in dws");
		System.out.println("i am in dws");
		driver.findElement(By.className("ico-register")).click();
		
	}
}
