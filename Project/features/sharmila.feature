Feature: Avon Cycles

Scenario: Cambio page

Given I am on Avon Cycles HomePage
When I click on Cambio link
And I switch to Cambio website
Then I Verify Cambio URL
When I hover over Bikes
And I click on Best Sellers 
Then I verify Product Categories title 
Then I verify Best Selling Bicycle
When I click on 26T
And I hover over first Product
And I click on Select Options Button
Then I verify 26T title
When I click on Add to Cart
And I click on View Cart
Then I verify Cart Totals
Then I verify Proceed Checkout
Then I verify Fixed Deposit title.


Scenario Outline: New Launch Page

Given I am on Avon Cycles Website HomePage
  When I click on New Launches
  Then I verify New Launch URL
  And I click on Wish List
  And I switch to Login Page
  Then I verify Login Page URL
  And I verify Login Page title
  When I enter "<email>" in the email field
  And I enter "<password>" in the password field
  And I click on Login Button
  Then I verify Login Error
  When I click on Create Account link
  Then I verify register URL
  When I enter "<firstname>" in the first name field
  And I enter "<lastname>" in the last name field
  And I enter "<registeremail>" in the registeremail field
  And I enter "<phone>" in the phone field
  And I enter "<registerpassword>" in the registerpassword field
  And I click on Sign Up button
Examples:
| email            | password | firstname | lastname | registeremail    | phone       | registerpassword |
| Demo@email.com   | Password | Firstname | Lastname | Demo@email.com   | 9876543210  | password         |
