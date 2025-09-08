Feature: to check Book functionality
Scenario: Book functioonality of ecommerce website
Given it should open in webbrowser 
And enter logindetails "<user>" and "<pass>"
And click on sign 

When Search as "Apple iPhone 16 128GB"

And click on add to cart 
And go to shopping cart 
And click on proceed with terms
And check out 
And go on with continue
Then  confirm order and continue
Examples:
|user                 |pass |
|mahi879082@gmail.com |8919215039@Mk|
 

