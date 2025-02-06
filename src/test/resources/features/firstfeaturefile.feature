
Feature: Google_search_feature

  Scenario: TC_001_iphone_search
    Given user is on the google home page
    And user accepts cookies
    And user search for Iphone
    And user switches to iframe
    And user clicks captcha
    Then verify the result contain Iphone
  @tea_pot
  Scenario: TC_002_tea_pot_search
    Given user is on the google home page
    And user searches for tea pot
    Then verify the result contains tea pot

  @book_search
  Scenario: TC_003_book_search
    Given user is on the google home page
    And user searches for book
    Then verify the result contains book

# FEATURE FILE ******************************

#All feature files have .feature extensions
#Feature files are written in GHERKIN language.....
#Feature files are used to create test scenarios/ testcase
#All feature files must begin with Feature: keyword...
#Scenario keyword is used to create test cases/scenarios
#One feature file can have more than scenario keyword.....
#Each step must begin with Gherkin keyword (Given, And, When, Then, But)