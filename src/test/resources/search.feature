# new feature
# Tags: optional

Feature: Verify the search feature

  @search
  Scenario: Search bar should appear in Home page
    Given  User is on home page
    Then Search Bar should appear
    And Base text in search bar should be What can we help you find today?
    Then Popular searches should appear on search bar click
    And User closed the browser

  @search
  Scenario Outline: Product results should appear on search
    Given  User is on home page
    Then Search Bar should appear
    And User Enters <Product> in search bar
    Then  Search results should appear
    And Total number of result <Totalresults> should appear
    Examples:
      |  Product              |    Totalresults     |
      |  stud finder          |       10            |
      |  Egg chair            |        5            |

  @search
  Scenario: User should be able to select item from flyout
    Given  User is on home page
    Then Search Bar should appear
    Then Popular searches should appear on search bar click
    When User select item from flyout
    And  Product description should display