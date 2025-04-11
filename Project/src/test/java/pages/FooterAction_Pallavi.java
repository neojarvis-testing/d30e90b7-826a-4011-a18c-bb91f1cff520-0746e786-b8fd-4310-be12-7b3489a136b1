package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterLocators_Pallavi;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;


public class FooterAction_Pallavi {
    DriverHelper helper = new DriverHelper(Base.driver);
    

    public void clickRegisterLogin(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.registerLogin, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.registerLogin);
        helper.clickOnElement(FooterLocators_Pallavi.registerLogin);
        String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 0, 0);
        String expectedTitle = Base.driver.getTitle();
        Assertion.useAssert(actualTitle,expectedTitle, test);
        LoggerHandler.info(expectedTitle);
        String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 0, 1);
        String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 0, 1);
        
        test.log(Status.INFO, pageName +  verifiedMsg);
        LoggerHandler.info(pageName +  verifiedMsg);

    }

    public void clickDeliveryCharges(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.deliveryCharges, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.deliveryCharges);
        helper.clickOnElement(FooterLocators_Pallavi.deliveryCharges);
        String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 1, 0);
        
        String expectedTitle = Base.driver.getTitle();
        Assertion.useAssert(actualTitle,expectedTitle, test);
        LoggerHandler.info(expectedTitle);
        String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 1, 1);
        String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 1, 1);
        test.log(Status.INFO, pageName +  verifiedMsg);
        LoggerHandler.info(pageName +  verifiedMsg);
    }

    public void clickPaymentOption(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.paymentOptions, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.paymentOptions);
        helper.clickOnElement(FooterLocators_Pallavi.paymentOptions);
        String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 2, 0);
        
        String expectedTitle = Base.driver.getTitle();
        Assertion.useAssert(actualTitle,expectedTitle, test);
        LoggerHandler.info(expectedTitle);
        String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 2, 1);
        String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 2, 1);
        test.log(Status.INFO, pageName +  verifiedMsg);
        LoggerHandler.info(pageName +  verifiedMsg);
    }

    public void clickFAQ(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.faq, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.faq);
        helper.clickOnElement(FooterLocators_Pallavi.faq);
        String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 3, 0);
        
        String expectedTitle = Base.driver.getTitle();
        Assertion.useAssert(actualTitle,expectedTitle, test);
        LoggerHandler.info(expectedTitle);
        String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 3, 1);
        String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 3, 1);
        test.log(Status.INFO, pageName +  verifiedMsg);
        LoggerHandler.info(pageName +  verifiedMsg);
    }

    public void clickReturnPolicy(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.returnPolicy, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.returnPolicy);
        helper.clickOnElement(FooterLocators_Pallavi.returnPolicy);
        String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 4, 0);
        
        String expectedTitle = Base.driver.getTitle();
        Assertion.useAssert(actualTitle,expectedTitle, test);
        LoggerHandler.info(expectedTitle);
        String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 4, 1);
        String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 4, 1);
        test.log(Status.INFO, pageName +  verifiedMsg);
        LoggerHandler.info(pageName +  verifiedMsg);
    }
    
    public void clickFacebook(ExtentTest test) {
        helper.hoverOverElement(FooterLocators_Pallavi.facebook);
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.facebook, 5);
        helper.clickOnElement(FooterLocators_Pallavi.facebook);
        
        // helper.switchToNewWindow();
        // String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 5, 0);
        
        // String expectedTitle = Base.driver.getTitle();
        // Assertion.useAssert(actualTitle,expectedTitle, test);

        // LoggerHandler.info(expectedTitle);
        // String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 5, 1);
        // String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 5, 1);
        // test.log(Status.INFO, pageName +  verifiedMsg);
        //LoggerHandler.info(pageName +  verifiedMsg);
        
        // Base.driver.close();
        // helper.switchToNewWindow();
        // Base.driver.navigate().back();
        
    }
    
    public void clickYoutube(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.youtube, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.youtube);
        helper.clickOnElement(FooterLocators_Pallavi.youtube);
        
        // helper.switchToNewWindow();
        // String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 6, 0);
        
        // String expectedTitle = Base.driver.getTitle();
        // Assertion.useAssert(actualTitle,expectedTitle, test);

        // LoggerHandler.info(expectedTitle);
        // String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 6, 1);
        // String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 6, 1);
        // test.log(Status.INFO, pageName +  verifiedMsg);
        //LoggerHandler.info(pageName +  verifiedMsg); 
        // Base.driver.close();
        // helper.switchToNewWindow();
        // Base.driver.navigate().back();
    }
    
    
    public void clickInstagram(ExtentTest test) {
        helper.hoverOverElement(FooterLocators_Pallavi.instagram);
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.instagram, 5);
        helper.clickOnElement(FooterLocators_Pallavi.instagram);
        // helper.switchToNewWindow();
        
        // String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 0);
        
        // String expectedTitle = Base.driver.getTitle();
        // Assertion.useAssert(actualTitle,expectedTitle, test);

        // LoggerHandler.info(expectedTitle);
        
        // String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 1);
        // String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 1);
        // test.log(Status.INFO, pageName +  verifiedMsg);
        //LoggerHandler.info(pageName +  verifiedMsg);
        
        // Base.driver.close(); 
        // helper.switchToNewWindow();
        // Base.driver.navigate().back();
    }
    
    public void clickTwitter(ExtentTest test) {
        helper.waitForElementToBeVisible(FooterLocators_Pallavi.twitter, 5);
        helper.hoverOverElement(FooterLocators_Pallavi.twitter);
        helper.clickOnElement(FooterLocators_Pallavi.twitter); 

        // String actualTitle = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 0);
        
        // String expectedTitle = Base.driver.getTitle();
        // Assertion.useAssert(actualTitle,expectedTitle, test);
        // LoggerHandler.info(expectedTitle);
        
        // String pageName = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 1);
        // String verifiedMsg = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Pallavi", 7, 1);
        // test.log(Status.INFO, pageName +  verifiedMsg);


        //LoggerHandler.info(pageName +  verifiedMsg);
        // Base.driver.close(); 
        // helper.switchToNewWindow();
        // Base.driver.navigate().back();
        
    }

}
