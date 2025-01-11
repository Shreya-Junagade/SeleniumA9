package com.crm.fileutility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (com.crm.AdvancedA9.Extentreportwithtestcase.class)
	public class MutipleTestcase {
	 @Test
	 public void dws() {
			WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.close();

		}
	@Test( timeOut =1000)
	 public void csk() throws InterruptedException {

WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.chennaisuperkings.com/");

	 driver.close();

	 Thread.sleep(2000);
	}

	@Test(dependsOnMethods= "csk")


	public void rcb() {
		WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.get("https://www.royalchallengers.com/");
     driver.close();

}
}