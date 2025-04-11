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

    @BeforeClass
    public void report() {
        reports = Reporter.generateExtentReport("SportsJam_Report");
    }

    @BeforeMethod
    public void open() {
        openBrowser();
    }

    @Test(enabled = true)
    public void testCase1() {
        Racket_Actions_Harshit obj = new Racket_Actions_Harshit();
        test = reports.createTest(Thread.currentThread().getName());
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

    @AfterClass
    public void reportflush() {
        reports.flush();
    }

}
