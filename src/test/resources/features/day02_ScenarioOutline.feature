@search_scenario @e2e
Feature: Search_Scenario_Outline

  Background: Navigate home page
    Given User is on the "https://www.google.com" home page

  @search_items
  Scenario Outline: TC_search_items
    And user accepts cookies
    And User searches for "<search_item>" on google
    And user switches to iframe
    And user clicks captcha
    Then user verifies page title contains "<search_item>"
    And close the application

    Examples: test_data

      | search_item |
      | iphone      |
      | tesla       |
      | apple       |
      | teapot      |
      | bmw         |