package com.crm.fileutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Org {
	WebDriver driver=null;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.kawasaki-india.com/");
}
@BeforeMethod
public void login() throws IOException {
	String username=ReadFromPropFile.propertyDtata("useraname");
	String pwd=ReadFromPropFile.propertyDtata("password");
	LoginPage lgn=new LoginPage(driver);
	lgn.username(username);
	lgn.password(password);
	lgn.submit();
	
}
public void logout(){
	HomePg pg =new HomePg(driver);
	pg.profile();
	pg.signOut();
}

	

}
