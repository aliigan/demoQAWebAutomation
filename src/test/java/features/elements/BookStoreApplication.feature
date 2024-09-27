@Widgets
Feature: Widgets Page Test Cases


  Background: To access drop-down menus
    When Click to book store application button


  @Login @CreateNewUser
  Scenario: Create a new user
#    It may be a failure due to captcha control!!!
    Given User is on login page
    When Click to new user button
    And Write name as "Ahmet Ali"
    And Write last name as "İGAN"
    And Write user name as "userName12344556690"
    And Write password as "Hesoyam34!"
    And Click to captcha verificafation
    And Click to register Button
    And Click the OK button on the successful registration pop-up
    And Click to back to login button
    And Enter userName as "userName12344556690"
    And Enter password as "Hesoyam34!"
    And Click to login button
    Then The user must have successfully logged in "userName12344556690"


  @Login @SuccessLogin
  Scenario: Successful user login
    Given User is on login page
    When Enter userName as "demoQAWebOtomation"
    And Enter password as "demoQAWebOtomation12!"
    And Click to login button
    Then The user must have successfully logged in "demoQAWebOtomation"
    When Click to log out button
    Then User must be on the login page


  @Login @UnsuccessLogin @WrongUserNameOrPassword
  Scenario Outline: Failed login with incorrect users and passwords
    Given User is on login page
    When Enter userName as "<userName>"
    And Enter password as "<password>"
    And Click to login button
    Then "Invalid username or password!" message must be on the login page
    Examples:
      | userName            |      password          |
      | incorrectUser1      |  demoQAWebOtomation12! |
      | demoQAWebOtomation  |   incorrectPassword    |


  @Login @UnsuccessLogin @EmtyUserNameOrPassword
  Scenario Outline: Failed login with emtpy users or passwords
    Given User is on login page
    When Enter userName as "<userName>"
    And Enter password as "<password>"
    And Click to login button
    Then User must be on the login page
    Examples:
      | userName            |      password          |
      |                     |                        |
      |                     |  demoQAWebOtomation12! |
      | demoQAWebOtomation  |                        |
