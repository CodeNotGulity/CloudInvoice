@regression
Feature: Validating Elements on Internet Page

  Scenario: Validating elements exist on page
    Given User navigates to "InternetHeroApp" application
    When User adds 10 of Elements
    Then user validates number of elements on UI is correct