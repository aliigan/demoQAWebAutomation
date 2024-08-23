
Feature: Elements dropdown test cases

  Background: To access drop-down menus
    When Click to elements button
    And Click to text box button

  @TextBox
  Scenario: Create a user
    Given  User is on text box page
    When Write full name as "Ahmet Ali İGAN"
    And Write email as "mail@mail.com"
    And Write current address as "Kağıthane, İstanbul"
    And Write permanent address as "Fethiye, Muğla"
    And Click to submit button
    Then Check if the registration was successful