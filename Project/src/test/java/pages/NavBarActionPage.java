package pages;

import com.aventstack.extentreports.ExtentTest;
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

public class NavBarActionPage {

    DriverHelper helper = new DriverHelper(Base.driver);

    public String path = ReadProperties.prop.getProperty("path");

    /**
     * Description: Navigates to the Batting Gloves page via the Team Sport section
     * in the NavBar and verifies the page URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Batting_Gloves(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Batting_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Batting_Gloves);

            // Verification for Batting Gloves URL
            String actualURL1 = Base.driver.getCurrentUrl();
            String expectedURL1 = ExcelFileReader.readExcelData(path, "Lokesh", 0, 0);
            Assertion.assertionVerifyByContains(actualURL1, expectedURL1, test);

            // Verification for Batting Gloves page header
            String actualheader1 = Base.driver.getTitle();
            String expectedheader1 = ExcelFileReader.readExcelData(path, "Lokesh", 7, 0);
            Assertion.assertionVerifyByContains(actualheader1, expectedheader1, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Batting Leg Guards page via the Team Sport
     * section in the NavBar and verifies the page URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Batting_Leg_Guards(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Batting_Leg_Guards);
            helper.clickOnElement(NavBarDropDownLocators.Batting_Leg_Guards);

            // Verification for Batting Leg Guards URL
            String actualURL2 = Base.driver.getCurrentUrl();
            String expectedURL2 = ExcelFileReader.readExcelData(path, "Lokesh", 1, 0);
            Assertion.assertionVerifyByContains(actualURL2, expectedURL2, test);

            // Verification for Batting Leg Guards page header
            String actualheader2 = Base.driver.getTitle();
            String expectedheader2 = ExcelFileReader.readExcelData(path, "Lokesh", 8, 0);
            Assertion.assertionVerifyByContains(actualheader2, expectedheader2, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Wicket Keeping Gloves page via the Team Sport
     * section in the NavBar and verifies the page URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Wicket_Keeping_Gloves(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);

            // Verification for Wicket Keeping Gloves URL
            String actualURL3 = Base.driver.getCurrentUrl();
            String expectedURL3 = ExcelFileReader.readExcelData(path, "Lokesh", 2, 0);
            Assertion.assertionVerifyByContains(actualURL3, expectedURL3, test);

            // Verification for Wicket Keeping Gloves page header
            String actualheader3 = Base.driver.getTitle();
            String expectedheader3 = ExcelFileReader.readExcelData(path, "Lokesh", 9, 0);
            Assertion.assertionVerifyByContains(actualheader3, expectedheader3, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Wicket Keeping Leg Guards page via the Team
     * Sport section in the NavBar and verifies the page URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Wicket_Keeping_Leg_Guards(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);
            helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);

            // Verification for Wicket Keeping Leg Guards URL
            String actualURL4 = Base.driver.getCurrentUrl();
            String expectedURL4 = ExcelFileReader.readExcelData(path, "Lokesh", 3, 0);
            Assertion.assertionVerifyByContains(actualURL4, expectedURL4, test);

            // Verification for Wicket Keeping Leg Guards page header
            String actualheader4 = Base.driver.getTitle();
            String expectedheader4 = ExcelFileReader.readExcelData(path, "Lokesh", 10, 0);
            Assertion.assertionVerifyByContains(actualheader4, expectedheader4, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Cricket Helmets page via the Team Sport section
     * in the NavBar and verifies the URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Circket_Helmets(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Circket_Helmets);
            helper.clickOnElement(NavBarDropDownLocators.Circket_Helmets);

            // Verification for Cricket Helmets URL
            String actualURL5 = Base.driver.getCurrentUrl();
            String expectedURL5 = ExcelFileReader.readExcelData(path, "Lokesh", 4, 0);
            Assertion.assertionVerifyByContains(actualURL5, expectedURL5, test);

            // Verification for Cricket Helmets page header
            String actualheader5 = Base.driver.getTitle();
            String expectedheader5 = ExcelFileReader.readExcelData(path, "Lokesh", 11, 0);
            Assertion.assertionVerifyByContains(actualheader5, expectedheader5, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Inner Thigh Pads page via the Team Sport
     * section in the NavBar and verifies the URL and header.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Inner_Thigh_Pads(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Protective_Gear, 15);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Inner_Thigh_Pads, 15);
            helper.hoverOverElement(NavBarDropDownLocators.Inner_Thigh_Pads);
            helper.clickOnElement(NavBarDropDownLocators.Inner_Thigh_Pads);

            // Verification for Inner Thigh Pads URL
            String actualURL6 = Base.driver.getCurrentUrl();
            String expectedURL6 = ExcelFileReader.readExcelData(path, "Lokesh", 5, 0);
            Assertion.assertionVerifyByContains(actualURL6, expectedURL6, test);

            // Verification for Inner Thigh Pads page header
            String actualheader6 = Base.driver.getTitle();
            String expectedheader6 = ExcelFileReader.readExcelData(path, "Lokesh", 12, 0);
            Assertion.assertionVerifyByContains(actualheader6, expectedheader6, test);

            // Capture screenshot for verification
            Screenshot.captureScreenShot("Team_sport");
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to the Gym Gloves page via the Fitness section in the
     * NavBar and verifies the page contents.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void NavBar_Fitness(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
            helper.hoverOverElement(NavBarLocator.Fitness);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Gym_Gloves, 20);
            helper.hoverOverElement(NavBarDropDownLocators.Gym_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Gym_Gloves);

            // Verification for Gym Gloves page contents
            String actual1 = helper.getText(ProductDetailsLocator.Gym_Accessories);
            String expected1 = ExcelFileReader.readExcelData(path, "Lokesh", 14, 0);
            Assertion.assertionVerifyByContains(actual1, expected1, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Navigates to a specific Gym Gloves product and verifies its
     * title.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void Gym_Gloves(ExtentTest test) {
        try {
            helper.hoverOverElement(ProductsFilterLocator.Brand_EverLast);
            helper.clickOnElement(ProductsFilterLocator.Brand_EverLast);
            helper.hoverOverElement(ProductDetailsLocator.Everlast_mens_Gloves);
            helper.clickOnElement(ProductDetailsLocator.Everlast_mens_Gloves);

            // Verification for Everlast product title
            String actual3 = Base.driver.getTitle();
            String expected3 = ExcelFileReader.readExcelData(path, "Lokesh", 16, 0);
            Assertion.assertionVerifyByContains(actual3, expected3, test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Adds the Gym Gloves product to the cart and navigates to the
     * cart view.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void add_to_cart(ExtentTest test) {
        try {
            helper.hoverOverElement(ProductDetailsLocator.Add_to_cart);
            helper.clickOnElement(ProductDetailsLocator.Add_to_cart);
            helper.waitForElementToBeVisible(NavBarLocator.Cart, 2);
            helper.hoverOverElement(NavBarLocator.Cart);
            helper.hoverOverElement(NavBarDropDownLocators.view_cart);
            helper.clickOnElement(NavBarDropDownLocators.view_cart);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Description: Proceeds to the checkout process from the cart view.
     * 
     * @param test ExtentTest instance used for logging the test status.
     * @return Logs any exception encountered during the method execution.
     */
    public void checkout(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout, 1);
            helper.hoverOverElement(NavBarDropDownLocators.Proceed_to_checkout);
            Screenshot.captureScreenShot("Fitness_Gloves");
            helper.clickOnElement(NavBarDropDownLocators.Proceed_to_checkout);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
