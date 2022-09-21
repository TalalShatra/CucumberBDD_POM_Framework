package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.When;

public class FeesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Fee {string} and {string} and {string} and {string}")
    public void user_create_fee_and_and_and(String name, String code, String intCode, String priority) {

        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigateToFeesPage();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.createFees(name, code, intCode, priority);
    }

    @When("User edit Fee {string} to {string}")
    public void user_edit_fee_to(String name, String newName) {

        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigateToFeesPage();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.editFees(name,newName);
    }

    @When("User delete Fee {string}")
    public void user_delete_fee(String newName) {

        navigationBarElements = new NavigationBarElements();
        navigationBarElements.navigateToFeesPage();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.deleteFees(newName);

    }
}
