package testNGInterviewPreparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelData {

	private InputStream oFileReader;
	private Workbook oExcelWorkbook;
	private String sExcelFileName;

	public String[][] createDataArray(String sFileName, String sSheetName) {
		String[][] dataArray = null;
		openExcelWorkbook(sFileName);
		int rows = getRowCountOfSheet(sSheetName);
		int cells = getCellCount(sSheetName, 1);
		System.out.println(rows + " " + cells);
		dataArray = new String[rows][cells];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				dataArray[i][j] = getCellData(sSheetName, i, j); 
				System.out.println(dataArray[i][j]);
			}
		}
		return dataArray;
	}

	public void openExcelWorkbook(String sFileName) {
		try {
			oFileReader = new FileInputStream(sFileName);
//			oExcelWorkbook = Workbook.createSheet(oFileReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowCountOfSheet(String sSheetName) {
		try {
			Sheet oSheet;
			oSheet = oExcelWorkbook.getSheet(sSheetName);
			System.out.println("Sheet Name: " + sSheetName);
			return oSheet.getPhysicalNumberOfRows();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// ------------------------------------------------------------------------

	public int getCellCount(String sSheetName, int iRow) {
		try {
			Sheet oSheet;
			oSheet = oExcelWorkbook.getSheet(sSheetName);
			Row oRow;
			oRow = oSheet.getRow(iRow - 1);
			return oRow.getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// ---------------------------------------------------------------------

	public String getCellData(String sSheetName, int iRow, int iCell) {
		try {
			Sheet oSheet;
			oSheet = oExcelWorkbook.getSheet(sSheetName);
			Row oRow;

			oRow = oSheet.getRow(iRow);
			Cell oCell;
			oCell = oRow.getCell(iCell);
			if (oCell == null) {
				return "";
			} else {
				if (oCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					System.out
							.println("Cell Value:"
									+ String.valueOf((long) oCell
											.getNumericCellValue()));
					return String.valueOf((long) oCell.getNumericCellValue());
				} else {
					System.out.println("String cell value: "
							+ oCell.getStringCellValue());
					return oCell.getStringCellValue();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}

}
