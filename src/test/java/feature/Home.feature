Feature: Home Functionality

  Scenario: user click sign in
    Given user navigates to home page
    When user click on sign in button
    Then user should navigates to sign in page

  Scenario: user click skip sign in
    Given user navigates to home page
    When user click on skip sign button
    Then user should navigates to register page

  Scenario: user enter valid email id for sign up
    Given user navigates to home page
    When user enter valid mail id into maid id field
    |mailid| akshayadevi@yopmail.com |
    And user click on enter
    Then user should navigates to register page


