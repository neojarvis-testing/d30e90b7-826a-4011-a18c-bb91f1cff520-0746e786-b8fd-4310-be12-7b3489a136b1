package uistore;

import org.openqa.selenium.By;

public class Products_FilterLocators_uday {
    //testcase2
    public static By plusincrease_racketsports=By.cssSelector("a.icon-plus.qty-plus");
    public static By Addtocart_racketsports=By.cssSelector("svg#cart-icon-small");
    public static By input_zipcode=By.cssSelector("input[placeholder='Enter Delivery Zipcode']");
   // public static By check_Button=By.xpath("//span[contains(text(),'Check')]");
    public static By check_Button=By.cssSelector("button[class='action primary']");
    public static By size_selects=By.cssSelector("div#option-label-size_uk-196-item-517");
    public static By Addtocart_badmintonshoes=By.id("product-addtocart-button");
    //testcase3
    public static By compare1_product=By.xpath("//a[@class='action tocompare'][1]");
    public static By compare2_product=By.xpath("//a[@class='action tocompare'][2]");
    public static By compareproduct=By.cssSelector("a[href='https://sportsjam.in/catalog/product_compare/']");
    public static By secondProductwrong=By.xpath("(//a[@class='action delete'])[2]");
    public static By firstProductwrong=By.xpath("(//a[@class='action delete'])[1]");
    public static By OKClick=By.cssSelector("button[class='action-primary action-accept']");
}
