package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1Ex8 {

	public static void main(String[] args)
	{
		ChromeDriver n1 =new ChromeDriver();
		
		n1.get("https://www.google.com/");
		n1.navigate().to("https://www.bookmyshow.com/");
		n1.navigate().refresh();
		n1.manage().window().minimize();
		n1.manage().window().setSize(new Dimension(1024, 768));
	}

}
