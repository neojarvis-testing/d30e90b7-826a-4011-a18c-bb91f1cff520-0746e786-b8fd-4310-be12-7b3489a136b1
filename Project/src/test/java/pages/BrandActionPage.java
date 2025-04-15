package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class BrandActionPage extends Base {
    DriverHelper helper = new DriverHelper(driver);
    String path = ReadProperties.prop.getProperty("path");

    /**
     * Description: Verifies the homepage URL and clicks on the Brands navigation bar.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception or assertion error encountered during the method execution.
     */
    public void verifyHomepageandclickOnBrands(ExtentTest test) {
        try {
            String actual = driver.getCurrentUrl();
            String expected = ReadProperties.prop.getProperty("url");
            Assert.assertEquals(actual, expected);
            helper.clickOnElement(NavBarLocator.brandNavBar);
            LoggerHandler.info("click on" + helper.getText(NavBarLocator.brandNavBar));
            test.log(Status.INFO, "click on" + helper.getText(NavBarLocator.brandNavBar));
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Verifies the Brand page and performs a search for "Puma".
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception or assertion error encountered during the method execution.
     */
    public void verifyBrandPageandTypePuma(ExtentTest test) {
        try {
            WebElement brand = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
            if (brand.isDisplayed()) {
                Assert.assertTrue(true);
            }
            helper.clickOnElement(ProductDetailsLocator.searchBarBrand);
            LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
            test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
            helper.sendKeys(ProductDetailsLocator.searchBarBrand,
                    ExcelFileReader.readExcelData(path, "Priyanka", 0, 0));
            helper.clickOnElement(ProductDetailsLocator.searchiconInBrandPage);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Verifies search results by clicking on the Puma brand logo.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception or assertion error encountered during the method execution.
     */
    public void clickNextAndverifySearchResults(ExtentTest test) {
        try {
            Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.clickOnPumaLabel),
                    ExcelFileReader.readExcelData(path, "Priyanka", 0, 0), test);
            helper.clickOnElement(ProductDetailsLocator.clickPumaLogo);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Verifies the Brand page listing all products.
     * @return Logs any exception encountered during the method execution.
     */
    public void verifyBrandpagelistingallproducts() {
        try {
            WebElement brandPage = driver.findElement(By.cssSelector("h1[class='title']"));
            if (brandPage.isDisplayed()) {
                Assert.assertTrue(true);
            }

            List<WebElement> puma = helper.getElementsByXpath("div[class='product details product-item-details']");
            for (int i = 1; i < puma.size(); i++) {
                String text = driver
                        .findElement(By.cssSelector("(div[class='product details product-item-details'])[" + i + "]"))
                        .getText();
                System.out.println(text);
            }
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * Description: Clicks on the Accessories category for Puma and verifies the page update.
     * @return Logs any exception encountered during the method execution.
     */
    public void clickAccessoriesandverifyUpdate() {
        try {
            helper.clickOnElement(ProductsFilterLocator.AccessoriesCategoryPuma);
            WebElement accessories = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
            if (accessories.isDisplayed()) {
                Assert.assertTrue(true);
            }
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * Description: Hovers over a product and clicks on Quick View.
     * @return Logs any exception encountered during the method execution.
     */
    public void hoveroverproductandclickQuickView() {
        try {
            helper.hoverOverElement(ProductDetailsLocator.hoverOverElementToquickView);
            helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);
            helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * Description: Verifies the Quick View popup and clicks on the "Add to Wishlist" option.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void verifyandclickWishList(ExtentTest test) {
        try {
            driver.switchTo().frame(Base.driver.findElement(ProductDetailsLocator.iframe));
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyQuickViewlabel),
                    ExcelFileReader.readExcelData(path, "Priyanka", 1, 0), test);
            helper.hoverOverElement(ProductDetailsLocator.hoverOverWindowOpenByquickview);
            helper.scroll(100);
            helper.waitForElementToBeVisible(ProductDetailsLocator.clickOnAddtoWhishList, 2);
            helper.clickOnElement(ProductDetailsLocator.clickOnAddtoWhishList);
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Verifies the error prompt after attempting to add an item to the wishlist.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void verifypromt(ExtentTest test) {
        try {
            Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageWhishList),
                    ExcelFileReader.readExcelData(path, "Priyanka", 2, 0), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * Description: Provides login credentials by sending email and password to their respective fields.
     * @return Logs any exception encountered during the method execution.
     */
    public void logincredentials() {
        try {
            helper.waitForElementToBeVisible(ProductDetailsLocator.inputEmailAdd, 2);
            helper.clickOnElement(ProductDetailsLocator.inputEmailAdd);
            helper.sendKeys(ProductDetailsLocator.inputEmailAdd,
                    ExcelFileReader.readExcelData(path, "Priyanka", 3, 0));
            helper.waitForElementToBeVisible(ProductDetailsLocator.inputPassword, 2);
            helper.clickOnElement(ProductDetailsLocator.inputPassword);
            helper.sendKeys(ProductDetailsLocator.inputPassword,
                    ExcelFileReader.readExcelData(path, "Priyanka", 4, 0));
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
    }

    /**
     * Description: Signs in and verifies the error message displayed upon failure.
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception or assertion error encountered during the method execution.
     */
    public void signInAndverifyerrorMessage(ExtentTest test) {
        try {
            helper.clickOnElement(ProductDetailsLocator.clickOnSignIn);
            Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageToSignIn),
                    ExcelFileReader.readExcelData(path, "Priyanka", 5, 0), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            test.log(Status.FAIL, e.getMessage());
        }
    }
}