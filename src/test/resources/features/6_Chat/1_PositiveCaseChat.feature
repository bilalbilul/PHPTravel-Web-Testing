@Automation
Feature: Chat

  @ChatPositiveCase
  Scenario: User normal live chat
    Given User wants to chat admin
    When User click button Live Chat
    And User click button Chat Now
    And User input "oke" as Name and "aja@example.com" as Email
    And Click button Start Chat
    And User ready to chat

  Scenario: User normal Whatsapp chat
    Given User wants to chat admin
    When User click button Whatsapp Chat
    And User move to Whatsapp Page
