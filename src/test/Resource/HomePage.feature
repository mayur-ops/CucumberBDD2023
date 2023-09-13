Feature: Home page functionality

  @IndividualSearch
  Scenario: Search for individual product
    Given user is on the home page of argos website
    When user types nike in the search box
    And user clicks on search button
    Then user should be able to see all the nike products

    @MultipleSearch
  Scenario Outline: Search for multiple product
    Given user is on the home page of argos website
    When user search for "<products>"
    Then user should be able to see all product related searched
    Examples:
      | products |
      | nike     |
      | puma     |