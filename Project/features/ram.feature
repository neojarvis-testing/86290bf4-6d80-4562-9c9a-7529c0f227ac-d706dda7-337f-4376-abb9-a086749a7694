Feature: Verify Various Actions on Avon Cycles Website

 Scenario Outline: Verify Various Actions on Home Page
 Given the user is on the home page of the website 
    When the user hovers over Bicycle
    When the user clicks on Electric Bike
    When the user clicks on the Price 
    When the user clicks on the Review 
    When the user clicks on the  First Review
    And the user clicks on the Size 
    And the user clicks on First Size
    And the user clicks on Height 
    And the user clicks on First Height
    And the user clicks on Color
    And the user clicks on Filter
    And the user clicks on Categories
    And the user clicks on Bicycle Category
    Then I verify the "<Bicycle Categories>"

    Examples:
        |Bicycle Categories|
        |Bicycle Category| 
    Scenario: Verify the Actions on Footer
        Given The user is on the homepage of the website
        When I click on Accolodes 
        Then  I verify the Accolodes "<Awards>" 
        And I click on Accept Cookies
        And I click on Blogs 
        Then I verify the blog "<Blogs>" 
        And I click on Warranty 
        Then I verify the warranty "<WarrantyPolicy>" 
        And I click on Terms 
        Then I verify the conditions "<Terms>" 
        And I click on Dealer 
        Then I verify the Store  "<StoreLocator>" 
        Then I verify the Shop  "<Dealer>" 
        And I click the State 
        Then I click the City

            Examples:
                |Awards|                              |Blogs|                              |WarrantyPolicy|                               |Terms|                                     |StoreLocator|                                |Dealer|
                |https://avoncycles.com/awards/|      |https://avoncycles.com/blog/|       |https://avoncycles.com/warranty-policy/|      |https://avoncycles.com/termcondition/|     |https://avoncycles.com/storelocater|        |Dealer Locator|

   



           
           
            