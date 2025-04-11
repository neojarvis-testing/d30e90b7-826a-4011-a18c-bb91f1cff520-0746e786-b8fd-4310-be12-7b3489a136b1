package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ActionPumaHomepagePriyanka;
import pages.ActionShoesPriyanka;
import utils.Base;
import utils.Reporter;

public class TestRunner_Priyanka extends Base{
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass
    public void report()
    {
        reports =  Reporter.generateExtentReport("SportsJam_Report");
    }

   @BeforeMethod
   public void baseMethod() {
    
        openBrowser();
      
    }

    @Test(enabled = true , priority = 1) 
    public void pumaProducts()
    {
        ActionPumaHomepagePriyanka puma = new ActionPumaHomepagePriyanka();
        test= reports.createTest(Thread.currentThread().getName());
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
    @Test(enabled = true,priority = 2)
    public void shoesNavBar()
    {
        ActionShoesPriyanka shoes = new ActionShoesPriyanka();
        test= reports.createTest("Shoes_Module");
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
    public void tearDown()
    {
        driver.quit();
    }

      @AfterClass
    void flushRep() {
       // reports.flush();
       reports.flush();
    }

}
