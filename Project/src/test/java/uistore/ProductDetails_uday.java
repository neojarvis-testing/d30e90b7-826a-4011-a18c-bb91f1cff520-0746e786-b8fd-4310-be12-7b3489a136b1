package uistore;

import org.openqa.selenium.By;

public class ProductDetails_uday {
    
    //testcase2
    public static   By Rackets_firstproduct=By.id("product-item-info_40047");
    public static   By shoes_firstproduct=By.cssSelector("a[title='Yonex Blaze 2I Badminton Shoes (Red/Black/Gold)']");
    //testcase3
    public static   By list_viewproduct=By.id("mode-list");
   // public static By verifyAddtocart=By.xpath("//span[contains(text(),'Product added to cart')]");
    public static By verifyZipcode=By.id("form-product-zipcode");
    public static By verifybeforecheckzipcode=By.xpath("//div[@class='message error']");
    public static By verifyaddtocartButton=By.xpath("//button[@id='product-addtocart-button']//span");
    // public static By verifybeforecheckzipcode=By.cssSelector("div[class='message error']");
    

    
}
