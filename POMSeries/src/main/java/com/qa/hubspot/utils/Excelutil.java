package com.qa.hubspot.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutil {

	private static Workbook book;
	private static Sheet sheet;
	public static String TEST_DATA_SHEET_PATH = ".\\src\\main\\java\\com\\qa\\hubspot\\testdata\\TutorialsNinjaTestData.xlsx";
	
	
	public static Object[][] getTestData(String sheetname) {
		Object data[][] = null;

		try {
			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
			book = WorkbookFactory.create(ip);
			sheet = book.getSheet(sheetname);

			int rows = sheet.getLastRowNum();
			int nocols = sheet.getRow(0).getLastCellNum();

			data = new Object[rows][nocols];

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < nocols; j++) {

					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}
}
