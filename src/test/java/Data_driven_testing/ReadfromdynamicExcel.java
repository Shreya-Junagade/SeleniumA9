package Data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromdynamicExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\Downloads\\Datadrivern.xlsx"); 
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
	
for(int i=0;i<10;i++) {
	for(int j=0;j<3;j++) {
		String data =sheet.getRow(i).getCell(j).toString();
		System.out.println(data);
	}
}

	}

}
