package Basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=0)
	public void Rcb() {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
	driver.close();
	}

	@Test(priority=2)
	public void csk() {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
	driver.close();
	}

	@Test(priority=3)
	public void dws() {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
	driver.close();
	}
	}

