package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Reporter extends Base {
    public static TakesScreenshot ts ;
     private static ExtentReports report = null;
     private static ExtentTest test = null;

    public static void createExtentReporter( String name){
        
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("/home/coder/project/workspace/Project/reports/" +name+ ".html");
        report = new ExtentReports();
        
        report.attachReporter(sparkReporter);

    }
    public static ExtentTest ExtentTest(String extentTestName){
     test = report.createTest(extentTestName);
        return test;
    }
   
    public static void extentReportFlush(){
        report.flush();

    }
    public static String captureScreenShot(String filename) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String name = filename + timestamp + ".png";

		String destPath =  "./"+name;

		ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);

		
		File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
        
		if (!screenshotsDir.exists()) {
			screenshotsDir.mkdirs();
		}

		File target = new File(screenshotsDir, name);
		try {
			Files.copy(file, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destPath;
	}

    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
	
	
	}

}