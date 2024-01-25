package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWrite {

	@Test
	public void writeExcel() throws EncryptedDocumentException, IOException {
		try {
			FileInputStream fis = new FileInputStream("./data/datadriveninput.xlsx");
		    XSSFWorkbook wb = new XSSFWorkbook(fis);

			wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("PARTHIBHAN");
			FileOutputStream fos = new FileOutputStream("./data/datadriveninput.xlsx");
			wb.write(fos);
			wb.close();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
