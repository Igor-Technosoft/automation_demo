package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.ComputerDatabaseHomePage;

/**
 * Created by igorsandler on 1/24/19.
 */
public class ComputerDatabaseHomePageSD {
    //Creating an object instance
    private ComputerDatabaseHomePage computerDatabaseHomePage = new ComputerDatabaseHomePage();

    //Asserting Computer Database Home Screen
    @Given("^I'm on computer database home page$")
    public void assertHomePageTitle() {
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }

    //Clicking Add a new computer button
    @Given("^I click Add a new computer button$")
    public void clickAddNewCompButton() {
        computerDatabaseHomePage.clickAddNewComputerButton();
    }

    //Asserting Add a new computer screen. Note: the Title is the same for both screens
    @Given("^I see Add a computer screen$")
    public void assertAddNewScreen() {
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }
    //Calling new computer name method from base page
    @Given("^I enter Test46 as Computer name$")
    public void enterComputerName() {
        computerDatabaseHomePage.enterNewComputerName();
    }

    //Calling entering Introduced Date method from base page
    @Given("^I enter 2018-06-05 as Introduced date$")
    public void addIntroducedDate() {
        computerDatabaseHomePage.enterIntroducedDate();
    }

    //Calling entering Discontinued Date method from base page
    @Given("^I enter 2018-07-05 as discontinued date$")
    public void addDiscontinuedDate() {
        computerDatabaseHomePage.enterDiscontinuedDate();
    }

    //Calling Selecting from companies list method method from base page
    @Given("^I select Apple Inc from Company drop-down menu$")
    public void selectNewCompany() {
        computerDatabaseHomePage.selectCompany();
    }

    //Calling Create New Computer button method from base page
    @When("^I click Create this computer button$")
    public void clickCreateNewComputerButton() {
        computerDatabaseHomePage.clickCreateNewComputerButton();
    }

    //Asserting Computer Database Home Screen method from base page
    @Then("^I'm back on computer database home screen$")
    public void assertReturnHomePage() {
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }

    //Calling Confirm Adding New Computer method from base page
    @Then("^I see Done! Computer Test46 has been created$")
    public void confirmAddNewComputer() {
        computerDatabaseHomePage.confirmNewComputer();
    }
    //Calling searchComputer method from base page
    @Given("^I enter Test46 in Filter by computer name text box$")
    public void searchExistingComputers() {
        computerDatabaseHomePage.searchComputer();
    }

    //Calling clickFilterByNameButton method from base page
    @When("^I click Filter by name button$")
    public void clickFilterButton() {
        computerDatabaseHomePage.clickFilterByNameButton();
    }

//    @Then("^I see One computer found$")
//    public void checkConfirmedFoundMessage() {
//        computerDatabaseHomePage.confirmFoundMessage();
//    }

    @Then("^I see Test46 in Computer name column$")
    public void confirmFoundName() {
        computerDatabaseHomePage.searchResultsTable();
    }

    @Then("^I clear text box and I click on Filter by name button$")
    public void clearField() {
        computerDatabaseHomePage.clearBoxAndClickButton();
    }
    @Then("^I'm back on the home screen$")
    public void assertBackHomePage() {
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }

    @Given("^I enter Test46 in Filter by computer text box$")
    public void enterEditName() {
        computerDatabaseHomePage.searchComputer();
    }

    @When("^I click Filter name button$")
    public void clickFilterButtonEdit() {
        computerDatabaseHomePage.clickFilterByNameButton();
    }

    @Then("^I see Test46 in Computer column$")
    public void confirmEditName() {
        computerDatabaseHomePage.searchResultsTable();
    }

    @Then("^I click Test46 link$")
    public void clickLink() {
        computerDatabaseHomePage.nameLink();
    }

    @Then("^I replace Test46 with Test45$")
    public void replaceText() {
        computerDatabaseHomePage.updateName();
    }

    @Then("^I see Done! Computer Test45 has been updated and I'm back on computer database home screen$")
    public void confirmNewUpdate() {
        computerDatabaseHomePage.confirmUpdate();
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }

    @Then("^I click Save this computer button$")
    public void saveButton() {
        computerDatabaseHomePage.clickSaveButton();
    }

    @Given("^I type in Test45 into Filter by computer name text box$")
    public void enterDeleteName() {
        computerDatabaseHomePage.enterUpdatedComputerName();
    }

    @Given("^click on  Filter by name button$")
    public void selectDeleteComputer() {
        computerDatabaseHomePage.clickFilterByNameButton();
    }

    @Given("^I see Test45 displayed$")
    public void confirmDeleteComputer() {
        computerDatabaseHomePage.searchResultsTable();
    }

    @Given("^I click Test45 link$")
    public void clickDeleteLink() {
        computerDatabaseHomePage.nameLink();
    }

    @When("^I click Delete this computer button$")
    public void deleteButton() {
        computerDatabaseHomePage.clickDeleteButton();
    }

    @Then("^I see Done! Computer has been deleted and I'm back on computer database home screen$")
    public void confirmDeleteBackHome()  {
        computerDatabaseHomePage.confirmDelete();
        computerDatabaseHomePage.amIonComputerDatabaseHomePage();
    }

    @Given("^I enter Test46 into the search box$")
    public void typeName() {
        computerDatabaseHomePage.searchComputer();
    }

    @When("^I click Filter button$")
    public void clickSearchButton() {
        computerDatabaseHomePage.clickFilterByNameButton();
    }

    @Then("^I see No computers found$")
    public void confirmNoComputerFound() {
        computerDatabaseHomePage.noComputerFound();
    }
}


