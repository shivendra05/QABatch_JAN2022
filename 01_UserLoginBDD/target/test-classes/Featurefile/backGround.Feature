Feature: User Login

  Background: Login Details
    Given enter url
    And Enter UserName and Password
    Then click on submit button

  Scenario: Get page titles
    Then print title
    And close browser

  Scenario: Validate Error msg
    Then validate error msg
    And close browser

  Scenario: Validate Error msg then Sign UP
    Then click on signUp Button
    And close browser


