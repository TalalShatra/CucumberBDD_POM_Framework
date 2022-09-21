package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.When;



public class CitizenshipSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Citizenship with {string} name and {string} shortname")
    public void user_create_citizenship_with_name_and_shortname(String name, String shortName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.createCitizenship(name, shortName);
    }
    @When("User edit {string} citizenship to {string} updatedCitizenship")
    public void user_edit_citizenship_to(String citizenship, String updatedCitizenship) {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigateToCitizenshipPage();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.editCitizenship(citizenship, updatedCitizenship);
    }

    @When("User delete {string} updatedCitizenship")
    public void user_delete_citizenship(String updatedCitizenship) {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigateToCitizenshipPage();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.deleteCitizenship(updatedCitizenship);
    }

}
