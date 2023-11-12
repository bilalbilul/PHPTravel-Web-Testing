@Automation
Feature: Chat

  @ChatNegativeCase
  Scenario Outline: User wants to live chat with invalid parameter
    Given User wants to chat admin
    When User click button Live Chat
    And User click button Chat Now
    And User input "<name>" as Name and "<email>" as Email
    And Click button Start Chat
    Examples:
      | name | email           |
      | oke  | 12131           |
      |      | oke@example.com |
      | oke  |                 |

