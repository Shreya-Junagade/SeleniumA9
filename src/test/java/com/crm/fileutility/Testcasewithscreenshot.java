package com.crm.fileutility;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.AdvancedA9.Dwspage;
@Listeners (com.crm.fileutility.AttachScreenshot.class)

public class Testcasewithscreenshot extends Dwspage {
	@Test
	public void dws1()  {
		System.out.println("dws1");
	}
@Test(timeOut=1000)
public  void dws2() throws InterruptedException{
	System.out.println("dws2");
	Thread.sleep(2000);
	
}
@Test
public void dws3() {
	System.out.println("dws3");
	
}
}