package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.LokeshTestCase4Action;
import pages.LokeshTestCase5Action;
import utils.Base;
import utils.Reporter;

public class TestRunner_Lokesh extends Base{

    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void createReport() {
        reports = Reporter.generateExtentReport("SportsJam_Report");
    }

    @BeforeMethod
    public void launchBrowser() {

        openBrowser();
    }

    @Test(priority = 1, enabled = true)
    public void teamsport() {
        test = reports.createTest(Thread.currentThread().getName());
        LokeshTestCase4Action testCase4Action = new LokeshTestCase4Action();
        testCase4Action.NavBar_Batting_Gloves(test);
        testCase4Action.NavBar_Batting_Leg_Guards(test);
        testCase4Action.NavBar_Wicket_Keeping_Gloves(test);
        testCase4Action.NavBar_Wicket_Keeping_Leg_Guards(test);
        testCase4Action.NavBar_Circket_Helmets(test);
        testCase4Action.NavBar_Inner_Thigh_Pads(test);
    }

    @Test(priority = 2, enabled = true)
    public void fitness() {
        test = reports.createTest(Thread.currentThread().getName());
        LokeshTestCase5Action testCase5Action = new LokeshTestCase5Action();
        testCase5Action.NavBar_Fitness(test);
        testCase5Action.Gym_Gloves(test);
        testCase5Action.add_to_cart(test);
        testCase5Action.checkout(test);

    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }

    @AfterClass
    public void closereport() {
        reports.flush();
    }
    
}
