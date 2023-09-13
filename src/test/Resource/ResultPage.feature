Feature: ResultPage Functionality

  Background:
    Given user is on the home page of argos website

@ResultPage
    Scenario: Click on £10 - £15 price range
      When user types puma in the search box
      And user clicks on the search button
      And user should be able to see all the puma products
      And user clicks on £10 - £15 price range checkbox
      Then user should able to see all the items within that price range



