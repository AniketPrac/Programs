Feature: place the order for products

@Checkoutpage
Scenario Outline: Search experence for product search in both home and offers page
Given User is on greencart landing page 
When User is search with shortname <name> and extract actual name of product
And Added "3" items of selected product to cart
Then User proceed to checkout and validate the <name> items in checkout page
And Verify user has ability to enter promo code and place the order

Examples:
|name|
|Tom|



