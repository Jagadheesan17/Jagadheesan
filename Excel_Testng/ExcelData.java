package mylearn;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		// step 1 : identify the workbook
		@SuppressWarnings("resource")
		XSSFWorkbook ex = new XSSFWorkbook("./Data/empData.xlsx");
		// identify sheet
		// identify row
		// identify cell
		// identify string value
		// print string
		XSSFSheet sheet = ex.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("NumberOfColumns ="+lastCellNum);
		System.out.println("rowCount =" + rowCount);
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 2; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}

		}

	}
}
