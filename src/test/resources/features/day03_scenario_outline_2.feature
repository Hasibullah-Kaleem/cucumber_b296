
@dataFeature
Feature: Data Tables Feature


  @data_table
  Scenario Outline: User Creation

    Given User navigates to "https://editor.datatables.net"
    And user click new button
    And user enters firstname as "<first_name>"
    And user enters lastname as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start_date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on the create button
    And user enters first name as "<first_name>" into the search box
    Then verify the name fields contains first name as "<first_name>"
    And close the application








    Examples:
      | first_name | last_name | position | office | extension | start_date | salary |
      | Melik      | White     | musician | LA     | 200       | 2024-02-01 | 2000   |
      |            | White     | actor    | Texas  | 100       | 2020-01-01 | 2000   |
      | Hasib      | Cruise    | actor    | Miami  | 300       | 2020-01-02 | 3000   |
      | Tommy      | Shelby    | actor    | Texas  | 400       | 2020-01-01 | 2000   |
      | Ronaldo    | Brezil    | player   | Texas  | 500       | 2020-01-01 | 2000   |
      | Lionel     | Messi     | player   | Texas  | 500       | 2020-01-01 | 2000   |
      | Zidane     | Zidane    | actor    | Texas  | 201       | 2020-01-01 | 2000   |
      | Kaleem     | Hardy     | actor    | Texas  | 201       | 2020-01-01 | 2000   |
      | Angelina   | Jolie     | actor    | Texas  | 401       | 2020-01-01 | 2000   |
      | Hasan      | Kas       | actor    | Texas  | 302       | 2020-01-01 | 2000   |