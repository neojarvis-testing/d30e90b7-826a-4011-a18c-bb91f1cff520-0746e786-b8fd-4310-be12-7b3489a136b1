package pages;
import com.aventstack.extentreports.ExtentTest;
import uistore.NavBarDropDownLocators_uday;
import uistore.NavBarLocators_Mohit;
import uistore.NavBarLocators_uday;
import uistore.ProductDetails_uday;
import uistore.Products_FilterLocators_uday;
import utils.Base;
import utils.DriverHelper;
public class HomepageActions_Uday {
    DriverHelper helperObj1=new DriverHelper(Base.driver);
    String currUrl=Base.driver.getCurrentUrl();
    public void rackethoverclick(ExtentTest test){
        try{
        System.out.println("Hello1");
        // helperObj1.waitForElementToBeVisible(NavBarLocators_uday.Racket_sports, 20);
        helperObj1.waitForElementToBeVisible(NavBarLocators_Mohit.shopnow, 20);
        helperObj1.hoverOverElement(NavBarLocators_uday.Racket_sports);
        helperObj1.waitForElementToBeVisible(NavBarDropDownLocators_uday.Badminton_Rackets, 20);
        helperObj1.clickOnElement(NavBarDropDownLocators_uday.Badminton_Rackets);
        }
        catch(Exception e){
            e.printStackTrace();
       }
    }
    public void clickingfirstProduct(ExtentTest test) {
        try{
        System.out.println("Hello2");
        helperObj1.waitForElementToBeVisible(ProductDetails_uday.Rackets_firstproduct, 10);
        helperObj1.clickOnElement(ProductDetails_uday.Rackets_firstproduct);
        helperObj1.clickOnElement(Products_FilterLocators_uday.plusincrease_racketsports);
        helperObj1.clickOnElement(Products_FilterLocators_uday.Addtocart_racketsports);
        helperObj1.clickOnElement(Products_FilterLocators_uday.input_zipcode);
        helperObj1.sendKeys(Products_FilterLocators_uday.input_zipcode,"641001");
        helperObj1.clickOnElement(Products_FilterLocators_uday.check_Button);
        }
        catch(Exception e){
            e.printStackTrace();
       }
        
    }
    
    public void navigateBackHome(ExtentTest test) { 
        try{
        System.out.println("Hello3");
        Base.driver.navigate().to(currUrl);
        // helperObj1.waitForElementToBeVisible(NavBarLocators_uday.Racket_sports, 10);
        helperObj1.waitForElementToBeVisible(NavBarLocators_Mohit.shopnow, 20);
        helperObj1.hoverOverElement(NavBarLocators_uday.Racket_sports);
        helperObj1.waitForElementToBeVisible(NavBarDropDownLocators_uday.Badminton_Rackets, 20);
        helperObj1.clickOnElement(NavBarDropDownLocators_uday.Badminton_shoes);
        helperObj1.waitForElementToBeVisible(NavBarDropDownLocators_uday.Badminton_Rackets, 20);
        helperObj1.clickOnElement(ProductDetails_uday.shoes_firstproduct); 
        helperObj1.clickOnElement(Products_FilterLocators_uday.size_selects);
        helperObj1.clickOnElement(Products_FilterLocators_uday.Addtocart_badmintonshoes);
        }
        catch(Exception e){
            e.printStackTrace();
       }
    }
}
