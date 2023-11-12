@Demo
Feature: Demo Request Form

  @DemoPositiveCase
  Scenario: User success submits demo request form
    Given User click button demo
    And User already on demo page
    When User input "Bilal" as First Name and "Tampan" as Last Name and "Prambose" as Company and "klotak@yahoo.com" as Email
    And User input number for captcha
    And Click submit button
    And Success send form