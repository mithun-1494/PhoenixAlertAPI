package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class ExtentReportUtil extends BaseUtil {
	
	


    String fileName = reportLocation + "extentreport.html";


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();

        ExtentSparkReporter spark = new ExtentSparkReporter(fileName);

        extent.attachReporter(spark);

    }

//    public void ExtentReportScreenshot() throws IOException {
//
//        TakesScreenshot scr = (TakesScreenshot) Driver;
//        File source = scr.getScreenshotAs(OutputType.FILE);
//        Files.copy(source.toPath(), new File(reportLocation + "screenshot.png").toPath());
//        scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation + "screenshot.png");
//    }


    public void FlushReport(){
        extent.flush();
    }




}
