package KloiaWeb.pages;

import KloiaWeb.utils.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    @FindBy(css = ".tyj39b-5.lfsBU")
    public WebElement cookieBtn;
    public void closeCookie() {
        cookieBtn.click();

    }

    @FindBy(xpath = "//div[text()='Giriş Yap']")
    public WebElement loginIcon;
    @FindBy(className = "fDarBX")
    public WebElement loginButton;
    public void goToLoginPage() {
        loginIcon.click();
        loginButton.click();
    }

    @FindBy(name = "k")
    public WebElement productName;
    public void searchProduct(String arg0) {
        productName.sendKeys(arg0);
    }

    @FindBy(css = ".gaMakD")
    public WebElement searchButton;
    public void clickSearch() {
        searchButton.click();
    }
}
