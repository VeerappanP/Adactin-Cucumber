Feature: Adactin login Functionality
     

  Scenario: Login with valid user name and Password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as "vv0472191"
    And user enter password as "Password@098123"
    When user click the login button
    Then user should navigate to the search hotel module

  Scenario: Login with valid user name and invalid password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as "vv0472191"
    And user enter password as "Password@0"
    When user click the login button
    But user should not navigate to the search hotel module

  Scenario: Login with invalid user name and valid password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as "vv04721"
    And user enter password as "Password@098123"
    When user click the login button
    But user should not navigate to the search hotel module

  Scenario: Login with invalid user name and invalid password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as "vv0472"
    And user enter password as "Password@0"
    When user click the login button
    But user should not navigate to the search hotel module

  Scenario: Login with empty user name and password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as ""
    And user enter password as ""
    When user click the login button
    But user must see enter user name error message

  Scenario: Login with user name and empty password
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as "vv0472191"
    And user enter password as ""
    When user click the login button
    But user must see enter password error message

  Scenario: Login with password and empty user name
    Given user should launch the browser
    And user should navigate to the url "https://adactinhotelapp.com/index.php"
    And user enter user name as ""
    And user enter password as "Password@098123"
    When user click the login button
    But user must see enter user name error message
