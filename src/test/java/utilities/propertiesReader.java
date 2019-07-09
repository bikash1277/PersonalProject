package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {
	private Properties properties;
	public static String report=System.getProperty("user.dir");
	private final String propertiesPath= report+"//config.properties";
	public propertiesReader() {
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader(propertiesPath));
			properties =new Properties();
		try {
			properties.load(reader);
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		}
		catch(FileNotFoundException  e)
		{
			e.printStackTrace();
		}
	}

}
