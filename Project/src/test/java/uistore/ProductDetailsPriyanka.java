package uistore;

import org.openqa.selenium.By;

public class ProductDetailsPriyanka {
    public static By searchBarBrand = By.cssSelector("input[name='keyword']");
    public static By searchiconInBrandPage = By.xpath("(//span[@class='search-icon-wrapper'])[2]");
    public static By clickPumaLogo = By.cssSelector("div[class='image']");
    public static By clickOnPumaLabel = By.cssSelector("a[class='link-brand']");
    public static By iteratePumaProducts = By.cssSelector("div[class='product details product-item-details']");
    public static By hoverOverElementToquickView = By.cssSelector("a[title='Puma Women Sport Quarters Assorted']");
    public static By quickViewOfPumaProduct = By.cssSelector("a[data-quickview-url='https://sportsjam.in/ox_quickview/catalog_product/view/id/30663/']");
    public static By verifyQuickViewlabel = By.cssSelector("span[data-ui-id='page-title-wrapper']");
    public static By iframe=By.cssSelector("iframe[src='https://sportsjam.in/ox_quickview/catalog_product/view/id/30663/']");
    public static By hoverOverWindowOpenByquickview =By.cssSelector("div[class='product-info-main']");
    public static By clickOnAddtoWhishList = By.cssSelector("a[data-action='add-to-wishlist']");
    public static By verifyErrorMessageWhishList = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static By verifyErrorMessageToSignIn = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static By inputEmailAdd = By.id("email");
    public static By inputPassword = By.id("pass");
    public static By clickOnSignIn = By.id("send2");
    public static By errorMessageVerify = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public static By verifyBadmintonShoes = By.id("page-title-heading");
    public static By verifyBasketBall = By.id("page-title-heading");
    public static By verifyCricket = By.id("page-title-heading");
    public static By verifyFootball = By.id("page-title-heading");
    public static By verifyRunning = By.id("page-title-heading");
    public static By verifysquash = By.id("page-title-heading");


    





}
