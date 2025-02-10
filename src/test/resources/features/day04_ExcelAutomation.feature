@excel  @e2e
Feature: user_creation

  Scenario:  user_creation_test

    #url https://editor.datatables.net
    #sheet user_data
    #workbook data_sheet.xlsx

    Given user navigate to "https://editor.datatables.net" pages and enters "user_data" from "data_sheet.xlsx" excel sheet
    Then  verify user connection
    And close the application