package Data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nike {

		// TODO Auto-generated method stub
		@Test(groups="integration")
		public void nike() {
			System.out.println("i am nike");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.nike.com/in");
			driver.close();
			
		}

	}

