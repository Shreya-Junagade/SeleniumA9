package Data_driven_testing;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Readfrompropfile {


	public class ReadFromPropertyFile {
		public String propertyData(String keys) throws IOException {
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\propertyData.properties");
			prop.load(fis);
			String data=prop.getProperty(keys);
			return keys;
			
		}

	}

}
