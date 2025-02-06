


@parametrizing
Feature: search_future

  Background: Navigate home page
    Given User is on the "https://www.google.com" home page

  @pr_iphone
  Scenario: TC_001_iphone_search
    And User searches for "iPhone" on google
    Then user verifies page title contains "Iphone"
    And close the application


  @pr_tesla
  Scenario: TC_002_Tesla_search
    And User searches for "Tesla" on google
    Then user verifies page title contains "Tesla"
    And close the application




  @pr_teapot
  Scenario: TC_003_teapot_search
    And User searches for "teapot" on google
    Then user verifies page title contains "teapot"
    And close the application