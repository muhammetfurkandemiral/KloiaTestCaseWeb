Feature: GittiGidiyor BDD Testing
  Background:
    Given Close Cookie

   Scenario: Search Product
   Given I search "laptop"
   Then I click search button
   And Validate search result "laptop"
   And Go to Search Page "3"
   And Validate Search Page "3"
   Then Choose any Product
   And Add to Cart
   Then Go to My Cart
   And If exist Add "2" Amount
   And Delete Product
   And Validate Cart Empty with "Sepetinizde ürün bulunmamaktadır."
   Then Go back Home Page



