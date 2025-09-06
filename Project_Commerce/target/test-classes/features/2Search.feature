Feature: Product Search on nopCommerce Demo Store

  Scenario Outline: Search for different products on homepage
    Given  navigate to nopCommerce home page
    When  enter "<searchTerm>" in search box
    And  click on search button
    Then The search results page should display results for "<searchTerm>"

    Examples:
      | searchTerm       |
      | laptop           |
      | computer         |
      | phone            |
      | books            |
      | software         |
