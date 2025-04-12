package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BrandActionPage;
import pages.FooterActionPage;
import pages.HomepageActionPage;
import pages.NavBarActionPage;
import pages.RacketActionPage;
import pages.ShoesActionPage;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base {

    public ExtentTest test;
    public ExtentReports reports;

    @BeforeClass
    public void baseReport() {
        reports = Reporter.generateExtentReport("SportsJam_Report");
    }

    @BeforeMethod
    public void baseMethod() {
        openBrowser();
    }

    @Test(priority = 1, enabled = true)
    public void racket_action_clothing() {
        RacketActionPage obj = new RacketActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        obj.selectRacket(test);
        obj.applyFilter(test);
        obj.selectClothing(test);
        obj.selectAccessories(test);
        obj.selectRunning(test);
    }

    @Test(priority = 2, enabled = true)
    public void racket_first_Prods() {
        HomepageActionPage uday = new HomepageActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        uday.rackethoverclick(test);
        uday.clickingfirstProduct(test);
        uday.navigateBackHome(test);
    }

    @Test(priority = 3, enabled = true)
    public void comparing_sports_shoes() {
        HomepageActionPage uday1 = new HomepageActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        uday1.hoversportsandsports(test);
        uday1.listingviewcompare(test);
        uday1.removingProducts(test);
    }

    @Test(priority = 4, enabled = true)
    public void teamsport() {
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        NavBarActionPage testCase4Action = new NavBarActionPage();
        testCase4Action.NavBar_Batting_Gloves(test);
        testCase4Action.NavBar_Batting_Leg_Guards(test);
        testCase4Action.NavBar_Wicket_Keeping_Gloves(test);
        testCase4Action.NavBar_Wicket_Keeping_Leg_Guards(test);
        testCase4Action.NavBar_Circket_Helmets(test);
        testCase4Action.NavBar_Inner_Thigh_Pads(test);
    }

    @Test(priority = 5, enabled = true)
    public void fitness() {
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        NavBarActionPage testCase5Action = new NavBarActionPage();
        testCase5Action.NavBar_Fitness(test);
        testCase5Action.Gym_Gloves(test);
        testCase5Action.add_to_cart(test);
        testCase5Action.checkout(test);
    }

    @Test(priority = 6, enabled = true)
    public void createAccount() {
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        HomepageActionPage actions = new HomepageActionPage();
        actions.navigateToLoginPage(test);
        actions.navigateToCreateAccountPage(test);
        actions.createAccount(test);
        actions.logout(test);
        actions.loginWithExistingUser(test);
    }

    @Test(priority = 7, enabled = true)
    public void footerHereToHelp() {
        FooterActionPage a = new FooterActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());

        a.clickRegisterLogin(test);
        a.clickDeliveryCharges(test);
        a.clickPaymentOption(test);
        a.clickFAQ(test);
        a.clickReturnPolicy(test);
    }

    @Test(priority = 8, enabled = true)
    public void footerSocialMedia() {
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        FooterActionPage a = new FooterActionPage();
        a.clickFacebook(test);
        a.clickYoutube(test);
        a.clickInstagram(test);
        a.clickTwitter(test);
    }

    @Test(priority = 9, enabled = true)
    public void pumaProducts() {
        BrandActionPage puma = new BrandActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        puma.verifyHomepageandclickOnBrands(test);
        puma.verifyBrandPageandTypePuma(test);
        puma.clickNextAndverifySearchResults(test);
        puma.verifyBrandpagelistingallproducts();
        puma.clickAccessoriesandverifyUpdate();
        puma.hoveroverproductandclickQuickView();
        puma.verifyandclickWishList(test);
        puma.verifypromt(test);
        puma.logincredentials();
        puma.signInAndverifyerrorMessage(test);
    }

    @Test(priority = 10, enabled = true)
    public void shoesNavBar() {
        ShoesActionPage shoes = new ShoesActionPage();
        test = reports.createTest(new Throwable().getStackTrace()[0].getMethodName());
        shoes.verifyHomepage();
        shoes.hoveroverShoes(test);
        shoes.verifySubCategory();
        shoes.clickBadmintoninMensecandVerify(test);
        shoes.hoverShoesandclickBasketBallandVerify(test);
        shoes.clickCricketandverify(test);
        shoes.hoverShoesandClickOnFootball(test);
        shoes.hoverShoesAndclickRunningandverify(test);
        shoes.hoverShoesandclickSquashandVerify(test);
    }

    @AfterMethod
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void flushReport() {
        reports.flush();
    }

}
