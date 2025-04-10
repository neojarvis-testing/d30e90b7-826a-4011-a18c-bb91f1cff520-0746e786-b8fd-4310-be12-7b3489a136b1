package pages;

import java.util.Random;

import com.aventstack.extentreports.ExtentTest;

import uistore.LoginModuleLocators_Mohit;
import uistore.NavBarDropDownLocators_Mohit;
import uistore.NavBarLocators_Mohit;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.ReadProperties;
import utils.Reporter;

public class HomepageAction_Mohit {

    DriverHelper helper = new DriverHelper(Base.driver);

    public String path = ReadProperties.prop.getProperty("path");

    public void navigateToLoginPage(ExtentTest test) {
        
        helper.waitForElementToBeVisible(NavBarLocators_Mohit.userIcon, 10);
        String expected = ExcelFileReader.readExcelData(path, "Sheet1", 6, 0);

        helper.waitForElementToBeVisible(NavBarLocators_Mohit.shopnow, 15);
        Assertion.useAssert(helper.getText(NavBarLocators_Mohit.shopnow), expected, test);
        
        helper.hoverOverElement(NavBarLocators_Mohit.userIcon);

        helper.waitForElementToBeVisible(NavBarDropDownLocators_Mohit.login, 10);
        helper.clickOnElement(NavBarDropDownLocators_Mohit.login);

        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.createAccount, 15);
        String verifyLogin = ExcelFileReader.readExcelData(path, "Sheet1", 7, 0);
        Assertion.assertionVerifyByContains(helper.getText(LoginModuleLocators_Mohit.createAccount), verifyLogin, test);
    }

    public void navigateToCreateAccountPage(ExtentTest test) {
        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.createAccount, 10);
        helper.clickOnElement(LoginModuleLocators_Mohit.createAccount);
        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.firstName, 10);
    }

    public void createAccount(ExtentTest test) {

        String firstname = ExcelFileReader
                .readExcelData(path, "Sheet1", 0, 0);
        String lastname = ExcelFileReader.readExcelData(path,
                "Sheet1", 1, 0);
        String email = generateRandomEmail(); // Generate random email
        String password = ExcelFileReader.readExcelData(path,
                "Sheet1", 3, 0);

        helper.clickOnElement(LoginModuleLocators_Mohit.firstName);
        helper.sendKeys(LoginModuleLocators_Mohit.firstName, firstname);

        helper.clickOnElement(LoginModuleLocators_Mohit.lastName);
        helper.sendKeys(LoginModuleLocators_Mohit.lastName, lastname);

        helper.clickOnElement(LoginModuleLocators_Mohit.email);
        helper.sendKeys(LoginModuleLocators_Mohit.email, email);

        helper.clickOnElement(LoginModuleLocators_Mohit.password);
        helper.sendKeys(LoginModuleLocators_Mohit.password, password);

        helper.clickOnElement(LoginModuleLocators_Mohit.confirmPassword);
        helper.sendKeys(LoginModuleLocators_Mohit.confirmPassword, password);

        helper.clickOnElement(LoginModuleLocators_Mohit.confirmCreateButton);

        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.thankYouMessage, 15);

        String expectedThankYou = ExcelFileReader.readExcelData(path, "Sheet1", 8, 0);
        System.out.println(expectedThankYou);

        Assertion.useAssert(helper.getText(LoginModuleLocators_Mohit.thankYouMessage), expectedThankYou, test);

        Reporter.attachScreenshotToReport("image", test, "image");

    }

    public void logout(ExtentTest test) {
        helper.clickOnElement(LoginModuleLocators_Mohit.logout);

        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.verify5secWait, 15);

        String expected5secText = ExcelFileReader.readExcelData(path, "Sheet1", 9, 0); 
        System.out.println(expected5secText);
        System.out.println("=="+helper.getText(LoginModuleLocators_Mohit.verify5secWait)+"====");
        Assertion.useAssert(helper.getText(LoginModuleLocators_Mohit.verify5secWait), expected5secText, test);

        helper.waitForElementToBeVisible(NavBarLocators_Mohit.shopnow, 15);
    }

    public void loginWithExistingUser(ExtentTest test) {
        String userEmail = ExcelFileReader
                .readExcelData(path, "Sheet1", 4, 0);
        String userPassword = ExcelFileReader
                .readExcelData(path, "Sheet1", 5, 0);

        helper.hoverOverElement(NavBarLocators_Mohit.userIcon);
        helper.clickOnElement(NavBarDropDownLocators_Mohit.login);

        helper.clickOnElement(LoginModuleLocators_Mohit.emailLogin);
        helper.sendKeys(LoginModuleLocators_Mohit.emailLogin, userEmail);

        helper.clickOnElement(LoginModuleLocators_Mohit.passwordLogin);
        helper.sendKeys(LoginModuleLocators_Mohit.passwordLogin, userPassword);

        helper.clickOnElement(LoginModuleLocators_Mohit.signIn);

        helper.waitForElementToBeVisible(LoginModuleLocators_Mohit.verifyErrorMessage, 15);

        String expectedVerifyError = ExcelFileReader.readExcelData(path, "Sheet1", 10, 0);
        System.out.println(expectedVerifyError);
        Assertion.useAssert(helper.getText(LoginModuleLocators_Mohit.verifyErrorMessage), expectedVerifyError, test);
    }

    public String generateRandomEmail() {
        String prefix = "mohit";
        String suffix = "@gmail.com";
        int randomNumber = new Random().nextInt(1000);
        return prefix + randomNumber + suffix;
    }

}