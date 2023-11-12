@Automation
Feature: Feature Page

  @SosmedPositiveCase
  Scenario: User want to check Facebook
    Given User wants to check social media account
    When User Click Facebook button
    And User already on Facebook Page

  Scenario: User want to check Twitter
    Given User wants to check social media account
    When User Click Twitter button
    And User already on Twitter Page

  Scenario: User want to check Linkedin
    Given User wants to check social media account
    When User Click Linkedin button
    And User already on Linkedin Page

  Scenario: User want to check Youtube
    Given User wants to check social media account
    When User Click Youtube button
    And User already on Youtube Page

  Scenario: User want to check Instagram
    Given User wants to check social media account
    When User Click Instagram button
    And User already on Instagram Page

  Scenario: User want to join subscribe with send email
    Given User wants to check social media account
    When User wants to join subscribe for email "bubu@example.com"
    And User click button join subscribe