package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DataTablesPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class DataTablesStepDefs {
    DataTablesPage tablesPage = new DataTablesPage();
    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
    }
    @Given("user click new button")
    public void user_click_new_button() {
        tablesPage.newButton.click();
    }
    @Given("user enters firstname as {string}")
    public void user_enters_firstname_as(String firstName) {
        tablesPage.firstNameField.sendKeys(firstName);
    }
    @Given("user enters lastname as {string}")
    public void user_enters_lastname_as(String lastName) {
        tablesPage.lastNameField.sendKeys(lastName);
    }
    @Given("user enters position as {string}")
    public void user_enters_position_as(String position) {
        tablesPage.positionField.sendKeys(position);
    }
    @Given("user enters office as {string}")
    public void user_enters_office_as(String office) {
        tablesPage.officeField.sendKeys(office);
    }
    @Given("user enters extension as {string}")
    public void user_enters_extension_as(String extension) {
        tablesPage.extensionField.sendKeys(extension);
    }
    @Given("user enters start_date as {string}")
    public void user_enters_start_date_as(String startDate) {
        tablesPage.startDateField.sendKeys(startDate);
    }
    @Given("user enters salary as {string}")
    public void user_enters_salary_as(String salary) {
        tablesPage.salaryField.sendKeys(salary);
    }
    @Given("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        tablesPage.createButton.click();
    }
    @Given("user enters first name as {string} into the search box")
    public void user_enters_first_name_as_into_the_search_box(String firstName) {
        tablesPage.searchButton.sendKeys(firstName);
    }
    @Then("verify the name fields contains first name as {string}")
    public void verify_the_name_fields_contains_first_name_as(String firstName) {
        assertTrue(tablesPage.nameDisplay.getText().contains(firstName));
    }
}
