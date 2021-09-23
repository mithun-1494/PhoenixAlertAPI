//package steps;
//
//import java.io.File;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.regex.Pattern;
//
//import org.apache.commons.io.FileUtils;
//import org.junit.internal.Throwables;
//import org.testng.ISuite;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import resources.PropertiesFile;
//
//
//
//public class ExtentReport 
//{
//	static String date = Base.Randomized.getCurrentDate("MMddYYYY");
//	public static ExtentSparkReporter htmlReporter;
//	 public static ExtentReports extent;
//	 public static  ExtentTest logger;
//	 public static  ExtentTest childLogger;
//	 public static String screenName;
//	 public static ExtentReports smokeExtent;
//	 public static  ExtentTest console;
//	
//	
//	 
//	
//// Defect scripts
//	public static  void startReport(String suiteName) 
//	 {
//		
//		String pattern = Pattern.quote(System.getProperty("file.separator"));
//		String[] separatedfile = suiteName.split(pattern);
//		String fileName =separatedfile[separatedfile.length-1];
//		String folderName =separatedfile[separatedfile.length-2];
//		String file = fileName;
//	     if(file.contains(".")){
//	    	 file= file.substring(0, file.indexOf(".")); 
//	     }
//	  
//	     String src =  scenario.getName();
//		   String Setup;
//		   if(url.contains("87"))
//			   Setup = "14.87";
//		   else if(url.contains("82"))
//			   Setup = "14.82";
//		   else if(url.contains("45"))
//			   Setup = "14.45";
//		   else if(url.contains("100"))
//			   Setup = "15.100";
//		   else
//			   Setup = "Demo";
//	//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
//	     htmlReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+folderName+"\\"+file+".html"));     
//		 htmlReporter.config().setEncoding("utf-8");
//		 htmlReporter.config().setDocumentTitle("Automation Reports");          
//		 htmlReporter.config().setReportName("Suite Files Result");         
//		 htmlReporter.config().setTheme(Theme.DARK);
//		 
//		 	extent = new ExtentReports();
//		 	 extent.setSystemInfo("Host Name", "CHPNXDT_439");
//			 extent.setSystemInfo("Environment", "Mahesha K S");
//			 extent.setSystemInfo("User Name", "Automation Team");
//		 	extent.attachReporter(htmlReporter);
//		 		       
//		 }
//	
//	
//	public static  void startReportSmokeTest(String Module) 
//	 {
//		
//		String projectName = null;
//		String Setup =null;	
//		if(PropertiesFile.readPropertiesFile("url").contains("87"))
//			Setup="14.87";
//		else if(PropertiesFile.readPropertiesFile("url").contains("82"))
//			Setup="14.82";
//		else if(PropertiesFile.readPropertiesFile("url").contains("45"))
//			Setup="14.45";
//		else if(PropertiesFile.readPropertiesFile("url").contains("crmtest"))
//			Setup="CRMTestServer";
//		else if(PropertiesFile.readPropertiesFile("url").contains("15.100"))
//			Setup="15100Demo";
//		
//		 HashMap<Integer,String> project=new HashMap<Integer,String>();
//		project.put(1, "BaseSmokeTest");
//		project.put(2, "PoliceSmokeTest");
//		project.put(3, "FireSmokeTest");
//		project.put(4, "IASmokeTest");
//		project.put(5, "CRMSmokeTest");
//		project.put(6, "CRMTestServerSmokeTest");
//		project.put(7, "15100DemoSmokeTest");
//		
//		if(System.getProperty("user.dir").contains("Base"))
//			projectName = project.get(1);
//		else	if(System.getProperty("user.dir").contains("Police"))
//			projectName = project.get(2);
//		else	if(System.getProperty("user.dir").contains("Fire"))
//			projectName = project.get(3);
//		else	if(System.getProperty("user.dir").contains("IA"))
//			projectName = project.get(4);
//		else	if(System.getProperty("user.dir").contains("CRM"))
//			projectName = project.get(5);
//		System.out.println(projectName+" ----- "+Setup);
//	//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
//	     htmlReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+"SmokeTest"+"\\"+projectName+"\\"+Module+".html"));     
//		 htmlReporter.config().setEncoding("utf-8");
//		 htmlReporter.config().setDocumentTitle("Automation Reports");          
//		 htmlReporter.config().setReportName("Suite Files Result");         
//		 htmlReporter.config().setTheme(Theme.DARK);
//		 
//		 	extent = new ExtentReports();
//		 	 extent.setSystemInfo("Host Name", "CHPNXDT_439");
//			 extent.setSystemInfo("Environment", "Mahesha K S");
//			 extent.setSystemInfo("User Name", "Automation Team");
//		 	extent.attachReporter(htmlReporter);
//		 		       
//		 }
//	// Defect scripts and Smoke
//	 public static void CreateTest(String name)
//	 {	
//		 
//		   logger = extent.createTest(name);
//		   System.out.println("Running ......      "+ name );
//		   	
//	 }
//	// Defect scripts and Smoke
//	 public static void CreateNode(String name)
//	 {
//		 
//		 childLogger= logger.createNode(name, "Running------>Screen   +"+name);
//		
//	 }
//	
//	// Defect scripts
//	 public static void getResult(ITestResult result) throws Exception
//		{
//			String methodName = result.getMethod().getMethodName();
//			String logText = "<b>"+ methodName;
//			 if(result.getStatus() == ITestResult.FAILURE)
//			 {
//			 //MarkupHelper is used to display the output in different colors
//			 logger.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED", ExtentColor.RED));
//			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
//			 logger.fail(result.getThrowable());
//			// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
//			 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
//			 //+Throwables.getStackTraceAsString(result.getThrowable())
//			
//		
//			 }
//			 else if(result.getStatus() == ITestResult.SKIP){
//			 logger.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED", ExtentColor.ORANGE)); 
//			 } 
//			 else if(result.getStatus() == ITestResult.SUCCESS)
//			 {
//			 logger.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED", ExtentColor.GREEN));
//			 }
//			
//		}
//	// Smoke
//		public static void getResultSmoke(ITestResult result) throws Exception
//		{
//	
//			String methodName = result.getMethod().getMethodName();
//			String logText = "<b>"+ methodName;
//			 if(result.getStatus() == ITestResult.FAILURE)
//			 {
//				 
//			 //MarkupHelper is used to display the output in different colors
//				 childLogger.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED", ExtentColor.RED));
//				 childLogger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
//				 childLogger.fail(result.getThrowable());
//			// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
//			 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
//			 //+Throwables.getStackTraceAsString(result.getThrowable())
//			
//			 
//			 }
//			 else if(result.getStatus() == ITestResult.SKIP){
//				 childLogger.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED", ExtentColor.ORANGE)); 
//			 } 
//			 else if(result.getStatus() == ITestResult.SUCCESS)
//			 {
//		
//				 childLogger.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED", ExtentColor.GREEN));
//			
//			 }
//			 else if(result.getStatus() == ITestResult.STARTED)
//			 {
//				 childLogger.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> Error", ExtentColor.RED));
//				 childLogger.log(Status.FAIL,result.getThrowable());
//			 }
//			 else if(result.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILURE)
//			 {
//				 childLogger.log(Status.WARNING, MarkupHelper.createLabel(logText+"----> PASSED", ExtentColor.BLUE));
//				 childLogger.log(Status.FAIL,result.getThrowable());
//			 }
//				
//		}
//		
//		
//		//  Smoke
//		public static void LogInfo(String name) throws Exception
//		{		
//					
//			childLogger.log(Status.FAIL, MarkupHelper.createLabel(name+"----> Error", ExtentColor.RED));
//			 childLogger.log(Status.FAIL,String.valueOf(Thread.currentThread().getStackTrace()));
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		//  Smoke consolidate
//		public static  void startConsolidatedReport(String suiteName) 
//		 {
//			
//			String pattern = Pattern.quote(System.getProperty("file.separator"));
//			String[] separatedfile = suiteName.split(pattern);
//			String fileName =separatedfile[separatedfile.length-1];
//			String folderName =separatedfile[separatedfile.length-2];
//			String file = fileName;
//		     if(file.contains(".")){
//		    	 file= file.substring(0, file.indexOf(".")); 
//		     }
//		     
//		     String url =  PropertiesFile.readPropertiesFile("url");
//			   String Setup;
//			   if(url.contains("87"))
//				   Setup = "14.87";
//			   else if(url.contains("82"))
//				   Setup = "14.82";
//			   else if(url.contains("45"))
//				   Setup = "14.45";
//			   else if(url.contains("100"))
//				   Setup = "15.100";
//			   else
//				   Setup = "Demo";
//		//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
//		     htmlReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+folderName+"\\"+file+".html"));     
//			 htmlReporter.config().setEncoding("utf-8");
//			 htmlReporter.config().setDocumentTitle("Automation Reports");          
//			 htmlReporter.config().setReportName("Suite Files Result");         
//			 htmlReporter.config().setTheme(Theme.DARK);
//			 
//			 smokeExtent = new ExtentReports();
//			 smokeExtent.setSystemInfo("Host Name", "CHPNXDT_439");
//			 smokeExtent.setSystemInfo("Environment", "Mahesha K S");
//			 smokeExtent.setSystemInfo("User Name", "Automation Team");
//			 smokeExtent.attachReporter(htmlReporter);
//			 		       
//			 }
//		 public static void CreateConsolidatedTest(String name)
//		 {	
//			 
//			   console = smokeExtent.createTest(name);
//			   System.out.println("Running ......      "+ name );
//			   	
//		 }
//	//  Smoke consolidate
//		 public static void getConsolidatedResult(ITestResult result) throws Exception
//			{
//				String methodName = result.getMethod().getMethodName();
//				String logText = "<b>"+ methodName;
//				 if(result.getStatus() == ITestResult.FAILURE)
//				 {
//				 //MarkupHelper is used to display the output in different colors
//					 console.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED", ExtentColor.RED));
//					 console.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
//					 console.fail(result.getThrowable());
//				// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
//				 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
//				 //+Throwables.getStackTraceAsString(result.getThrowable())
//			
//			
//				 }
//				 else if(result.getStatus() == ITestResult.SKIP){
//					 console.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED", ExtentColor.ORANGE)); 
//				 } 
//				 else if(result.getStatus() == ITestResult.SUCCESS)
//				 {
//					 console.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED", ExtentColor.GREEN));
//				 }
//				
//			}
//		
//			
//		public static  void GenerateHTML()
//		{
//		
//		 extent.flush();
//	 
//		}
//		
//		public static  void GenerateConsolidateHTML()
//		{
//		
//			smokeExtent.flush();
//	 
//		}
//
//
//		public static void TotalTestsInSuite(ISuite suite)
//		{
//			int count =suite.getAllMethods().size();
//			System.out.println("Total Num of tests In Suite >   "+count);
//		}
//					
//}
