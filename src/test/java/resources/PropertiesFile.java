package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.InputStream;
import java.io.OutputStream;

public class PropertiesFile {
	
	static Properties Property = new Properties(); 
	
	public static void main(String[] args)
	{
	readPropertiesFile("Password");
	//writePropertiesFile();
	}
	
	public static String readPropertiesFile(String input)
	{				
		String Prop = null;		
		try { 											
			InputStream FileRead = new FileInputStream("D:\\Latest\\L3\\APICucucumber\\src\\test\\java\\resources\\config.properties");
			
			 Property.load(FileRead);
			//System.out.println(Property.getProperty("UserName"));
			//PnxBaseTest.PnxBaseTest.BrowserType = Property.getProperty("BrowserType");
			 Prop = Property.getProperty(input);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return Prop;
		
	}
	
	public static String getReportConfigPath(){
		String reportConfigPath = Property.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	public static void writePropertiesFile()
	{
		try {
			OutputStream output = new FileOutputStream("\\\\PhoenixScrum\\\\TestAutomation\\\\Main\\\\SeleniumJava\\\\PhoenixPoliceTest\\\\src\\\\test\\\\java\\\\resources\\\\config.properties");
			//Property.setProperty("BrowserType", "IE");
			Property.setProperty("result", "pass");
			Property.store(output, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
