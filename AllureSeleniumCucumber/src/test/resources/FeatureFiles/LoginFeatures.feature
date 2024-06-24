Feature: Login Functionality

  Scenario Outline: Successful login with valid credentials
    Given User is on Login page
    When User enters valid "<username>" and "<password>"
    Then User is navigated to the Home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
