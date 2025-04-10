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
        DriverHelper w = new DriverHelper(Base.driver);

        public void selectRacket(ExtentTest test) {
                try {

                        w.waitForElementToBeVisible(NavBarLocators_Harshit.searchBar, 2);
                        w.clickOnElement(NavBarLocators_Harshit.searchBar);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        0, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        0, 1));
                        w.waitForElementToBeVisible(NavBarLocators_Harshit.search, 2);
                        w.clickOnElement(NavBarLocators_Harshit.search);
                        String adidas = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Sheet1", 0, 0);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        1, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        1, 1));
                        w.sendKeys(NavBarLocators_Harshit.search, adidas);
                        w.hoverOverElement(NavBarLocators_Harshit.GoButton);
                        w.clickOnElement(NavBarLocators_Harshit.GoButton);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        2, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        2, 1));
                        w.enterAction(NavBarLocators_Harshit.search);
                        String actual = Base.driver.getCurrentUrl();
                        String expected = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Sheet1", 1, 0);
                        Assertion.useAssert(actual, expected, test);

                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void applyFilter(ExtentTest test) {
                try {
                        w.hoverOverElement(NavBarLocators_Harshit.RocketSports);
                        w.clickOnElement(NavBarLocators_Harshit.RocketSports);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        4, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        4, 1));
                        w.waitForElementToBeVisible(NavBarLocators_Harshit.shoes, 3);
                        w.hoverOverElement(NavBarLocators_Harshit.shoes);
                        w.clickOnElement(NavBarLocators_Harshit.shoes);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        5, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        5, 1));
                        String actual2 = Base.driver.findElement(NavBarLocators_Harshit.Text1).getText();
                        String expected2 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Sheet1", 2, 0);
                        Assertion.useAssert(actual2, expected2, test);
                        w.hoverOverElement(NavBarLocators_Harshit.removeRacket);
                        w.clickOnElement(NavBarLocators_Harshit.removeRacket);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        7, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        7, 1));

                        String actual3 = Base.driver.findElement(NavBarLocators_Harshit.Text2).getText();

                        String expected3 = ExcelFileReader.readExcelData(
                                        ReadProperties.prop.getProperty("path"),
                                        "Sheet1", 3, 0);
                        Assertion.useAssert(actual3, expected3, test);

                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectClothing(ExtentTest test) {
                try {
                        w.waitForElementToBeVisible(NavBarLocators_Harshit.clothing, 3);
                        w.hoverOverElement(NavBarLocators_Harshit.clothing);
                        w.clickOnElement(NavBarLocators_Harshit.clothing);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        8, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        8, 1));
                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectAccessories(ExtentTest test) {
                try {
                        w.waitForElementToBeVisible(NavBarLocators_Harshit.accessories, 3);
                        w.hoverOverElement(NavBarLocators_Harshit.accessories);
                        w.clickOnElement(NavBarLocators_Harshit.accessories);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        9, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        9, 1));
                } catch (Exception e) {
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectRunning(ExtentTest test) {
                try {

                        w.waitForElementToBeVisible(NavBarLocators_Harshit.running, 5);
                        w.hoverOverElement(NavBarLocators_Harshit.running);
                        w.clickOnElement(NavBarLocators_Harshit.running);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        10, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        10, 1));
                        w.waitForElementToBeVisible(NavBarLocators_Harshit.clearAll, 4);
                        w.hoverOverElement(NavBarLocators_Harshit.clearAll);
                        w.clickOnElement(NavBarLocators_Harshit.clearAll);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        11, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        11, 1));
                        String actual4 = Base.driver.findElement(NavBarLocators_Harshit.Text1).getText();
                        String expected4 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"),
                                        "Sheet1", 2, 0);
                        Assertion.useAssert(actual4, expected4, test);
                        test.log(Status.PASS,
                                        ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Sheet1",
                                                        12, 1));

                } catch (Exception e) {
                        e.printStackTrace();

                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

}
