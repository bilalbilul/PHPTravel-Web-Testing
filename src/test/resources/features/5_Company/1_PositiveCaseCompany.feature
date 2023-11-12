@Automation
Feature: Company

  @CompanyPositiveCase
  Scenario: User want to check Company Blog
    Given User click button Company
    When User Choose Company Blog
    And User already on Company Blogs Page

  Scenario: User want to check Company Docs
    Given User click button Company
    When User Choose Company Docs
    And User already on Company Docs Page

  Scenario: User want to check Company Contact
    Given User click button Company
    When User Choose Company Contact
    And User already on Contact Info Page

  Scenario: User want to check Company Info
    Given User click button Company
    When User Choose Company Info
    And User already on Company Info Page

  Scenario: User want to check Company Teams
    Given User click button Company
    When User Choose Company Team
    And User already on Company Team Page

  Scenario: User want to check Company Jobs
    Given User click button Company
    When User Choose Company Jobs
    And User already on Jobs Page

  Scenario: User want to check Company Partners
    Given User click button Company
    When User Choose Company Partners
    And User already on Company Partners Page

  Scenario: User want to check Media Kit
    Given User click button Company
    When User Choose Media Kit
    And User already on Company Media Page