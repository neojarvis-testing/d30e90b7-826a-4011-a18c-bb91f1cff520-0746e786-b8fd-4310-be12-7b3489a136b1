package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.NavBarDropDownLocators_Lokesh;
import uistore.NavBarLocators_Lokesh;
import uistore.NavBarLocators_Mohit;
import uistore.ProductDetails_Lokesh;
import uistore.Products_FilterLocators_Lokesh;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.ReadProperties;
import utils.Screenshot;

public class LokeshTestCase5Action {

    DriverHelper helper = new DriverHelper(Base.driver);

    public String path = ReadProperties.prop.getProperty("path");
    
    public void NavBar_Fitness(ExtentTest test) {

        // helper.waitForElementToBeVisible(NavBarLocators_Lokesh.Fitness, 1);
        helper.waitForElementToBeVisible(NavBarLocators_Mohit.shopnow, 20);
        helper.hoverOverElement(NavBarLocators_Lokesh.Fitness);
        helper.waitForElementToBeVisible(NavBarDropDownLocators_Lokesh.Gym_Gloves, 20);
        helper.hoverOverElement(NavBarDropDownLocators_Lokesh.Gym_Gloves);
        helper.clickOnElement(NavBarDropDownLocators_Lokesh.Gym_Gloves);
        // verification for Gym Gloves page
        String actual1 = helper.getText(ProductDetails_Lokesh.Gym_Accessories);
        String expected1 = ExcelFileReader.readExcelData(path, "Lokesh", 14, 0);
        Assertion.assertionVerifyByContains(actual1, expected1, test);
    }

    public void Gym_Gloves(ExtentTest test) {
        helper.hoverOverElement(Products_FilterLocators_Lokesh.Brand_EverLast);
        helper.clickOnElement(Products_FilterLocators_Lokesh.Brand_EverLast);
        helper.hoverOverElement(ProductDetails_Lokesh.Everlast_mens_Gloves);
        helper.clickOnElement(ProductDetails_Lokesh.Everlast_mens_Gloves);
        // verification for Everlast title
        String actual3 = Base.driver.getTitle();
        System.out.println(actual3);
        String expected3 = ExcelFileReader.readExcelData(path, "Lokesh", 16, 0);
        System.out.println(expected3);
        Assertion.assertionVerifyByContains(actual3, expected3, test);

    }

    public void add_to_cart(ExtentTest test) {

        helper.hoverOverElement(ProductDetails_Lokesh.Add_to_cart);
        helper.clickOnElement(ProductDetails_Lokesh.Add_to_cart);
        helper.waitForElementToBeVisible(NavBarLocators_Lokesh.Cart, 2);
        helper.hoverOverElement(NavBarLocators_Lokesh.Cart);
        helper.hoverOverElement(NavBarDropDownLocators_Lokesh.view_cart);
        helper.clickOnElement(NavBarDropDownLocators_Lokesh.view_cart);
        
    }

    public void checkout(ExtentTest test) {

        helper.waitForElementToBeVisible(NavBarDropDownLocators_Lokesh.Proceed_to_checkout, 1);
        helper.hoverOverElement(NavBarDropDownLocators_Lokesh.Proceed_to_checkout);
        Screenshot.captureScreenShot("Fitness_Gloves");
        helper.waitForElementToBeVisible(NavBarDropDownLocators_Lokesh.Proceed_to_checkout, 1);
        helper.clickOnElement(NavBarDropDownLocators_Lokesh.Proceed_to_checkout);
        // helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout,
        // 1);
    }

}
