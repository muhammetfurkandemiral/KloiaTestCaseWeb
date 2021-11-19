package KloiaWeb.pages;

import KloiaWeb.utils.Drivers;
import KloiaWeb.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement countryIcon;
    public void chooseUS() {
        countryIcon.click();
    }

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;
    public void closePopup(){
        try {
            closeButton.click();
        }
        catch (Exception e) {
            System.out.println("Popup is not exist.");
        }
    }

    public void verifyPageTitle(String arg0) {
        Assert.assertTrue(Drivers.get().getTitle().contains(arg0));
    }

    @FindBy(id = "gh-search-input")
    public WebElement searchField;
    public void search(String arg0) {
        searchField.click();
        searchField.sendKeys(arg0);
    }

    @FindBy(className="header-search-icon")
    public WebElement searchBtn;
    public void searchBtn() {
        searchBtn.click();
    }

    @FindBy(css=".plButton-label.v-ellipsis")
    public WebElement accountDropdown;
    @FindBy(xpath="//a[@data-lid='ubr_mby_signin_b']")
    public WebElement selectSignIn;
    public void goToSignInPage() {
        accountDropdown.click();
        selectSignIn.click();
    }

    @FindBy(className="hamburger-menu-button")
    public WebElement menuButton;
    public void chooseMenu(String arg0, String subMenu, String category) {
        menuButton.click();
        Helpers.menuLocator(subMenu);
        Helpers.menuLocator(category);
        Helpers.partialLink(arg0);
    }

}
