Feature: Amazon Search

@Smoke
Scenario: Search a Product MackBook air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 200
Then Product with name "Apple MacBook Pro" should be displayed

@Regression
Scenario: Search a Product Iphone
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 1200
Then Product with name "Iphone" should be displayed