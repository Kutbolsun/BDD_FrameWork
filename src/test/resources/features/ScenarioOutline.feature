Feature:Scenario Outline examples


  Background: Go to Login page
    Given user should go to login page
  @Outline
  Scenario Outline: Login test
    Given enter in username field "<username>"
    And enter in password field "<password>"
    When user click login button
    Then login not successful
    Examples:
      | username | password     |
      | test123  | Hfsjfksjl    |
      | 123test  | cjkacbjkachj |
      | 55test   | cxjcnkjxc    |
      | 888test  | clmxlkcvl    |
      | 000test  | xvcmxv       |
