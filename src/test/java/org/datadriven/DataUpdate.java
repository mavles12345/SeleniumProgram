package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUpdate {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\Datafile.xlsx");
		
		FileInputStream in=new FileInputStream(f);
		
		Workbook work=new XSSFWorkbook(in);
		
		Sheet sheet=work.getSheet("input");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(0);
		
		cell.setCellValue("Selvam M");
		
		FileOutputStream out=new FileOutputStream(f);
		
		work.write(out);
	
		
		
		
		
	}

}
