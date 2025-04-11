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
        reports = Reporter.generateExtentReport("SportsJam_Report");
    }

    @BeforeMethod
    public void openingbro() {
        openBrowser();
    }

    @Test(enabled = true, priority = 1)
    public void racket_first_Prods() {
        HomepageActions_Uday uday = new HomepageActions_Uday();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        uday.rackethoverclick(test);
        uday.clickingfirstProduct(test);
        uday.navigateBackHome(test);
    }

    @Test(enabled = true, priority = 2)
    public void comparing_sports_shoes() {
        HomepageActions_Uday1 uday1 = new HomepageActions_Uday1();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
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
        reports.flush();
    }
}
