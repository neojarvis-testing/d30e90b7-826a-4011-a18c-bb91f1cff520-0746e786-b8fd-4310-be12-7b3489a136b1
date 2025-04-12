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

    public void clickRegisterLogin(ExtentTest test) {
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

    }

    public void clickDeliveryCharges(ExtentTest test) {
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
    }

    public void clickPaymentOption(ExtentTest test) {
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
    }

    public void clickFAQ(ExtentTest test) {
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
    }

    public void clickReturnPolicy(ExtentTest test) {
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
    }

    public void clickFacebook(ExtentTest test) {
        helper.hoverOverElement(FooterLocator.facebook);
        helper.waitForElementToBeVisible(FooterLocator.facebook, 5);
        helper.clickOnElement(FooterLocator.facebook);

    }

    public void clickYoutube(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocator.youtube, 5);
        helper.hoverOverElement(FooterLocator.youtube);
        helper.clickOnElement(FooterLocator.youtube);

    }

    public void clickInstagram(ExtentTest test) {
        helper.hoverOverElement(FooterLocator.instagram);
        helper.waitForElementToBeVisible(FooterLocator.instagram, 5);
        helper.clickOnElement(FooterLocator.instagram);

    }

    public void clickTwitter(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocator.twitter, 5);
        helper.hoverOverElement(FooterLocator.twitter);
        helper.clickOnElement(FooterLocator.twitter);

    }

}
