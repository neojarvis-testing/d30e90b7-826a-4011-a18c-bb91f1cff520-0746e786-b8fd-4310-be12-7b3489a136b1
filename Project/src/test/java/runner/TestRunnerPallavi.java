package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FooterAction_Pallavi;
import utils.Base;
import utils.Reporter;

public class TestRunnerPallavi extends Base {
    public static ExtentReports report;
    public static ExtentTest test;
    
    @BeforeClass
    public void rep(){
        report = Reporter.generateExtentReport("SportsJam_Report");
        
    }
    
    @BeforeMethod
    public void open(){
        openBrowser();
    }
    
    @Test
    public void footerHereToHelp(){
        FooterAction_Pallavi a = new FooterAction_Pallavi();
        test = report.createTest(Thread.currentThread().getName());
        
        a.clickRegisterLogin(test);
        a.clickDeliveryCharges(test);
        a.clickPaymentOption(test);
        a.clickFAQ(test);
        a.clickReturnPolicy(test);
        
    }
    
    @Test
    public void footerSocialMedia(){
       FooterAction_Pallavi a = new FooterAction_Pallavi();
        a.clickFacebook(test);
        a.clickYoutube(test);
        a.clickInstagram(test);
        a.clickTwitter(test);

    }



    @AfterMethod
    public void close(){
        driver.quit();
    }

    @AfterClass
    public void flush(){
        report.flush();
    }
}
