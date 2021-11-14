# new feature
# Tags: optional

Feature: Verify the search feature

  Scenario: Search bar should appear in Home page
    Given Search functionality should be tested
    Then User lands to home page
    Then Search Bar should appear
    And Base text in search bar should be What can we help you find today?
    Then User should be able to enter text in search bar