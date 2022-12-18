Feature: Adactin login

  Background: 
    Given user should launch the browser
    And user should navigate to the "https://adactinhotelapp.com/index.php"

  Scenario Outline: Login with different data
    And user enter user name as "<userName>"
    And user enter the password as "<password>"
    When user click login button
    Then user should navigate to the search hotel module

    Examples: 
      | userName      | password        |
      | vv0472191     | Password@098123 |
      | kumar123098   | Kumar@123098    |
      | balu123098    | Balu123098      |
      | vignesh123098 | Vignesh123098   |
