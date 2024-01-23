Feature: Reports functionality


  Background: go to login page
    Given user should go to login page
    And user should login with valid credentials
    Then user should login successfully

    @Reports
    Scenario: Verify that admin can click Reports button
      Given user should click Reports button
      Then user should see Reports page

