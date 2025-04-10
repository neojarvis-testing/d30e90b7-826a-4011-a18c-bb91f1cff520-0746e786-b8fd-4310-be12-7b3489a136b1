package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Racket_Actions_Harshit;
import utils.Base;
import utils.Reporter;

public class TestRunner_Harshit extends Base {

    public static ExtentTest test;
    public static ExtentReports reports;

    @BeforeMethod
    public void open() {
        openBrowser();

    }

    @Test(enabled = true)
    public void testCase1() {
        Racket_Actions_Harshit obj = new Racket_Actions_Harshit();
        test = reports.createTest("Racket Module");
        obj.selectRacket(test);
        obj.applyFilter(test);
        obj.selectClothing(test);
        obj.selectAccessories(test);
        obj.selectRunning(test);

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

    @BeforeClass
    public void report() {
        reports = Reporter.createExtentReporter("SPORT_JAM_Report");
    }

    @AfterClass
    public void reportflush() {
        Reporter.extentReportFlush();
    }

}
