package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.List;

/**
 * Created by igorsandler on 1/24/19.
 */
public class ComputerDatabaseHomePage extends BasePage {
    //Locators for creating a new computer
    private By addNewComputerButton = By.id("add");
    private By addComputerNameTextBox = By.id("name");
    private By introducedDateTextBox = By.id("introduced");
    private By discontinuedDateTextBox = By.id("discontinued");
    private By companyDropDown = By.id("company");
    private By addThisComputerButton = By.xpath("//*[@id=\"main\"]/form/div/input");
    private By newComputerMessage = By.cssSelector("#main > div.alert-message.warning");

    //Locators for reading (searching) a computer
    private By filterByComputerNameTextBox = By.id("searchbox");
    private By filterByNameButton = By.id("searchsubmit");
    private By resultsTable = By.cssSelector("#main > form:nth-child(2) > div > input");

    //Locators for editing a computer name
    private By computerNameLink = By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a");
    private By saveInfoButton = By.xpath("//input[@value='Save this computer']");

    //Locator for deleting a computer
    private By deleteComputer = By.xpath("//input[@value='Delete this computer']");

    //Locator for no computer found
    private By noComputerFound = By.xpath("//h1[contains(text(),'No computers found')]");




    // Asserting being on Computer database home page
    public void amIonComputerDatabaseHomePage() {
        String expectedResults = "Computers database";
        String actualResults = SharedSD.getDriver().getTitle();
        Assert.assertEquals(expectedResults, actualResults);
    }

    // Clicking Add a new computer button

    public void clickAddNewComputerButton() {
        clickOn(addNewComputerButton);
    }

    //Enter a new Computer name
    public void enterNewComputerName() {
        sendText(addComputerNameTextBox, "Test46");
    }

    //Enter Introduced date
    public void enterIntroducedDate() {
        sendText(introducedDateTextBox, "2018-06-05");
    }

    //Enter Discontinued date
    public void enterDiscontinuedDate() {
        sendText(discontinuedDateTextBox, "2018-07-05");
    }

    //Select Company
    public void selectCompany() {
        Select companyChoice = new Select(SharedSD.getDriver().findElement(companyDropDown));
        companyChoice.selectByVisibleText("Apple Inc.");
    }

    //Clicking Create New Computer Button
    public void clickCreateNewComputerButton() {
        clickOn(addThisComputerButton);
    }

    //Confirm New Computer
    public void confirmNewComputer() {
        try {


            String expectedResult = "Done! Computer Test46 has been created";
            WebElement element = SharedSD.getDriver().findElement(newComputerMessage);
            String actualResult = element.getText();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    //Enter computer name to be searched
    public void searchComputer() {
        sendText(filterByComputerNameTextBox, "Test46");
    }

    //Click Filter by name button
    public void clickFilterByNameButton() {
        clickOn(filterByNameButton);
    }

    //Assert results
    public void searchResultsTable() {

        try {

            List<WebElement> list = SharedSD.getDriver().findElements(resultsTable);
            for (WebElement element : list) {
                if (element.getText().contains("Test46 05 Jun 2018 05 Jul 2018 Apple Inc.")) {
                    String actualName = element.getText();
                    System.out.println(actualName);

                    System.out.println("Test case passed");

                } else {
                    System.out.println("Wrong search results");
                }

            }


        } catch (ElementNotSelectableException e) {
            e.printStackTrace();


        }

    }

    public void clearBoxAndClickButton() {
        try {

            SharedSD.getDriver().findElement(filterByComputerNameTextBox).clear();
            clickOn(filterByNameButton);

        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    //Click link
    public void nameLink() {
        try {
            clickOn(computerNameLink);
        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    //Update Computer Name
    public void updateName() {
        try {
            SharedSD.getDriver().findElement(addComputerNameTextBox).clear();
            sendText(addComputerNameTextBox, "Test45");

        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    //Confirm Update
    public void confirmUpdate() {
        try {

            String expectedResult = "Done! Computer Test45 has been updated";
            WebElement element = SharedSD.getDriver().findElement(newComputerMessage);
            String actualResult = element.getText();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (ElementNotSelectableException e) {
            e.printStackTrace();
        }
    }

    //Click Save New Computer Button
        public void clickSaveButton() {
        clickOn(saveInfoButton);
        }

        //Click Delete Button
        public void clickDeleteButton() {
        clickOn(deleteComputer);
        }

        //Confirm Deleted Computer
        public void confirmDelete() {
            try {

                String expectedResult = "Done! Computer has been deleted";
                WebElement element = SharedSD.getDriver().findElement(newComputerMessage);
                String actualResult = element.getText();
                Assert.assertEquals(expectedResult, actualResult);
            } catch (ElementNotSelectableException e) {
                e.printStackTrace();
            }
        }

        //Enter computer name to be deleted
        public void enterUpdatedComputerName() {
        sendText(filterByComputerNameTextBox,"Test45");
        }

        //Search for non-existing computer
        public void noComputerFound() {
            try {

                String expectedResult = "No computers found";
                WebElement element = SharedSD.getDriver().findElement(noComputerFound);
                String actualResult = element.getText();
                Assert.assertEquals(expectedResult, actualResult);
            } catch (ElementNotSelectableException e) {
                e.printStackTrace();
            }
        }
}