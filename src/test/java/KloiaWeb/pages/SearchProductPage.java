package KloiaWeb.pages;

import KloiaWeb.utils.Drivers;
import KloiaWeb.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
    public SearchProductPage(){
        PageFactory.initElements(Drivers.get(),this);
    }


    @FindBy(tagName = "h1")
    public WebElement searchResult;
    public void verifySearchResult(String arg0) {
        String result = searchResult.getText().toLowerCase();
        Assert.assertTrue(result.contains(arg0.toLowerCase()));
    }


    @FindBy(id = "brand_facet-search-bar-input")
    public WebElement filterBrand;
    public void filterBrands(String arg0) {
        filterBrand.sendKeys(arg0);
       filterBrand.sendKeys(Keys.ARROW_DOWN);
       filterBrand.click();
       filterBrand.sendKeys(Keys.ENTER);
        Helpers.waitFor(3);
    }

    public void chooseProduct(int arg0) {
        int index=arg0-1;
        By mySelector = By.cssSelector("li.sku-item");
        String productName = Helpers.productList(mySelector,index);
        Drivers.get().findElement(By.linkText(productName)).click();

    }


}
