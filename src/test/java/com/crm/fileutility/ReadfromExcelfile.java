package com.crm.fileutility;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromExcelfile {

	public class ReadFromExcelFile {
		public String readexcel(String s,int row,int colomn) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("C:\\Users\\User\\Downloads\\Datadrivern.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet("Sheet1");
			String data =sheet.getRow(row).getCell(colomn).toString();
			return data;
			
		}

	}

}
