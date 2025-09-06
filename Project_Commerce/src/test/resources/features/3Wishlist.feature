Feature: wishlist functionality

  Scenario: Add a product to the wishlist
  And navigate homepage
    When  search for mobile
    And  select the first product from the search results
    And add the product to my wishlist
    Then The product should appear in my wishlist