package listenersInterface;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {
	@Test
	public void main1() {
	File path = new File(System.getProperty(".\\src\\test\\resources\\Reports\\SampleReport.html"));
		
    ExtentSparkReporter spark=new ExtentSparkReporter(path);
    spark.config().setDocumentTitle("login");
    spark.config().setReportName("Mani");
    spark.config().setTheme(Theme.DARK);
    ExtentReports reports =new ExtentReports();
  
    reports.setSystemInfo("os","window-11");
    
    reports.setSystemInfo("browser","chrome-111");
    reports.attachReporter(spark);
    ExtentTest test =reports.createTest("main1");
    reports.flush();
}

}
