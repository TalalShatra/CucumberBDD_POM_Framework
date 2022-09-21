Feature: Countries Functionality

  Scenario: Create Country
    Given User is on Login Page
    When User enter admin credentials
    Then User should login successfully
    When User create country
    Then Success message should be displayed

  Scenario: Edit Country
    Given User is on Login Page
    When User enter admin credentials
    Then User should login successfully
    When User edit country
    Then Success message should be displayed

  Scenario: Delete Country
    Given User is on Login Page
    When User enter admin credentials
    Then User should login successfully
    When User delete country
    Then Success message should be displayed