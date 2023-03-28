package dataproviders;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static String[][] readData() throws IOException {
		// step 1 : identify the workbook
		XSSFWorkbook ex = new XSSFWorkbook("./excel/sheett.xlsx");
		// identify sheet
		// identify row
		// identify cell
		// identify string value
		// print string
		XSSFSheet sheet = ex.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(1).getLastCellNum();
		String[][] data=new String [rowCount][lastCellNum];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;						
			}
		}
        ex.close();
		return data;
	}
	
}
