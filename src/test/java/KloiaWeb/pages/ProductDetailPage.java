package KloiaWeb.pages;

import KloiaWeb.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    public ProductDetailPage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    @FindBy(className = "save-for-later-save")
    public WebElement saveButton;
    public void clickSave() {
        saveButton.click();
    }

    @FindBy(className = "savedItems-button")
    public WebElement savedItems;
    public void openSaveItems() {
        savedItems.click();
    }


    @FindBy(className = "sku-card-product-title")
    public WebElement savedProductTitle;
    @FindBy(className = "sku-title")
    public WebElement productTitle;
    public void verifySavedItem() {
        Assert.assertEquals(savedProductTitle.getText(),productTitle.getText());
    }


}
