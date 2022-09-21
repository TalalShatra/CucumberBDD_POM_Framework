package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {
    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create country")
    public void user_create_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigationToCountriesPage();
        dialogContentElements= new DialogContentElements();
        dialogContentElements.addingNewCountry();
    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements = new DialogContentElements();
        dialogContentElements.validateSuccessMessage();
    }

    @When("User edit country")
    public void user_edit_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigationToCountriesPage();
        dialogContentElements= new DialogContentElements();
        dialogContentElements.editCountry();

    }

    @When("User delete country")
    public void user_delete_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigationToCountriesPage();
        dialogContentElements= new DialogContentElements();
        dialogContentElements.deleteCountry();
    }
}
