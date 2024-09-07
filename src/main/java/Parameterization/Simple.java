package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Simple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Users\\Sanket\\Desktop\\Screesnhot\\Excel.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		FileInputStream file1 = new FileInputStream(path);
		
		String data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data1);
		
		FileInputStream file2 = new FileInputStream(path);
		
		String data2 = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data2);

	}

}
