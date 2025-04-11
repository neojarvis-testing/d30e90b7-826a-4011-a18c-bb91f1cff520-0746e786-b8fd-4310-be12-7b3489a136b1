package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarLocators_Harshit;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class Racket_Actions_Harshit {
        DriverHelper helper = new DriverHelper(Base.driver);

        public void selectRacket(ExtentTest test) {
                try {

                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.searchBar, 2);
                        helper.clickOnElement(NavBarLocators_Harshit.searchBar);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        0, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        0, 1));
                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.search, 2);
                        helper.clickOnElement(NavBarLocators_Harshit.search);
                        String adidas = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Harshit", 0, 0);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        1, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        1, 1));
                        helper.sendKeys(NavBarLocators_Harshit.search, adidas);
                        helper.hoverOverElement(NavBarLocators_Harshit.GoButton);
                        helper.clickOnElement(NavBarLocators_Harshit.GoButton);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        2, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        2, 1));
                        helper.enterAction(NavBarLocators_Harshit.search);
                        String actual = Base.driver.getCurrentUrl();
                        String expected = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Harshit", 1, 0);
                        Assertion.useAssert(actual, expected, test);

                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void applyFilter(ExtentTest test) {
                try {
                        helper.hoverOverElement(NavBarLocators_Harshit.RocketSports);
                        helper.clickOnElement(NavBarLocators_Harshit.RocketSports);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        4, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        4, 1));
                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.shoes, 3);
                        helper.hoverOverElement(NavBarLocators_Harshit.shoes);
                        helper.clickOnElement(NavBarLocators_Harshit.shoes);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        5, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        5, 1));
                        String actual2 = Base.driver.findElement(NavBarLocators_Harshit.Text1).getText();
                        String expected2 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Harshit", 2, 0);
                        Assertion.useAssert(actual2, expected2, test);
                        helper.hoverOverElement(NavBarLocators_Harshit.removeRacket);
                        helper.clickOnElement(NavBarLocators_Harshit.removeRacket);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        7, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        7, 1));

                        String actual3 = Base.driver.findElement(NavBarLocators_Harshit.Text2).getText();

                        String expected3 = ExcelFileReader.readExcelData(
                                        ReadProperties.prop.getProperty("path"),
                                        "Harshit", 3, 0);
                        Assertion.useAssert(actual3, expected3, test);

                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectClothing(ExtentTest test) {
                try {
                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.clothing, 3);
                        helper.hoverOverElement(NavBarLocators_Harshit.clothing);
                        helper.clickOnElement(NavBarLocators_Harshit.clothing);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        8, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        8, 1));
                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectAccessories(ExtentTest test) {
                try {
                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.accessories, 3);
                        helper.hoverOverElement(NavBarLocators_Harshit.accessories);
                        helper.clickOnElement(NavBarLocators_Harshit.accessories);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        9, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        9, 1));
                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectRunning(ExtentTest test) {
                try {

                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.running, 5);
                        helper.hoverOverElement(NavBarLocators_Harshit.running);
                        helper.clickOnElement(NavBarLocators_Harshit.running);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        10, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        10, 1));
                        helper.waitForElementToBeVisible(NavBarLocators_Harshit.clearAll, 4);
                        helper.hoverOverElement(NavBarLocators_Harshit.clearAll);
                        helper.clickOnElement(NavBarLocators_Harshit.clearAll);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        11, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        11, 1));
                        String actual4 = Base.driver.findElement(NavBarLocators_Harshit.Text1).getText();
                        String expected4 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Harshit", 2, 0);
                        Assertion.useAssert(actual4, expected4, test);
                        test.log(Status.PASS,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Harshit",
                                                        12, 1));

                } catch (Exception e) {
                        e.printStackTrace();

                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

}
