package Configuration_Annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@org.testng.annotations.Test
	public void Test() {
		System.out.println("Test");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass");
	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite");
	}

	

}
