package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelMultiData {

	@Test
	public void multiData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/datas.xlsx");
		Workbook wb= WorkbookFactory.create(fis);

		Sheet sht = wb.getSheet("Sheet1");
		int rows = sht.getPhysicalNumberOfRows();
		int cells=sht.getRow(0).getPhysicalNumberOfCells();

		for (int i = 1; i < rows; i++) {

			for (int j = 0; j < cells; j++) {

				if(j==0)
				{
					System.out.print("Name ::");
					System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());
					System.out.println();
				}
				if(j==1)
				{
					System.out.print("EmailID ::");
					System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());		
					System.out.println();
				}
				if(j==2)
				{
					System.out.print("About ::");
					System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());
					System.out.println();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}

			}
		}
		wb.close();
	}
}
