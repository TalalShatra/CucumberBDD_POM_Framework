Feature: Fees Functionality
  Background:
    Given User is on Login Page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Fees
    When User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
    | name       | code   | intCode   |priority |
    | TestFee190 | 013001 | paypal    |500      |
    | TestFee191 | 013002 | applePay  |600      |
    | TestFee192 | 013003 | googlePay |700      |

  Scenario Outline: Edit Fees
    When User edit Fee "<name>" to "<newName>"
    Then Success message should be displayed

    Examples:
      | name       | newName      |
      | TestFee190 | newTestFee190  |
      | TestFee191 | newTestFee191 |
      | TestFee192 | newTestFee192 |

  Scenario Outline: Delete Fees
    When User delete Fee "<newName>"
    Then Success message should be displayed

    Examples:
      |  newName    |
      | newTestFee190 |
      | newTestFee191 |
      | newTestFee192 |