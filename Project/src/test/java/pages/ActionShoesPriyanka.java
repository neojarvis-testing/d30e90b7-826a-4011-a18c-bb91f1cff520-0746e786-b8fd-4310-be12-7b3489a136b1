package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarDropDownLocatorsPriyanka;
import uistore.NavBarLocatorsPriyanka;
import uistore.ProductDetailsPriyanka;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
import utils.Reporter;
import utils.Screenshot;

public class ActionShoesPriyanka extends Base{
    DriverHelper helper = new DriverHelper(driver);
    public void verifyHomepage()
    {
        String actual = driver.getCurrentUrl();
        String expected = ReadProperties.prop.getProperty("url");
        Assert.assertEquals(actual, expected);
    }
    public void hoveroverShoes(ExtentTest test)
    {
        helper.waitForElementToBeVisible(NavBarLocatorsPriyanka.hoverOverNavBarShoes, 5);
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        LoggerHandler.info(ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 0, 2));
        test.log(Status.INFO,ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 0, 2));

    }
    public void verifySubCategory()
    {
        WebElement men = driver.findElement(By.xpath("(//li//span[contains(text(),'Men')])[3]"));
        if(men.isDisplayed())
        {
                Assert.assertTrue(true);
        }
        WebElement women = driver.findElement(By.xpath("(//li//span[contains(text(),'Women')])[3]"));
        if(women.isDisplayed())
        {
                Assert.assertTrue(true);
        }
        WebElement junior = driver.findElement(By.xpath("(//li//span[contains(text(),'Junior')])[2]"));
        if(junior.isDisplayed())
        {
                Assert.assertTrue(true);
        }
       

    }
    public void clickBadmintoninMensecandVerify(ExtentTest test)
    {
        try{
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnBadminton);
        helper.waitForElementToBeVisible(NavBarLocatorsPriyanka.hoverOverNavBarShoes, 2);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyBadmintonShoes),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 0, 1) , test);
    }
    catch(AssertionError e){
        e.printStackTrace();
        }
    }

    public void hoverShoesandclickBasketBallandVerify(ExtentTest test)
    {
        try{

        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        test.log(Status.INFO,ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 0, 2));
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnBasketBall);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyBasketBall),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 1, 1) , test);
        }
        catch(AssertionError e){
            e.printStackTrace();
            }
    }
    public void clickCricketandverify(ExtentTest test)
    {
        try{
        
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
       
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnCricket);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyCricket),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 2, 1) , test);
        }
        catch(AssertionError e){
            e.printStackTrace();
            }

    }
    public void hoverShoesandClickOnFootball(ExtentTest test)
    {
        try{
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnFootball);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyFootball),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 3, 1) , test);
        LoggerHandler.info(ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 1, 2));
        test.log(Status.PASS,ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 1, 2));
        }
        catch(AssertionError e){
            e.printStackTrace();
            }
    }
    public void hoverShoesAndclickRunningandverify(ExtentTest test)
    {
        try{
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnRunning);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyRunning),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 4, 1) , test);
        }
        catch(AssertionError e){
            e.printStackTrace();
            }
    
    }

    public void hoverShoesandclickSquashandVerify(ExtentTest test)
    {
        try{
        helper.hoverOverElement(NavBarLocatorsPriyanka.hoverOverNavBarShoes);
        helper.clickOnElement(NavBarDropDownLocatorsPriyanka.clickOnSquash);
        Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifysquash),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Priyanka", 5, 1) , test);

        Screenshot.captureScreenShot("squash");
        Reporter.attachScreenshotToReport("squash", test, "Screenshot attached to report", driver);
        }
        catch(AssertionError e){
        e.printStackTrace();
        }
        
    }


}
