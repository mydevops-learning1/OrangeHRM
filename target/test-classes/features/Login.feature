Feature: Login Feature

  Scenario: Login as a authenticated user
    Given user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
