package uistore;

import org.openqa.selenium.By;

public class NavBarLocatorsPriyanka {
    
    public static By brandNavBar = By.cssSelector("a[href='https://sportsjam.in/shopbrand']");
   // public static By hoverOverNavBarShoes = By.cssSelector("a[href='https://sportsjam.in/shoes']");
    public static By hoverOverNavBarShoes = By.xpath("//li[@class='level0 category-item level-top parent ox-dropdown--megamenu parent']//a[@href='https://sportsjam.in/shoes']");



}
