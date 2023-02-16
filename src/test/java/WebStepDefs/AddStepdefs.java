package WebStepDefs;

import Core.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AddStepdefs extends BrowserClass {

    WebDriver driver; //comment

    BrowserClass mojaloss = new BrowserClass();

    @Given("user in add customer page")
    public void userInAddCustomerPage() {

        mojaloss.browser();
    }

    @When("user enter {string} and {string} and {string}")
    public void userEnterFirstnameAndLastnameAndPostcode(String firstname, String lastname, String postcode) {

        mojaloss.addCus(firstname, lastname, postcode);

    }

    @And("click addcustomer button")
    public void clickAddcustomerButton() {

        mojaloss.clickButt();
    }

    @Then("click ok")
    public void clickOk() {

        mojaloss.alertt();

    }
    //////////////////////// 2nd Scenario //////////////////////
    @Given("user in open account page")
    public void userInOpenAccountPage() {
        mojaloss.openAcc();
    }

    @When("user select customer name from dropdown")
    public void userSelectCustomerNameFromDropdown() {
        mojaloss.nameCus();
    }

    @And("user select currency from dropdown")
    public void userSelectCurrencyFromDropdown() {
        mojaloss.currencyCus();
    }

    @Then("click process")
    public void clickProcess() {

        mojaloss.clickButtDola();
    }
    //////////////////////// 3rd Scenario //////////////////////
    @Given("user go to page")
    public void userGoToPage() {
        mojaloss.goCus();
    }

    @When("user search names")
    public void userSearchNames() {
        mojaloss.searchCus();
    }

    @And("user click delete button")
    public void userClickDeleteButton() {
        mojaloss.deleteCus();

    }

    @Then("click home")
    public void clickHome() {
        //mojaloss.homeCus();
        mojaloss.deleteCus();

    }

}
