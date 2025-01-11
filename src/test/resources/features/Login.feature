Feature: Login

  @SmokeTest
  Scenario Outline: Login
    Given User is on Login Page
    When User fill "<username>" and "<password>"
    And User click Login button
    Then User will redirect to Products page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
