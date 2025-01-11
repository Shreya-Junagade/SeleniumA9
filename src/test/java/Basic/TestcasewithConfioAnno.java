package Basic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.AdvancedA9.Dwspage;

public class TestcasewithConfioAnno extends Dwspage{
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	driver.findElement(By.id("small-searchterms")).sendKeys("welcomeframework");
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	Thread.sleep(1000);
	
		

	}}