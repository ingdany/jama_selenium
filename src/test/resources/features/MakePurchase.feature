Feature: MakePurchase

  @SmokeTest
  Scenario: Add Product to the Cart
    Given User is in Product Page
    When Select a Product
    And Click the Shopping Cart Icon
    Then User will redirect to Your Cart Page

  @SmokeTest
  Scenario: Complete the Purchase
    Given You have an item in the Cart
    When Click the Checkout Button
    And Fill the User Information
    And Click the Continue Button
    Then Will Complete the Order