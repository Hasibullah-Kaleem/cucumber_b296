package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefs {

    DataTablesPage dataTablePage;

    ExcelUtils excelUtils;

    @Given("user navigate to {string} pages and enters {string} from {string} excel sheet")
    public void user_navigate_to_pages_and_enters_from_excel_sheet(String URL, String sheet_name, String excelName) {

        String pathOfExcel = "src/test/resources/"+excelName+""; //this is more dynamic.......
        excelUtils = new ExcelUtils(pathOfExcel,sheet_name);
        List<Map<String, String>> dataList =excelUtils.getDataList();

        dataTablePage = new DataTablesPage();
        for (Map<String, String> eachData : dataList ){

            Driver.getDriver().get(URL);
            WaitUtils.waitFor(1);
            dataTablePage.newButton.click();
            dataTablePage.firstNameField.sendKeys(eachData.get("first_name"));
            dataTablePage.lastNameField.sendKeys(eachData.get("last_name"));
            dataTablePage.positionField.sendKeys(eachData.get("position"));
            dataTablePage.officeField.sendKeys(eachData.get("office"));
            dataTablePage.extensionField.sendKeys(eachData.get("extension"));
            dataTablePage.startDateField.sendKeys(eachData.get("start_date"));
            dataTablePage.salaryField.sendKeys(eachData.get("salary"));
            dataTablePage.createButton.click();

            dataTablePage.searchButton.sendKeys(eachData.get("first_name"));
            Assert.assertTrue(dataTablePage.nameDisplay.getText().contains(eachData.get("first_name")));



        }

    }
    @Then("verify user connection")
    public void verify_user_connection() {


    }

}

