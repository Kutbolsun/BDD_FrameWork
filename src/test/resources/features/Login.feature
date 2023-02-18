Feature: Login functionality

  @Smoke
  Scenario: Login with valid credentials
    Given user should go to login page
    And user should enter in username field valid credential
    And user should enter in password field valid password credentials
    When user click login button
    Then user should login successfully

    @Smoke
    Scenario: Login with invalid username and valid password
      Given user should go to login page
      And user should enter in username field invalid username
      And user should enter in password field valid password credentials
      When user click login button
      Then user should not login and user should see error message

