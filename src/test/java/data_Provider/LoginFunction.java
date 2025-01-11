package data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFunction {


		// TODO Auto-generated method stub
		@DataProvider(name="login")
		public Object[][] provider(){
			Object[][] obj=new Object[2][2];
			obj[0][0]="admin@gmail.com";
			obj[0][1]="admin01@";
			
			obj[1][0]="admin@gmail.com";
			
			obj[1][1]="admin02";
			return obj;
		}
			@Test(dataProvider="login")
			public void receiver(String username,String password) throws InterruptedException{
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.cssSelector("button-1.login-button")).click();
			driver.close();
			
			
			
				
			
			
		}

	}


