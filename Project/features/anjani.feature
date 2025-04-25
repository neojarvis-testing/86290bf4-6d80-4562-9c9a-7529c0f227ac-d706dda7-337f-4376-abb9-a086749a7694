Feature: Avon Cycles Functionality
Scenario Outline: Functionality of Avon Cycles
Given I open the website 
When I click on Internatioanl Business
And I verify Page URL "<expected_url>"
And I verify the text "<certifications_text>" is displayed
And I input the value "<email>" in the Email ID field
Then I verify the Email ID label is displayed
And I verify the Ph.No label is displayed
And I input the value "<phone_number>" in the phone number field
Then I verify the Country label is displayed
And I input the value "<country>" in the country field
Then I verify the Company label is displayed
And I input the value "<company>" in the Company Name field
Then I verify the Address label is displayed
And I input the value "<address>" in the Address field
Then I verify the Subject label is displayed
And I input the value "<subject>" in the Subject field
And I input the value "<message>" in the Your Message field
Then I click on the Send button

Examples:
    |expected_url                                 | certifications_text | email            | phone_number | country | company  | address  | subject | message  |
    |https://avoncycles.com/international-business| Certifications      | demo@email.com   | 9876543210   | Country | Company  | Address  | Subject | message  |



Scenario: Verify functionality of the footer and product page
    Given I open the website Avon Cycles 
    When I verify the label "Cycle's By Brand"
    When I click on the Cyclux link in the footer
    Then I verify that the page redirects to the expected URL "https://avoncycles.com/brand/cyclux.html"
    When I click on the Avon link
    Then I verify the page redirects to the expected URL "https://avoncycles.com/brand/avon.html"
    When I click on REVIEW
    And I click on the first option in the review section
    And I click on SIZE
    And I click on the first option in the size section
    And I click on Color Swatches
    And I click on Clear Filters
    When I click on Sort
    And I click on the first sort option
    And I click on the first product
    Then I verify the "Add to Cart" functionality

  


