package Basic;

import org.testng.annotations.Test;

public class CreatingDependanccy {
	@Test(timeOut=1000)
	public void createAccount() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("create account");
	}
		@Test(dependsOnMethods="create account")
		public void ModifyAccount() { 

		System.out.println("modify account");
		}
		@Test(dependsOnMethods="create account")
		public void DeleteAccount() { 

		System.out.println("delete account");
		
		
		
	}
	

}
//test
//select
//action
//popup
//iframe
//webdriver writing
//why method how