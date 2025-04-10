package uistore;

import org.openqa.selenium.By;

public class NavBarLocators_Harshit {
    public static By searchBar = By.xpath("(//span[@class='search-icon-wrapper'])[1]");
    public static By search = By.id("search");
    public static By GoButton = By.xpath("//button[@class='action search']");
    public static By RocketSports = By.xpath("(//span[text()='Racket Sports'])[2]");
    public static By shoes = By.xpath("(//span[text()='Shoes'])[2]");
    public static By removeRacket = By.cssSelector("a[title='Remove Category Racket Sports']");
    public static By Text1 = By.className("base");
    public static By Text2 = By.cssSelector("span[class='base']");
    public static By clothing = By.xpath("(//span[text()='Clothing'])[2]");
    public static By accessories = By.xpath("(//span[text()='Accessories'])[5]");
    public static By running = By.xpath("(//span[text()='Running'])[4]");
    public static By clearAll = By.xpath("//span[text()='Clear All']");

}
