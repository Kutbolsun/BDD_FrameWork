Feature: Data Table functionality


#  Background: Login
#    Given user should go to login page
#    And user should login with valid credentials
#    Then user should login successfully
#    And user click on Add user button
#    Then user should land to create new user page

    @table
    Scenario: Verify that admin can create new user in the system
      Given create new user with following data
      |firstname|lastname|email|username|password|bio|
      |John2|Doe2|johndoe@gmail.com2|john2|test123!12|Bio test 133|
      |John3|Doe3|johndoe@gmail.com3|john3|test123!13|Bio test 143|
      |John4|Doe4|johndoe@gmail.com4|john4|test123!14|Bio test 153|
      |John5|Doe5|johndoe@gmail.com5|john5|test123!15|Bio test 163|

