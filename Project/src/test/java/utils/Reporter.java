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
    public static TakesScreenshot ts;
    public static ExtentReports report = null;
    public static ExtentTest test = null;
 
    /**
     * @Created by Harshit Gupta
     * @Description Creates an ExtentReports instance and attaches a SparkReporter to generate a report file.
     * @param name Name for the report file.
     * @return ExtentReports instance.
     */
    public static ExtentReports createExtentReporter(String name) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
                "/home/coder/project/workspace/Project/reports/" + name + ".html");
        report = new ExtentReports();
 
        report.attachReporter(sparkReporter);
        return report;
    }
 
    /**
     * @Created by Harshit Gupta
     * @Description Creates an ExtentTest instance with the specified test name.
     * @param extentTestName Name of the test for the report.
     * @return ExtentTest instance.
     */
    public static ExtentTest ExtentTest(String extentTestName) {
        test = report.createTest(extentTestName);
        return test;
    }
 
    /**
     * @Created by Harshit Gupta
     * @Description Flushes the report to write all logged data to the report file.
     * @param None
     * @return None
     */
    public static void extentReportFlush() {
        report.flush();
    }
 
    /**
     * @Created by Harshit Gupta
     * @Description Captures a screenshot and saves it with the specified filename and timestamp.
     * @param filename Base name for the screenshot file.
     * @return The relative path to the saved screenshot file.
     */
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
 
        String destPath = "./" + name;
 
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
 
    /**
     * @Created by Harshit Gupta
     * @Description Attaches a screenshot to the ExtentTest instance in the report with the provided description.
     * @param filename Base name for the screenshot file.
     * @param test ExtentTest instance to attach the screenshot to.
     * @param description Description of the screenshot.
     * @return None
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
