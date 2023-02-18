@Background
Feature: Background functionality

  Background: Go to login page
    Given user should go to login page

  Scenario: Login with valid credentials
    And user should enter in username field valid credential
    And user should enter in password field valid password credentials
    When user click login button
    Then user should login successfully


  Scenario: Login with invalid username and valid password
    And user should enter in username field invalid username
    And user should enter in password field valid password credentials
    When user click login button
    Then user should not login and user should see error message