Feature: Validate Avon Cycles Website Functionality

Scenario Outline: Verify product selection, sorting, and checkout process

  Given I launch the Avon Cycles Website 
  When I hover on cycleBrandCategory
  And I click on cycleBrand
  Then I verify "<cycleBrand>" label is displayed
  When I click on sortButton
  And I select Price ascending
  And I click on compare
  And I click on cartIcon
  And I click on increaseQuantity
  When I click on deleteIcon
  Then An alert pop-up appears
  And I handle alerts and click dismiss
  When I click on checkoutButton
  Then I verify the page redirects to "<checkoutURL>"
  And I verify the SeletctAdress "<selectAddressText>"
  And I verify the PriceDetail "<priceDetailText>"
  And I verify the SelectPaymentMethod "<selectPaymentMethodText>"
  And I verify the "<backToCartButton>"
  Then I capture the screenshot

Examples:
  |  cycleBrand |  checkoutURL                           | selectAddressText | priceDetailText | selectPaymentMethodText | backToCartButton |
  |  Avon       |   https://avoncycles.com/checkout.html | Select Address    | Price Details    | Select Payment Method   | BACK TO CART     |

@hell
Scenario Outline: Verify navigation and key interactions on Avon Cycles website
  Given I am on the Avon Cycles Website
  When I click on About Us in the footer under 
  And I click on Read More under 
  Then I navigate back to Home page
  When I click on Production in the footer under companySection
  Then I verify the title "<productionTitle>" is available
  When I click on Career in the footer under companySection
  And I click on APPLY NOW button
  Then I verify "<uploadJobProfileForm>" form is available
  When I click on Life at AVON in the footer under companySection
  Then I verify the Life at Avon "<lifeAtAvonTitle>" is available
  When I click on Corporate in the footer under companySection
  And I click on the image above annualReports
  And I verify the URL "<annualReportsURL>"
  And I capture the screenshot and attach it to the report with filename "<screenshotFilename>"

Examples:
  | productionTitle | uploadJobProfileForm | lifeAtAvonTitle | annualReportsURL                                | screenshotFilename |
  | Production      | Upload Your Job Profile   | Life At AVON    | https://avoncycles.com/corporate/annual-reports | annual_reports    |

