package Gittigidiyor.pages;

import Gittigidiyor.utils.Drivers;
import Gittigidiyor.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    public void validateResult(String arg0) {
        Assert.assertTrue(Drivers.get().getTitle().toLowerCase().contains(arg0));
    }


    public void goToPage(String arg0) {
        String locator="//a[@title='" + arg0 + ". sayfa']";
       /*Element click interception solved*/
        Helpers.clickIntercepted(locator);
    }

    public void validateSearchResult(String arg0) {
        Assert.assertTrue(Drivers.get().getCurrentUrl().contains(arg0));

    }

    public void chooseProduct() {
        By mySelector = By.cssSelector(".sc-1nx8ums-0.dyekHG");
        String productName = Helpers.listProducts(mySelector);
        String locator = "//h2[contains(text(),'" + productName + "')]";
        Helpers.clickIntercepted(locator);
    }

    @FindBy(id = "add-to-basket")
    public WebElement addToCartButton;
    public void addToCart() {
        addToCartButton.click();
    }

    @FindBy(css = ".gg-d-10.pl0")
    public WebElement myCart;
    public void goToMyCart(){
        myCart.click();
    }
}
