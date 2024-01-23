Feature: Course Reports functionality

  Background: go to login page
    Given user should go to login page
    And user should login with valid credentials
    Then user should login successfully
    Given user should click Reports button
    Then user should see Reports page

    @courseReports
    Scenario: Verify that user can check Course Reports functionality
      Given user should go to Course Reports page
      When user should click Course Reports button
      Then user should enter to Course Reports page
      And user should see name of courses
      When user click option button
      Then user should enter option page


