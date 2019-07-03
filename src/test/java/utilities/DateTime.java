package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	
	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = new Date();
		return formatter.format(date);
	}
	public static String getSystemDate() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		Date date = new Date();
		String formattedDate = formatter.format(date);
		System.out.println("Formatted Date is ::" + formattedDate);

		return formattedDate;
	}
	public String getTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH-mm-ss-SSS");
		Date date = new Date();
		return formatter.format(date);
	}

}
