package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.HomepageActions_Uday;
import pages.HomepageActions_Uday1;
import utils.Base;
import utils.Reporter;

public class TestRunner_uday extends Base {
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void report() {
        reports = Reporter.createExtentReporter("SPORT_JAM_Report");
    }

    @BeforeMethod
    public void openingbro() {
        openBrowser();
    }

    @Test(enabled = true, priority = 1)
    public void testcase2() {
        HomepageActions_Uday uday = new HomepageActions_Uday();
        test = reports.createTest("Racket_sports");
        uday.rackethoverclick(test);
        uday.clickingfirstProduct(test);
        uday.navigateBackHome(test);
    }

    @Test(enabled = true, priority = 2)
    public void testcase3() {
        HomepageActions_Uday1 uday1 = new HomepageActions_Uday1();
        test = reports.createTest("comparing_modules");
        uday1.hoversportsandsports(test);
        uday1.listingviewcompare(test);
        uday1.removingProducts(test);
    }

    @AfterMethod
    public void exitbrow() {
        driver.quit();
    }

    @AfterClass
    public void reportflush() {
        Reporter.extentReportFlush();
    }
}
