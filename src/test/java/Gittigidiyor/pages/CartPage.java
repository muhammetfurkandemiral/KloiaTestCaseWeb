package Gittigidiyor.pages;

import Gittigidiyor.utils.Drivers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Drivers.get(),this);
    }


    public void addAmount(String arg0) {
        Select amounts = new Select(Drivers.get().findElement(By.cssSelector("[class='amount']")));
        if(amounts.isMultiple()) {
            amounts.selectByValue(arg0);
        }
        else System.out.println(amounts.getAllSelectedOptions());
    }

    @FindBy(xpath ="//a[@title='Sil']")
    public WebElement deleteProduct;
    public void deleteProduct() {
        deleteProduct.click();
    }

    @FindBy(xpath ="//h2[text()='Sepetinizde ürün bulunmamaktadır.']")
    public WebElement validate;
    public void validateDelete(String arg0) {
        Assert.assertTrue(validate.getText().contains(arg0));
    }

    @FindBy(className ="logo-small")
    public WebElement homePageLogo;
    public void goBackHome() {
        homePageLogo.click();
    }
}
