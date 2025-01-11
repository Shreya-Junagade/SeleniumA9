package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicExcecution {
	@Test
public void main() {


WebDriver driver=new ChromeDriver();
// driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.navigate().to("https://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/"); 
DwsHomepg ref=new DwsHomepg(driver);
ref.register.click();
driver.close();
}
}
