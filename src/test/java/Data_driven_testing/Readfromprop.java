package Data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readfromprop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop=new Properties();
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Datadriventesting\\Demofile");
prop.load(fis);
String browser=prop.getProperty("browser");
System.out.println(browser);
String url=prop.getProperty("url");
System.out.println(url);

String username=prop.getProperty("username");
System.out.println(username);

String password=prop.getProperty("password");
System.out.println(password);


	}

}
