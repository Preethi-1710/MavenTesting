package org.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactinHotel {

    public static void main(String[] args) throws IOException {
		
    	File f = new File("C:\\Users\\preet\\eclipse-workspace\\MavenProj\\workbook\\data2.xlsx");
    	
//    	https://www.toolsqa.com/selenium-webdriver/data-driven-framework/
    	Workbook book = new XSSFWorkbook();
    	
    	//to create sheet from workbook
    	Sheet createSheet = book.createSheet("BookingDetails");
    	
    	//to create row from sheet
    	Row r1 = createSheet.createRow(0);
    	Row r2 = createSheet.createRow(1);
    	Row r3 = createSheet.createRow(2);
    	Row r4 = createSheet.createRow(3);
    	
    	
    	//to create cell from row
    	Cell c1 = r1.createCell(0);
    	Cell c2 = r2.createCell(0);
        Cell c3 = r3.createCell(0);
        Cell c4 = r4.createCell(0);
        
        
    	//to pass the values
    	c1.setCellValue("Preethi");
    	c2.setCellValue("Preethi1710");
    	c3.setCellValue("Preethi1710");
    	c4.setCellValue("Preethi");
    	
    	FileOutputStream foutput = new FileOutputStream(f);
    	book.write(foutput);
    	System.out.println("Done");
    	
    	
	}
	
	
}
