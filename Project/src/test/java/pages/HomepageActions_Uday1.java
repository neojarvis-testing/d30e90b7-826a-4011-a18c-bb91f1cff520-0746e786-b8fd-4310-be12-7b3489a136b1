package pages;
import utils.Base;
import utils.DriverHelper;
import com.aventstack.extentreports.ExtentTest;
import uistore.NavBarDropDownLocators_uday;
import uistore.NavBarLocators_uday;
import uistore.ProductDetails_uday;
import uistore.Products_FilterLocators_uday;

public class HomepageActions_Uday1 {
  DriverHelper helperObj2 = new DriverHelper(Base.driver);

  public void hoversportsandsports(ExtentTest test) {
    try {
      helperObj2.hoverOverElement(NavBarLocators_uday.Racket_sports);
      helperObj2.waitForElementToBeVisible(NavBarDropDownLocators_uday.shop_sportswear, 5);
      helperObj2.clickOnElement(NavBarDropDownLocators_uday.shop_sportswear);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void listingviewcompare(ExtentTest test) {
    try {
      helperObj2.waitForElementToBeVisible(ProductDetails_uday.list_viewproduct, 5);
      helperObj2.hoverOverElement(ProductDetails_uday.list_viewproduct);
      helperObj2.clickOnElement(ProductDetails_uday.list_viewproduct);
      helperObj2.waitForElementToBeVisible(Products_FilterLocators_uday.compare1_product, 5);
      helperObj2.clickOnElement(Products_FilterLocators_uday.compare1_product);
      helperObj2.waitForElementToBeVisible(Products_FilterLocators_uday.compare2_product, 5);
      helperObj2.clickOnElement(Products_FilterLocators_uday.compare2_product);
      helperObj2.waitForElementToBeVisible(Products_FilterLocators_uday.compareproduct, 5);
      helperObj2.clickOnElement(Products_FilterLocators_uday.compareproduct);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void removingProducts(ExtentTest test) {
    try {
      helperObj2.waitForElementToBeVisible(Products_FilterLocators_uday.firstProductwrong, 5);
      helperObj2.clickOnElement(Products_FilterLocators_uday.firstProductwrong);
      helperObj2.clickOnElement(Products_FilterLocators_uday.OKClick);
      helperObj2.waitForElementToBeVisible(Products_FilterLocators_uday.secondProductwrong, 5);
      helperObj2.clickOnElement(Products_FilterLocators_uday.secondProductwrong);
      helperObj2.clickOnElement(Products_FilterLocators_uday.OKClick);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
