package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

public class CommonStepDefs {




    @Given("User is on the {string} home page")
    public void user_is_on_the_home_page(String url) {

        Driver.getDriver().get(url);


    }


    @Then("close the application")
    public void close_the_applicaton() {

        Driver.closeDriver();

    }




}
