@Automation
Feature: Subscribe

  @PricingNegativeCase
  Scenario Outline: User Subscribe with invalid parameter
    Given User click button pricing
    And User already on pricing page
    When User choose button subscribe
    And User input "<firstname>" as First Name and "<lastname>" as Last Name and "<email>" as Email
    And User choose button pay with Credit
    And Show pop up message
    Examples:
      | firstname | lastname | email               |
      | oke       |          | mangeak@example.com |
      |           | bro      | mangeak@example.com |
      | oke       | bro      |                     |
      | 123       | bro      | mangeak@example.com |
      | oke       | 123      | mangeak@example.com |
      | oke       | bro      | 123                 |