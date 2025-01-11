package com.crm.AdvancedA9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class Dwspage {
	 public static WebDriver driver=null;
		// public static ChromeDriverDriver driver=null;
		public static void  preCondition(String browser) throws InterruptedException {
			// TODO Auto-generated method stub
			if(browser.equalsIgnoreCase("chrome")) {
				 driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox")) {
			 driver=new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				 driver=new EdgeDriver();
				
			}
			else if(browser.equalsIgnoreCase("Safari")) {
				 driver=new SafariDriver();
				
			}
			else {
			 driver=new ChromeDriver();
			}
			
		// driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
		    driver.get("https://demowebshop.tricentis.com/"); 

		}
		public  static void login1() throws InterruptedException {
			
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("admin01");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='RememberMe")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("button-1.login-button")).click();
			Thread.sleep(1000);
			
			
		}
	public static void logout() {

		driver.findElement(By.xpath("//a[@class='ico-logout'])")).click();
	}
	public static void postCondition() {
		//driver.close();
		driver.quit();
	}
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
@BeforeMethod
public void login() throws InterruptedException{
driver.findElement(By.className("ico-login")).click();
Thread.sleep(1000);
driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys("admin01");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[name='RememberMe")).click();
Thread.sleep(1000);


}
}
