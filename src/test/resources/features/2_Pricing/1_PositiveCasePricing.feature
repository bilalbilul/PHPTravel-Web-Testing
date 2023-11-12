@Automation
Feature: Subscribe

  @PricingPositiveCase
  Scenario: User normal Subscribe with Credit Card
    Given User click button pricing
    And User already on pricing page
    When User choose button subscribe
    And User input "oke" as First Name and "aja" as Last Name and "okebanget@example.com" as Email
    And User choose button pay with Credit
    And User go to payment page

  Scenario: User normal Subscribe with Paypal
    Given User click button pricing
    And User already on pricing page
    When User choose button subscribe
    And User input "oke" as First Name and "aja" as Last Name and "okebanget@example.com" as Email
    And User choose button pay with Paypal
    And User procces to paypal page

  Scenario: User normal Subscribe with Bank Transfer
    Given User click button pricing
    And User already on pricing page
    When User choose button subscribe
    And User input "oke" as First Name and "aja" as Last Name and "okebanget@example.com" as Email
    And User choose button pay with Bank Wire Transfer
    And Show Bank Transfer Account