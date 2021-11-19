package KloiaWeb.step_def;

import KloiaWeb.pages.HomePage;
import KloiaWeb.pages.ProductDetailPage;
import KloiaWeb.pages.SearchProductPage;
import KloiaWeb.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SearchProductPage searchProductPage = new SearchProductPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Given("Homepage is open")
    public void homepageIsOpen() {
        homePage.chooseUS();
    }

    @When("Popup close")
    public void popupClose() {
        homePage.closePopup();
    }

    @Given("Verify Page Title with {string}")
    public void verifyPageTitleWith(String arg0) {
        homePage.verifyPageTitle(arg0);
    }

    @And("Search for {string}")
    public void searchFor(String arg0) {
        homePage.search(arg0);
        homePage.searchBtn();
    }

    @Then("Verify search results are listed for {string}")
    public void verifySearchResultsAreListedFor(String arg0) {
        searchProductPage.verifySearchResult(arg0);
    }

    @Given("Go to Sign In page")
    public void goToSignInPage() {
        homePage.goToSignInPage();
    }

    @And("Fill email")
    public void fillEmailWith() {
        signInPage.fillEmail();
    }

    @And("Fill password")
    public void fillPasswordWith() {
        signInPage.fillPassword();
    }

    @Then("Login with Enter button")
    public void loginWithEnterButton() {
        signInPage.login();
    }

    @And("Verify Succesful Login with {string}")
    public void verifySuccesfulLoginWith(String arg0) {
        signInPage.verifyLogin(arg0);
    }

    @And("Sign in with Google")
    public void signInWithGoogle() {
        signInPage.signWithGoogle();
    }

    @Then("Open new tab")
    public void openNewTab() {
        signInPage.openNewTab();
    }


    @Given("Click {string} at {string} , {string} under Menu")
    public void clickUnderMenu(String arg0, String subMenu, String category) {
        homePage.chooseMenu(arg0,subMenu,category);
    }

    @And("Filter Brands by {string} and select")
    public void filterBrandsByAndSelect(String arg0) {
        searchProductPage.filterBrands(arg0);
    }

    @And("Click {int}nd product")
    public void clickSecondProduct(int arg0) {
        searchProductPage.chooseProduct(arg0);
    }

    @And("Click Save button")
    public void clickSaveButton() {
        productDetailPage.clickSave();
    }

    @And("Open Saved Items list")
    public void openSavedItemsList() {
        productDetailPage.openSaveItems();
    }

    @Then("Verify that the title of saved product is on the list")
    public void verifyThatTheTitleOfSavedProductIsOnTheList() {
        productDetailPage.verifySavedItem();
    }

}
