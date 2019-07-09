package seleniumInterviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) {
		try {
			FileInputStream finS=new FileInputStream(new File(System.getProperty("user.dir")+"\\resources\\Report.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(finS);
			XSSFSheet sheet= workbook.getSheetAt(0);
			Cell cell;
			System.out.println(sheet);
	
			System.out.println(sheet.getLastRowNum());
			
			System.out.println(sheet.getPhysicalNumberOfRows());
			
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			for (int i = 0; i < rowCount+1; i++) {
		        Row row = sheet.getRow(i);
		        //Create a loop to print cell values in a row
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            //Print Excel data in console
		        	if(row.getCell(j).getCellType()==row.getCell(j).CELL_TYPE_NUMERIC) {
		        		System.out.print(row.getCell(j).getNumericCellValue()+" ||");
		        	}
		        	else {
		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
		        	}
		        }
		        System.out.println();
		    }
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

}
