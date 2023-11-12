@Automation
Feature: Demo Request Form

  @DemoNegativeCase
  Scenario Outline: User submits demo request form with invalid parameter
    Given User click button demo
    And User already on demo page
    When User input "<firstname>" as First Name and "<lastname>" as Last Name and "<company>" as Company and "<email>" as Email
    And User input number for captcha
    And Click submit button
    And Failed send form
    Examples:
      | firstname | lastname | company | email           |
      | 123       | sulit    | chaks   | jajal@yahoo.com |
      | sulit     | 321      | bro     | jajal@yahoo.com |
      | sulit     | banget   | chaks   | jajal           |
      | sulit     | banget   |         | jajal@yahoo.com |

  Scenario Outline: User submits demo request form with invalid captcha
    Given User click button demo
    And User already on demo page
    When User input "<firstname>" as First Name and "<lastname>" as Last Name and "<company>" as Company and "<email>" as Email
    And User input invalid number for captcha "<number>"
    And Click submit button
    And Failed send form
    Examples:
      | number |
      | 100    |
      | oke    |
      |        |