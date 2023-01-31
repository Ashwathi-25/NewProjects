@FunctionalTest
Feature: Sample Application
To test scenarios as we need

@SmokeTest @RegressionTest
Scenario: Successfull Login
Given: This is a blank test

@RegressionTest
Scenario: UnSuccessfull Login
Given: This is a blank test

@SmokeTest
Scenario: Add product to cart
Given: This is a blank test

@SmokeTest @RegressionTest
Scenario: Add multiple products to cart
Given: This is a blank test

@RegressionTest
Scenario: Remove product from cart
Given: This is a blank test

@SmokeTest
Scenario: Remove all products from cart
Given: This is a blank test


Scenario: Product quantity from cart page
Given: This is a blank test

@SmokeTest
Scenario: Decrease product quantity from cart page
Given: This is a blank test

@SmokeTest @E2ETest
Scenario: Buy product with cash payment
Given: This is the blank test

@E2ETest
Scenario: Buy product with CC payment
Given: This is a blank test

@RegressionTest @E2ETest
Scenario Outline: Payment Declined
Given: This is a blank test

Examples:
| Payment method |
| CC |
| DC |
| Net Banking |
| Wallet |


       