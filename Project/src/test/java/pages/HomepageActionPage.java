package pages;

import java.util.Random;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LoginModuleLocator;
import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
import utils.Screenshot;

public class HomepageActionPage {

  public String path = ReadProperties.prop.getProperty("path");
  DriverHelper helper = new DriverHelper(Base.driver);
  String currUrl = Base.driver.getCurrentUrl();

  /**
   * Description: Hovers over the Racket Sports section and clicks on Badminton
   * Rackets.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void rackethoverclick(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_Rackets);
      String actual = Base.driver.getTitle();
      String curr = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 0, 0);
      Assertion.useAssert(actual, curr, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Clicks on the first badminton racket product, adds it to the
   * cart, and verifies zip code check functionality.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void clickingfirstProduct(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductDetailsLocator.Rackets_firstproduct, 10);
      helper.clickOnElement(ProductDetailsLocator.Rackets_firstproduct);
      String actual1 = Base.driver.getTitle();
      String curr1 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 2, 0);
      Assertion.useAssert(actual1, curr1, test);
      String actual2 = Base.driver.findElement(ProductDetailsLocator.verifyaddtocartButton).getText();
      String curr2 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 1, 0);
      Assertion.useAssert(actual2, curr2, test);
      helper.clickOnElement(ProductsFilterLocator.plusincrease_racketsports);
      helper.clickOnElement(ProductsFilterLocator.Addtocart_racketsports);
      String actual3 = Base.driver.findElement(ProductDetailsLocator.verifyafterclickingaddtocart).getText();
      String curr3 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 3, 0);
      Assertion.useAssert(actual3, curr3, test);
      helper.clickOnElement(ProductsFilterLocator.input_zipcode);
      String zipcode = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 7, 0);
      helper.sendKeys(ProductsFilterLocator.input_zipcode, zipcode);
      helper.clickOnElement(ProductsFilterLocator.check_Button);
      String actual4 = Base.driver.findElement(ProductDetailsLocator.verifycheckafterclicking).getText();
      String curr4 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 4, 0);
      Assertion.useAssert(actual4, curr4, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Navigates back to the homepage, selects a product, and captures
   * a screenshot.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void navigateBackHome(ExtentTest test) {
    try {
      Base.driver.navigate().to(ReadProperties.prop.getProperty("currUrl"));
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_shoes);
      String actual6 = Base.driver.getTitle();
      String curr6 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 6, 0);
      Assertion.useAssert(actual6, curr6, test);
      helper.clickOnElement(ProductDetailsLocator.shoes_firstproduct);
      helper.clickOnElement(ProductsFilterLocator.size_selects);
      helper.clickOnElement(ProductsFilterLocator.Addtocart_badmintonshoes);
      String namescreen = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 5, 0);
      Screenshot.captureScreenShot(namescreen);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Hovers over the Racket Sports section and selects Sportswear.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void hoversportsandsports(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.shop_sportswear, 5);
      helper.clickOnElement(NavBarDropDownLocators.shop_sportswear);
      String actual7 = Base.driver.getCurrentUrl();
      String curr7 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 0, 1);
      Assertion.assertionVerifyByContains(actual7, curr7, test);
      String actual8 = Base.driver.findElement(ProductDetailsLocator.verifyclothingheading).getText();
      String curr8 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 1, 1);
      Assertion.useAssert(actual8, curr8, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Compares products from the listing view and verifies the
   * comparison result.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void listingviewcompare(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductDetailsLocator.list_viewproduct, 10);
      helper.hoverOverElement(ProductDetailsLocator.list_viewproduct);
      helper.clickOnElement(ProductDetailsLocator.list_viewproduct);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare1_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare1_product);
      String actual9 = Base.driver.findElement(ProductDetailsLocator.verifycompare1product).getText();
      String curr9 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 6, 1);
      Assertion.useAssert(actual9, curr9, test);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare2_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare2_product);
      String actual10 = Base.driver.findElement(ProductDetailsLocator.verifycompare2product).getText();
      String curr10 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 7, 1);
      Assertion.useAssert(actual10, curr10, test);

      helper.waitForElementToBeVisible(ProductsFilterLocator.compareproduct, 10);
      helper.clickOnElement(ProductsFilterLocator.compareproduct);
      String actual11 = Base.driver.getCurrentUrl();
      String curr11 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 3, 1);
      Assertion.useAssert(actual11, curr11, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Removes products from the cart and verifies the removal process.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void removingProducts(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductsFilterLocator.firstProductwrong, 5);
      helper.waitForElementToBeVisible(ProductsFilterLocator.secondProductwrong, 5);
      helper.clickOnElement(ProductsFilterLocator.secondProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
      String actual12 = Base.driver.findElement(ProductDetailsLocator.verifyremoving1product).getText();
      String curr12 = ExcelFileReader.readExcelData(path, "Uday", 8, 1);
      Assertion.useAssert(actual12, curr12, test);
      helper.clickOnElement(ProductsFilterLocator.firstProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
      String actual13 = Base.driver.findElement(ProductDetailsLocator.verifyremoving1product).getText();
      String curr13 = ExcelFileReader.readExcelData(path, "Uday", 9, 1);
      Assertion.useAssert(actual13, curr13, test);

      Screenshot.captureScreenShot(ExcelFileReader.readExcelData(path, "Uday", 4, 1));
      test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Uday", 5, 1));
      String actual14 = Base.driver.findElement(ProductDetailsLocator.afterremoveallproducts).getText();
      String curr14 = ExcelFileReader.readExcelData(path, "Uday", 10, 1);
      Assertion.useAssert(actual14, curr14, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Navigates to the login page and verifies the page elements.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void navigateToLoginPage(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.userIcon, 10);
      String expected = ExcelFileReader.readExcelData(path, "Mohit", 6, 0);

      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
      Assertion.useAssert(helper.getText(NavBarLocator.shopnow), expected, test);

      helper.hoverOverElement(NavBarLocator.userIcon);

      helper.waitForElementToBeVisible(NavBarDropDownLocators.login, 10);
      helper.clickOnElement(NavBarDropDownLocators.login);

      helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 15);
      String verifyLogin = ExcelFileReader.readExcelData(path, "Mohit", 7, 0);
      Assertion.assertionVerifyByContains(helper.getText(LoginModuleLocator.createAccount), verifyLogin, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Navigates to the Create Account page.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void navigateToCreateAccountPage(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 10);
      helper.clickOnElement(LoginModuleLocator.createAccount);
      helper.waitForElementToBeVisible(LoginModuleLocator.firstName, 10);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Creates a new user account with details fetched from Excel and
   * generates a random email.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void createAccount(ExtentTest test) {
    try {
      String firstname = ExcelFileReader.readExcelData(path, "Mohit", 0, 0);
      String lastname = ExcelFileReader.readExcelData(path, "Mohit", 1, 0);
      String email = generateRandomEmail();
      String password = ExcelFileReader.readExcelData(path, "Mohit", 3, 0);

      helper.sendKeys(LoginModuleLocator.firstName, firstname);
      helper.sendKeys(LoginModuleLocator.lastName, lastname);
      helper.sendKeys(LoginModuleLocator.email, email);
      helper.sendKeys(LoginModuleLocator.password, password);
      helper.sendKeys(LoginModuleLocator.confirmPassword, password);

      helper.clickOnElement(LoginModuleLocator.confirmCreateButton);
      helper.waitForElementToBeVisible(LoginModuleLocator.thankYouMessage, 15);

      String expectedThankYou = ExcelFileReader.readExcelData(path, "Mohit", 8, 0);
      Assertion.useAssert(helper.getText(LoginModuleLocator.thankYouMessage), expectedThankYou, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Logs out the user and verifies the logout confirmation message.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void logout(ExtentTest test) {
    try {
      helper.clickOnElement(LoginModuleLocator.logout);
      helper.waitForElementToBeVisible(LoginModuleLocator.verify5secWait, 15);

      String expected5secText = ExcelFileReader.readExcelData(path, "Mohit", 9, 0);
      Assertion.useAssert(helper.getText(LoginModuleLocator.verify5secWait), expected5secText, test);

      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Logs in with an existing user account and verifies login
   * functionality.
   * 
   * @param test ExtentTest instance used for logging the test status.
   * @return Logs any exception encountered during the method execution.
   */
  public void loginWithExistingUser(ExtentTest test) {
    try {
      String userEmail = ExcelFileReader.readExcelData(path, "Mohit", 4, 0);
      String userPassword = ExcelFileReader.readExcelData(path, "Mohit", 5, 0);

      helper.hoverOverElement(NavBarLocator.userIcon);
      helper.clickOnElement(NavBarDropDownLocators.login);

      helper.sendKeys(LoginModuleLocator.emailLogin, userEmail);
      helper.sendKeys(LoginModuleLocator.passwordLogin, userPassword);

      helper.clickOnElement(LoginModuleLocator.signIn);
      helper.waitForElementToBeVisible(LoginModuleLocator.verifyErrorMessage, 15);

      String expectedVerifyError = ExcelFileReader.readExcelData(path, "Mohit", 10, 0);
      Assertion.useAssert(helper.getText(LoginModuleLocator.verifyErrorMessage), expectedVerifyError, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Description: Generates a random email using a specified prefix and suffix.
   * 
   * @return A randomly generated email as a String.
   */
  public String generateRandomEmail() {
    String prefix = "mohit";
    String suffix = "@gmail.com";
    int randomNumber = new Random().nextInt(10000);
    return prefix + randomNumber + suffix;
  }

}
