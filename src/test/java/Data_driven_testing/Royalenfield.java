package Data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Royalenfield {
	@Test(groups="compatibility")
	public void royalenfield() {
		System.out.println("i am royalenfield");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
		driver.close();
		
	}

}


