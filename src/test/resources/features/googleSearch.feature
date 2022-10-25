@Smoke
Feature: Google search functionality
  User story: As a user, when I am on the google search page, I should be able to search whatever I want and see relevant information
  
  @wip
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple in the Google search box and clicks enter
    Then user ses apple - Google Search is in the Google title