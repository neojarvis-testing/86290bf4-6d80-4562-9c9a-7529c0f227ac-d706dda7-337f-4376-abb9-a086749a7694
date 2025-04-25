Feature: Avoncycles Functionality 
Scenario Outline: Fill checkout details and confirm order
Given I am on Avoncycle homepage
When I click on search icon
And I click on the search bar
And I input "<value>" in search
And I click on the first product
And I click on buynow
And I enter "<FirstName>" in the First Name field
And I enter "<LastName>" in the Last Name field
And I enter "<Email>" in the Email field
And I enter "<Phone>" in the Phone field
And I enter "<PostCode>" in the Post Code field
And I enter "<State>" in the State field
And I enter "<City>" in the City field
And I enter "<Address>" in the Address field
And I enter "<Coupon>" in the Coupon field
And I click on Apply
And I click on Razorpay 
Then User clicks Confirmcheckout button

 Examples:
   |value | FirstName     | LastName     | Email           | Phone      | PostCode | State | City | Address | Coupon |
   |gear  | firstname     | lastname     | demo@email.com  | 9876543210 | 100001   | XYZ   | ABC  | 123 St  | demo   |



Scenario Outline: User navigates through Avon Fitness Machines and submits an enquiry
Given I landed on Avoncycles website
When I click on Avon Fitness Machines
And I verify Avon Fitness Machines page URL
And I handle the pop-up and close the form
And I hover over Domestic Gym
And I hover over Cardio Line
And I click on Treadmills
And I click on first product
And I click Enquire Now
And I enter "<Name>" in the Name field
And I enter "<Email>" in Email field
And I enter "<Phone>" in the Phone Number field
And I enter "<City>" in City field
And I click Submit
Then I capture a screenshot

  Examples:
    | Name  | Email           | Phone      | City  |
    | name  | demo@email.com  | 9876543210 | ABC   |
