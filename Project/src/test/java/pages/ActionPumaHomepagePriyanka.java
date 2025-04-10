package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarLocatorsPriyanka;
import uistore.ProductDetailsPriyanka;
import uistore.Products_FiltersLocatorsPriyanka;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class ActionPumaHomepagePriyanka extends Base{
    DriverHelper helper = new DriverHelper(driver);

    public  void verifyHomepageandclickOnBrands(ExtentTest test)
    {
        String actual = driver.getCurrentUrl();
        String expected = ReadProperties.prop.getProperty("url");
        Assert.assertEquals(actual, expected);
        helper.clickOnElement(NavBarLocatorsPriyanka.brandNavBar);
        LoggerHandler.info("click on"+helper.getText(NavBarLocatorsPriyanka.brandNavBar));
        test.log(Status.INFO, "click on"+helper.getText(NavBarLocatorsPriyanka.brandNavBar));
    }

    public void verifyBrandPageandTypePuma(ExtentTest test)
    {
        WebElement brand = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
        if (brand.isDisplayed())
        {
            Assert.assertTrue(true);
        }
        helper.clickOnElement(ProductDetailsPriyanka.searchBarBrand);
        LoggerHandler.info(ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 2, 2));
        test.log(Status.INFO,ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 2, 2));
        helper.sendKeys(ProductDetailsPriyanka.searchBarBrand, ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 0, 0));
        helper.clickOnElement(ProductDetailsPriyanka.searchiconInBrandPage);

    }
    public  void clickNextAndverifySearchResults(ExtentTest test)
    {
       
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsPriyanka.clickOnPumaLabel), ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 0, 0),test);
        helper.clickOnElement(ProductDetailsPriyanka.clickPumaLogo);

    }
    public  void verifyBrandpagelistingallproducts()
    {
        WebElement brandPage =driver.findElement(By.cssSelector("h1[class='title']"));
        if(brandPage.isDisplayed())
        {
            Assert.assertTrue(true);
        }

        List<WebElement> puma = helper.getElementsByXpath("div[class='product details product-item-details']");
        for(int i=1;i<puma.size();i++)
        {
           
            String text = driver.findElement(By.cssSelector("(div[class='product details product-item-details'])["+i+"]")).getText();
            System.out.println(text);
        }
        

    }
    public  void clickAccessoriesandverifyUpdate()
    {
        helper.clickOnElement(Products_FiltersLocatorsPriyanka.AccessoriesCategoryPuma);
        WebElement accessories = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
        if (accessories.isDisplayed()) {
            Assert.assertTrue(true);
            
        }
    }
    public void hoveroverproductandclickQuickView()
    {
      
        helper.hoverOverElement(ProductDetailsPriyanka.hoverOverElementToquickView);
        helper.clickOnElement(ProductDetailsPriyanka.quickViewOfPumaProduct); helper.clickOnElement(ProductDetailsPriyanka.quickViewOfPumaProduct);
        

    }
    public  void verifyandclickWishList(ExtentTest test)
    {
       
        driver.switchTo().frame(Base.driver.findElement(ProductDetailsPriyanka.iframe));
       Assertion.useAssert(helper.getText(ProductDetailsPriyanka.verifyQuickViewlabel),ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 1, 0),test);
       helper.hoverOverElement(ProductDetailsPriyanka.hoverOverWindowOpenByquickview);
       helper.scroll(100);
       helper.waitForElementToBeVisible(ProductDetailsPriyanka.clickOnAddtoWhishList, 2);
       helper.clickOnElement(ProductDetailsPriyanka.clickOnAddtoWhishList);
       driver.switchTo().defaultContent();

    }
    public  void verifypromt(ExtentTest test)
    {
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsPriyanka.verifyErrorMessageWhishList), ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 2, 0),test);
    }
    public void logincredentials()
    {  

        helper.waitForElementToBeVisible(ProductDetailsPriyanka.inputEmailAdd, 2);
        helper.clickOnElement(ProductDetailsPriyanka.inputEmailAdd);
        helper.sendKeys(ProductDetailsPriyanka.inputEmailAdd, ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 3, 0));
        helper.waitForElementToBeVisible(ProductDetailsPriyanka.inputPassword, 2);
        helper.clickOnElement(ProductDetailsPriyanka.inputPassword);
        helper.sendKeys(ProductDetailsPriyanka.inputPassword, ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 4, 0));

    }
    public  void signInAndverifyerrorMessage(ExtentTest test)
    {
        helper.clickOnElement(ProductDetailsPriyanka.clickOnSignIn);
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsPriyanka.verifyErrorMessageToSignIn), ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1", 5, 0),test);

    }
   

}
