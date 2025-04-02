package com.alok.project1.ApachePOIDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMain {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        Workbook workbook = null;

        try {
            // Load the Excel file
            fileInputStream = new FileInputStream("C:\\Users\\alosingh8\\Desktop\\java\\ApachePOIDemo\\src\\main\\java\\com\\alok\\project1\\ApachePOIDemo\\file1.xlsx");
            workbook = new XSSFWorkbook(fileInputStream);

            // Get the number of sheets in the workbook
            int noOfSheets = workbook.getNumberOfSheets();

            // Iterate through each sheet
            for (int i = 0; i < noOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator<Row> roIter=sheet.iterator();
                
                while (roIter.hasNext()) {
//                	System.out.println(roIter.next());                	
                	Row row=roIter.next();
                	Iterator<Cell> cellIter=row.cellIterator();
                	
                	while (cellIter.hasNext()) {
                		Cell cell=cellIter.next();
                		switch(cell.getCellType()) {
                		
                		case NUMERIC:
                			System.out.println(cell.getNumericCellValue());
                			break;
                		
                		case STRING:
                			System.out.println(cell.getStringCellValue());
                			break;
						default:
							break;
                		}
                	}
                }
                
                
                
                
                
                System.out.println("Sheet Name: " + sheet.getSheetName());
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
