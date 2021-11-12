Feature: Login Page Feature for PayLink Solutions Website

  Scenario Outline: Valid login
    Given the user navigates to the website
    When the user enters a valid username "<username>"
    And the user enters a valid password "<password>"
    And clicks the sign in button
    Then the user is logged in successfully

    Examples:
    | username            | password     |
    | desolakin@gmail.com | Yetunde_4    |
    | 07481343414         | Yetunde_3    |