package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GoogleHomePage;
import utilities.Driver;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefs {
    GoogleHomePage homePage = new GoogleHomePage();

    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.co.uk/");
    }
    @Given("user accepts cookies")
    public void user_accepts_cookies() {
       homePage.cookies.click();
    }
    @And("user search for Iphone")
    public void user_search_for_iphone() {
        homePage.googleSearchBox.sendKeys("Iphone", Keys.ENTER);
    }
    @Given("user switches to iframe")
    public void user_switches_to_iframe() {
       Driver.getDriver().switchTo().frame(0);
    }
    @Given("user clicks captcha")
    public void user_clicks_captcha() {

       homePage.captcha.click();
    }
    @Then("verify the result contain Iphone")
    public void verify_the_result_contain_iphone() {
        assertTrue(Driver.getDriver().getTitle().contains("Iphone"));

    }

    @Given("user searches for tea pot")
    public void user_searches_for_tea_pot() {

    }
    @Then("verify the result contains tea pot")
    public void verify_the_result_contains_tea_pot() {

    }

    @Given("user searches for book")
    public void user_searches_for_book() {

    }
    @Then("verify the result contains book")
    public void verify_the_result_contains_book() {

    }

    @Given("User searches for {string} on google")
    public void user_searches_for_on_google(String product) {
        homePage.googleSearchBox.sendKeys(product, Keys.ENTER);

    }
    @Then("user verifies page title contains {string}")
    public void user_verifies_page_title_contains(String product) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(product));


    }

}
