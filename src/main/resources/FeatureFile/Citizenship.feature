Feature: Citizenship Functionality

  Background:
    Given User is on Login Page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Create Citizenship
    When User create Citizenship with "TestTalalCitizenShip" name and "TTC" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "TestTalalCitizenShip" citizenship to "UpdatedTalalCitizenShip" updatedCitizenship
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "UpdatedTalalCitizenShip" updatedCitizenship
    Then Success message should be displayed