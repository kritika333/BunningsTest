# new feature
# Tags: optional

Feature: Verify the search feature


  Scenario: Search bar should appear in Home page
    Given Search functionality should be tested
    When User lands to home page
    Then Search Bar should appear
    And Base text in search bar should be What can we help you find today?
    Then User should be able to enter text in search bar

  @kritika
  Scenario Outline: Product results should appear on search
    Given Search functionality should be tested
    When User lands to home page
    Then Search Bar should appear
    And User Enters <Product> in search bar
    Then  Search results should appear
    And Total number of result <Totalresults> should appear
    Examples:
    |  Product              |    Totalresults     |
    |  stud finder          |       10            |
    |  Egg chair            |        5            |
