package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import net.minidev.json.JSONObject;


public class BaseUtil {


    public ExtentReports extent;

    public static ExtentTest scenarioDef;

    public  ExtentTest features;

    public String reportLocation = "D:\\Latest\\L3\\APICucucumber\\Results";
    
    public static JSONObject requestParams;
    

}
