package listenersInterface;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class BasicListeners implements ITestListener{


@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	Reporter.log("onTestSuccess",true);
}
@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	Reporter.log("onStart",true);
}
@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	Reporter.log("onFinish",true);
}


@Override
	public  void onTestFailure(ITestResult  result) {
		Reporter.log("onTestFailure,true");
		// TODO Auto-generated method stub

	}

@Override
	public  void onTestSkipped(ITestResult  result) {
		Reporter.log("onTestSkipped,true");
		// TODO Auto-generated method stub

	}


}
