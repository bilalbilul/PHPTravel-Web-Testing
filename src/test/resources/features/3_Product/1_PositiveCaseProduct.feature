@Automation
Feature: Product

  @ProductPositiveCase
  Scenario: User want to check product Integrations
    Given User click button product
    When User Choose Product Integrations
    And User already on Integrations Page

  Scenario: User want to check product Costomization
    Given User click button product
    When User Choose Product Costomization
    And User already on Costomization Page

  Scenario: User want to check product Technology
    Given User click button product
    When User Choose Product Technology
    And User already on Technology Page

  Scenario: User want to check product Requirements
    Given User click button product
    When User Choose Product Requirements
    And User already on Requirements Page