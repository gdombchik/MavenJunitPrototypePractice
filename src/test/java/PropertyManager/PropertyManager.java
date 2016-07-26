package PropertyManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	public String contactFormNameField = "";
	public String contactFormNameValue = "";
	
	public void generateProperty(){
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("src/test/java/com/cucumber/MavenJunitPrototypePractice/parameters.properties");
			prop.load(input);
			
			contactFormNameField = prop.get("name_field").toString();
			contactFormNameValue = prop.get("name_value").toString();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
