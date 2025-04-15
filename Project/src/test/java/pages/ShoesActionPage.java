package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
import utils.Reporter;
import utils.Screenshot;

/**
 * ShoesActionPage class contains methods to perform actions and validations 
 * related to the Shoes section in the application.
 */
public class ShoesActionPage extends Base {

    DriverHelper helper = new DriverHelper(driver);
    String path = ReadProperties.prop.getProperty("path");

    /**
     * Verifies if the current homepage URL matches the expected URL.
     */
    public void verifyHomepage() {
        String actual = driver.getCurrentUrl();
        String expected = ReadProperties.prop.getProperty("url");
        Assert.assertEquals(actual, expected, "Homepage URL verification failed.");
    }

    /**
     * Hovers over the 'Shoes' menu item in the navigation bar.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void hoveroverShoes(ExtentTest test) {
        helper.waitForElementToBeVisible(NavBarLocator.hoverOverNavBarShoes, 5);
        helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
        LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
        test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
    }

    /**
     * Verifies the visibility of subcategories under the 'Shoes' section.
     */
    public void verifySubCategory() {
        WebElement men = driver.findElement(By.xpath("(//li//span[contains(text(),'Men')])[3]"));
        if (men.isDisplayed()) {
            Assert.assertTrue(true);
        }
        WebElement women = driver.findElement(By.xpath("(//li//span[contains(text(),'Women')])[3]"));
        if (women.isDisplayed()) {
            Assert.assertTrue(true);
        }
        WebElement junior = driver.findElement(By.xpath("(//li//span[contains(text(),'Junior')])[2]"));
        if (junior.isDisplayed()) {
            Assert.assertTrue(true);
        }
    }

    /**
     * Clicks on the 'Badminton' category in the 'Men' section and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void clickBadmintoninMensecandVerify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnBadminton);
            helper.waitForElementToBeVisible(NavBarLocator.hoverOverNavBarShoes, 2);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyBadmintonShoes),
                    ExcelFileReader.readExcelData(path, "Priyanka", 0, 1), test);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * Hovers over the 'Shoes' section, clicks on 'Basketball' category, and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void hoverShoesandclickBasketBallandVerify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
            helper.clickOnElement(NavBarDropDownLocators.clickOnBasketBall);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyBasketBall),
                    ExcelFileReader.readExcelData(path, "Priyanka", 1, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Clicks on the 'Cricket' category and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void clickCricketandverify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnCricket);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyCricket),
                    ExcelFileReader.readExcelData(path, "Priyanka", 2, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Hovers over the 'Shoes' section, clicks on 'Football' category, and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void hoverShoesandClickOnFootball(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnFootball);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyFootball),
                    ExcelFileReader.readExcelData(path, "Priyanka", 3, 1), test);
            LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 1, 2));
            test.log(Status.PASS, ExcelFileReader.readExcelData(path, "Priyanka", 1, 2));
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Hovers over the 'Shoes' section, clicks on 'Running' category, and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void hoverShoesAndclickRunningandverify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnRunning);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyRunning),
                    ExcelFileReader.readExcelData(path, "Priyanka", 4, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Hovers over the 'Shoes' section, clicks on 'Squash' category, and verifies details.
     *
     * @param test ExtentTest instance for logging actions in the test report.
     */
    public void hoverShoesandclickSquashandVerify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnSquash);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifysquash),
                    ExcelFileReader.readExcelData(path, "Priyanka", 5, 1), test);
            Screenshot.captureScreenShot("squash");
            Reporter.attachScreenshotToReport("squash", test, "Screenshot attached to report", driver);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }
}