package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportLogger {

    public static ExtentReports extent = null;
    public static ExtentTest test = null;
    private static String pathLog = "";

    public static void setupReporter(){

    }

    public static void setupTest(){

    }

    public static void addLog(){

    }

    public static void addException(){

    }

    public static void addCodeBlock(){

    }

    public static void generateReport(){

        extent.flush();
    }
}
