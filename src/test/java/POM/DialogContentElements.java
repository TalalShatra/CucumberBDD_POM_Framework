package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class DialogContentElements extends BasePOM {

    public DialogContentElements() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement nameSearchButton;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;


    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteSubmitButton;



    public void addingNewCountry() {
        addButton.click();
        nameInput.sendKeys("count10");
        codeInput.sendKeys("10");
        saveButton.click();
    }

    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editCountry() {
        nameSearchButton.sendKeys("count10");
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys("count11");
        saveButton.click();
    }

    public void deleteCountry() {
        nameSearchButton.sendKeys("count11");
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        deleteButton.click();
        deleteSubmitButton.click();

    }
    // CitizenShip Functionality

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;

    public void createCitizenship(String name, String shortName) {
        addButton.click();
        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);
        saveButton.click();
    }

    public void editCitizenship(String citizenship, String updatedCitizenship) {
        nameSearchButton.sendKeys(citizenship);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(updatedCitizenship);
        saveButton.click();
    }

    public void deleteCitizenship(String updatedCitizenship) {
        nameSearchButton.sendKeys(updatedCitizenship);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        deleteButton.click();
        deleteSubmitButton.click();

    }
    // Fees Functionality

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement intCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;

    public void createFees(String name, String code, String intCode, String priority) {
        addButton.click();
        nameInput.sendKeys(name);
        codeInput.sendKeys(code);
        intCodeInput.sendKeys(intCode);
        priorityInput.sendKeys(priority);
        saveButton.click();
    }

    public void editFees(String name, String newName) {
        nameSearchButton.sendKeys(name);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys(newName);
        saveButton.click();
    }

    public  void deleteFees(String newName) {
        nameSearchButton.sendKeys(newName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        deleteButton.click();
        deleteSubmitButton.click();

    }
}
