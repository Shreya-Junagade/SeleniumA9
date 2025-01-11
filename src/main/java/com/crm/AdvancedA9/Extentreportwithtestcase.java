package com.crm.AdvancedA9;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportwithtestcase extends Dwspage implements ITestListener {


		 public static ExtentSparkReporter spark=null;
		 public static ExtentReports reports= null;
		 public static ExtentTest test =null;

		 @Override
		 public void onTestStart(ITestResult result) {
		String name= result.getMethod().getMethodName();
		test =reports.createTest(name);
		}
		@Override
		public void onTestSuccess (ITestResult result) {

		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, name+" is success");
		test.log(Status.PASS, name+" is passed");

		}

	
		@Override

		public void onTestFailure (ITestResult result) {

		String name= result.getMethod().getMethodName();

		test.log(Status.INFO, name+" is failure");

		test.log(Status.FAIL, name+" is fail");
		}

		@Override

		public void onTestSkipped(ITestResult result) {

		String name =result.getMethod().getMethodName();

		test.log(Status.INFO, name+" is skipped");

		test.log(Status.SKIP, name+" is skip");
		}
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		String screenshot=ts.getScreenshotAs(OutputType.BASE64);
//		test.addScreenCaptureFromBase64String(screenshot);
//		}

		@Override
		public void onStart(ITestContext context) {

		File path =new File("\\src\\test\\resources\\Reports\\TestCaseReport.html");

		//create the ExtentSparkReporter
		spark=new ExtentSparkReporter(path);
		//configure ExtentSparkReporter

		spark.config().setDocumentTitle("Login");

		spark.config().setReportName("Manikandan");
		spark.config().setTheme (Theme.DARK);

			//create extent reports
			reports= new ExtentReports();
			//configure extent report
			reports.setSystemInfo("os", "window-11");
			reports.setSystemInfo("Browser", "chrome-111");
			//attach the spark to extent report

			reports.attachReporter (spark);
			}

			@Override

			public void onFinish (ITestContext context) {

			reports.flush();
			}

			
			


		//create extent reports

}

