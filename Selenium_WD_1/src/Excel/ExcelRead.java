package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelRead {

	@Test
	public void read() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/datas.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		String value = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String value1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		System.out.println(value1);
	}
}
