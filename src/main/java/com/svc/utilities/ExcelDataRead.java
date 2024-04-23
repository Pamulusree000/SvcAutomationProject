package com.svc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static Object [][] excelDataTest(String Sheet) throws IOException
	{
		
		String excelpath="./src/test/resources/testData/Exceldata.xlsx";
		
		File file=new File(excelpath);
		
		FileInputStream fis=new FileInputStream(file);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(Sheet);
		
		int noRow=sheet.getPhysicalNumberOfRows();
		
		int noCol=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object [][]data =new Object [noRow-1][noCol];
		
		for(int i=1;i<noRow;i++)
		{
			for (int j=0;j<noCol;j++)
			{
			String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
			
			data[i-1][j]= cellData;			
			}
			
		}
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
