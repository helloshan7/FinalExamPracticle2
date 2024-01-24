package doesFileExists;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class DoesFileExists {
	String path = "src\\main\\java\\DictioneryFile.properties";
	String apple;
	String table;
	String orange;

	@Test
	public void doesFileExists() {

		try {

			InputStream input = new FileInputStream("src\\\\main\\\\java\\\\DictioneryFile.properties");
			Properties prop = new Properties();
			prop.load(input);
			System.out.println("File exists " + path );
			apple = prop.getProperty("apple");
			System.out.println("apple" + "\n" + apple);
			table = prop.getProperty("table");
			System.out.println("table" + "\n" + table);
			orange = prop.getProperty("orange");
			System.out.println("orange" + "\n" + orange);

		} catch (IOException e) {

			e.printStackTrace();
			
			

		}
	}

}
