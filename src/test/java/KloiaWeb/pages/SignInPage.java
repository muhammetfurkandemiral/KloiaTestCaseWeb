package KloiaWeb.pages;

import KloiaWeb.utils.ConfReader;
import KloiaWeb.utils.Drivers;
import KloiaWeb.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    @FindBy(id = "fld-e")
    public WebElement emailField;
    public void fillEmail() {
        String email = ConfReader.get("email");
        emailField.sendKeys(email);
    }

    @FindBy(id = "fld-p1")
    public WebElement passwordField;
    public void fillPassword() {
        String password = ConfReader.get("password");
        passwordField.sendKeys(password);
    }

    public void login() {
        passwordField.click();
        passwordField.sendKeys(Keys.ENTER);
    }

    @FindBy(css=".plButton-label.v-ellipsis")
    public WebElement helloText;
    public void verifyLogin(String arg0) {
        Assert.assertTrue(helloText.getText().toLowerCase().contains(arg0.toLowerCase()));
    }

    @FindBy(css=".svg-button.social-button.undefined")
    public WebElement googleButton;
    @FindBy(id="identifierId")
    public WebElement googleEmailField;
    @FindBy(css=".FliLIb.DL0QTb")
    public WebElement googleNextButton;
    @FindBy(name="password")
    public WebElement googlePasswordField;
    public void signWithGoogle() {
        String email = ConfReader.get("google-email");
        String password = ConfReader.get("google-password");
        Helpers.waitFor(2);
        googleButton.click();
        Helpers.switchLastTab();
        googleEmailField.sendKeys(email);
        googleNextButton.click();
        googlePasswordField.sendKeys(password);
        googlePasswordField.sendKeys(Keys.ENTER);
        Helpers.waitFor(2);
        Helpers.switchLastTab();
    }

    public void openNewTab() {
        String urlNewTab = "https://www.bestbuy.com/";
        Helpers.openNewTab(urlNewTab);
        Helpers.switchLastTab();
    }
}
