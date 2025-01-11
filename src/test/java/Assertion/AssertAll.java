package Assertion;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
public class AssertAll {

public void main() {
		
		String expected_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.demowebshop.tricentis.com");
		String actual_url=driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();
	
		s.assertEquals(expected_url,actual_url,"iam not in dws");
	    Reporter.log("i am in dws",true);
		s.assertAll();
		
	}
	}


