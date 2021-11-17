package Gittigidiyor.step_def;

import Gittigidiyor.pages.CartPage;
import Gittigidiyor.pages.HomePage;
import Gittigidiyor.pages.SearchPage;
import Gittigidiyor.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MySteps {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SearchPage searchPage = new SearchPage();
    CartPage cartPage = new CartPage();

    @Given("Close Cookie")
    public void close_Cookie() {
        homePage.closeCookie();
    }

    @And("Go to Login Page")
    public void goToLoginPage() {
        homePage.goToLoginPage();
    }

    @Given("Fill Email Field with {string}")
    public void fillEmailField(String arg0) {
        signInPage.fillEmail(arg0);

    }

    @And("Fill Password Field with {string}")
    public void fillPasswordField(String arg0) {
        signInPage.fillPassword(arg0);
    }

    @Then("Click Login Button")
    public void clickLoginButton() throws InterruptedException {
        signInPage.clickLogin();
    }

    @Given("I search {string}")
    public void searchProduct(String arg0) {
        homePage.searchProduct(arg0);
    }

    @Then("I click search button")
    public void clickSearchButton() {
        homePage.clickSearch();
    }

    @And("Validate search result {string}")
    public void validateSearchResult(String arg0) {
        searchPage.validateResult(arg0);
    }

    @And("Go to Search Page {string}")
    public void goToSearchPage(String arg0) {
        searchPage.goToPage(arg0);
    }

    @And("Validate Search Page {string}")
    public void validateSearchPage(String arg0) {
        searchPage.validateSearchResult(arg0);
    }

    @Then("Choose any Product")
    public void chooseAnyProduct() {
        searchPage.chooseProduct();
    }

    @And("Add to Cart")
    public void addToCart() {
        searchPage.addToCart();
    }

    @Then("Go to My Cart")
    public void goToMyCart(){
        searchPage.goToMyCart();
    }

    @And("If exist Add {string} Amount")
    public void ifExistAddAmount(String arg0) {
        cartPage.addAmount(arg0);
    }

    @And("Delete Product")
    public void deleteProduct() {
        cartPage.deleteProduct();
    }

    @And("Validate Cart Empty with {string}")
    public void validateCartEmptyWith(String arg0) {
        cartPage.validateDelete(arg0);
    }

    @Then("Go back Home Page")
    public void goBackHomePage() {
        cartPage.goBackHome();
    }
}
