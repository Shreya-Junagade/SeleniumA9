package listenersInterface;

import static org.testng.Assert.assertEquals;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenersInterface.BasicListeners.class)
public class TestCase1 {
@Test
public void main() {
	Reporter.log("main1",true);
}
@Test
public void main2() {
	Reporter.log("main2",true);
	assertEquals("java","selenium");
}
@Test(dependsOnMethods="main2")
public void main3() {
	Reporter.log("main3",true);
}
}
