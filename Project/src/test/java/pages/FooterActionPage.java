package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class FooterActionPage {
    DriverHelper helper = new DriverHelper(Base.driver);
    String path = ReadProperties.prop.getProperty("path");

    /**
     * Description: Clicks on the Register/Login option in the footer and verifies the page title.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickRegisterLogin(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.registerLogin, 5);
            helper.hoverOverElement(FooterLocator.registerLogin);
            helper.clickOnElement(FooterLocator.registerLogin);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 0, 0);
            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            String pageName = ExcelFileReader.readExcelData(path, "Pallavi", 0, 1);
            String verifiedMsg = ExcelFileReader.readExcelData(path, "Pallavi", 0, 1);
            test.log(Status.INFO, pageName + verifiedMsg);
            LoggerHandler.info(pageName + verifiedMsg);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Delivery Charges option in the footer and verifies the page title.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickDeliveryCharges(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.deliveryCharges, 5);
            helper.hoverOverElement(FooterLocator.deliveryCharges);
            helper.clickOnElement(FooterLocator.deliveryCharges);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 1, 0);
            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            String pageName = ExcelFileReader.readExcelData(path, "Pallavi", 1, 1);
            String verifiedMsg = ExcelFileReader.readExcelData(path, "Pallavi", 1, 1);
            test.log(Status.INFO, pageName + verifiedMsg);
            LoggerHandler.info(pageName + verifiedMsg);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Payment Options option in the footer and verifies the page title.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickPaymentOption(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.paymentOptions, 5);
            helper.hoverOverElement(FooterLocator.paymentOptions);
            helper.clickOnElement(FooterLocator.paymentOptions);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 2, 0);
            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            String pageName = ExcelFileReader.readExcelData(path, "Pallavi", 2, 1);
            String verifiedMsg = ExcelFileReader.readExcelData(path, "Pallavi", 2, 1);
            test.log(Status.INFO, pageName + verifiedMsg);
            LoggerHandler.info(pageName + verifiedMsg);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the FAQ option in the footer and verifies the page title.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickFAQ(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.faq, 5);
            helper.hoverOverElement(FooterLocator.faq);
            helper.clickOnElement(FooterLocator.faq);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 3, 0);
            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            String pageName = ExcelFileReader.readExcelData(path, "Pallavi", 3, 1);
            String verifiedMsg = ExcelFileReader.readExcelData(path, "Pallavi", 3, 1);
            test.log(Status.INFO, pageName + verifiedMsg);
            LoggerHandler.info(pageName + verifiedMsg);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Return Policy option in the footer and verifies the page title.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickReturnPolicy(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.returnPolicy, 5);
            helper.hoverOverElement(FooterLocator.returnPolicy);
            helper.clickOnElement(FooterLocator.returnPolicy);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 4, 0);
            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            String pageName = ExcelFileReader.readExcelData(path, "Pallavi", 4, 1);
            String verifiedMsg = ExcelFileReader.readExcelData(path, "Pallavi", 4, 1);
            test.log(Status.INFO, pageName + verifiedMsg);
            LoggerHandler.info(pageName + verifiedMsg);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Facebook link in the footer.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickFacebook(ExtentTest test) {
        try {
            helper.hoverOverElement(FooterLocator.facebook);
            helper.waitForElementToBeVisible(FooterLocator.facebook, 5);
            helper.clickOnElement(FooterLocator.facebook);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the YouTube link in the footer.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickYoutube(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.youtube, 5);
            helper.hoverOverElement(FooterLocator.youtube);
            helper.clickOnElement(FooterLocator.youtube);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Instagram link in the footer.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickInstagram(ExtentTest test) {
        try {
            helper.hoverOverElement(FooterLocator.instagram);
            helper.waitForElementToBeVisible(FooterLocator.instagram, 5);
            helper.clickOnElement(FooterLocator.instagram);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Twitter link in the footer.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickTwitter(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(FooterLocator.twitter, 5);
            helper.hoverOverElement(FooterLocator.twitter);
            helper.clickOnElement(FooterLocator.twitter);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }
}