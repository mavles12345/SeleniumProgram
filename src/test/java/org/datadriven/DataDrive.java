package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrive {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\Datafile.xlsx");

		FileInputStream inputStream = new FileInputStream(loc);

		Workbook work = new XSSFWorkbook(inputStream);

		Sheet sheet = work.getSheet("input");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				
				int type =cell.getCellType();
				
				if (type==1) {
					
					String string=cell.getStringCellValue();
					
				} else if(type==0) {
					
					if (DateUtil.isCellDateFormatted(cell)) {
						
						Date date=cell.getDateCellValue();
						
						SimpleDateFormat d=new SimpleDateFormat("dd/mm/yy");
						
						String fo=d.format(date);
						System.out.println(fo);
						
						
					} else {
						
						double number =cell.getNumericCellValue();
						
						long d=(long)number;
						
						String s=String.valueOf(d);
						System.out.println(s);

					}

				}

			}

		}

	}

}
