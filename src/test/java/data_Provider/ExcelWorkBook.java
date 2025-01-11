package data_Provider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
class ExcelWorkBook{
@DataProvider(name="login")
public Object[][] provider(){
	Object[][] obj=new Object[2][2];
	obj[0][0]="admin@gmail.com";
	obj[0][1]="admin01@";
	
	obj[1][0]="admin@gmail.com";
	
	obj[1][1]="admin02";
	return obj;
}
@Test(dataProvider="login")
public void receiver(String username,String password) throws InterruptedException, EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\User\\Downloads\\Datadrivern.xlsx"); 
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("sheet1");
	int row=sheet.getPhysicalNumberOfRows();
	int column=sheet.getRow(0).getPhysicalNumberOfCells();
	Object [][] Obj=new Object[1][1];

for(int i=0;i<row;i++) {
for(int j=0;j<column;j++) {
Obj[i][j]=sheet.getRow(i).getCell(j).toString();

}
}
}
}
