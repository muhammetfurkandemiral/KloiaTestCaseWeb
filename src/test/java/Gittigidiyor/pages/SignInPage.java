package Gittigidiyor.pages;

import Gittigidiyor.utils.Drivers;
import Gittigidiyor.utils.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Drivers.get(),this);
    }

    @FindBy(id = "L-UserNameField")
    public WebElement emailField;
    public void fillEmail(String arg0) {
        emailField.sendKeys(arg0);
    }

    @FindBy(id = "L-PasswordField")
    public WebElement passwordField;
    public void fillPassword(String arg0) {
        passwordField.sendKeys(arg0);
    }

    @FindBy(id = "gg-login-enter")
    public WebElement loginButton;
    public void clickLogin() throws InterruptedException {
        loginButton.click();
    }
}
