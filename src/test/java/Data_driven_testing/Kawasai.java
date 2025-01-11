package Data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kawasai {
	@Test(groups="smoke")
	public void kawasai() {
		System.out.println("i am kawasai");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.kawasaki-india.com/");
		driver.close();
		
	}

}


