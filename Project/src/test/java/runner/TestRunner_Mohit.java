package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomepageAction_Mohit;
import utils.Base;
import utils.Reporter;

public class TestRunner_Mohit extends Base{

    public ExtentTest test;
    public ExtentReports reports;

    @BeforeClass
    public void baseReport(){
        reports = Reporter.createExtentReporter("Report");
    }

    @BeforeMethod
    public void baseMethod(){
        openBrowser();
    }

    @Test
    public void createAccount(){
        test = reports.createTest("LoginModule");
        HomepageAction_Mohit actions = new HomepageAction_Mohit();
        actions.navigateToLoginPage(test);
        actions.navigateToCreateAccountPage(test);
        actions.createAccount(test);
        actions.logout(test);
        actions.loginWithExistingUser(test);

    }

    @AfterMethod
    public void quitDriver(){
        if(driver!= null){
            driver.quit();
        }
    }

    @AfterClass
    public void flushReport(){
        reports.flush();
    }


}
