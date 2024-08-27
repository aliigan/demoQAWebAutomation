
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
    Then Check that a user record named "Name:Ahmet Ali İGAN" has been created


  @CheckBox
  Scenario: Select check box
    Given User is on check box page
    When Click to home check box
    Then Expected message: "You have selected :"


  @RadioButton
  Scenario: Click radio button
    Given User is on radio button menu
    When Click to yes radio button
    Then Check that the message You have selected Yes appears on the screen


  @WebTables @AddUser @EditUser
  Scenario: Add a new user to the web tables list
    Given User is on web tables menu
    When Click to add button
    Then Check that the registration form is opened
    When Write first name as "Ahmet Ali"
    And Write second name as "İGAN"
    And Write user email as "mail@mail.com"
    And Write age as "29"
    And Write salary as "100000"
    And Write department as "Software Development"
    And Click registration form submit button
    Then Check user: "Ahmet Ali"


  @WebTables @EditUser
  Scenario: Edit a user
    Given User is on web tables menu
    When Search "Cierra"
    And Click to edit button
    And Update email as "mail48@mail.com"
    And Click to submit button
    And Search "mail48@mail.com" from list
    Then Check if the mail is updated to "mail48@mail.com"


  @WebTables @DeleteUser
  Scenario: Delete a user
    Given  User is on web tables menu
    When Search "Alden"
    And Click to delete button
    Then List must be empty


  @WebTables @UnsuccessCreate
  Scenario: Failed user addition
    Given User is on web tables menu
    When Click to add button
    Then Check that the registration form is opened
    When Write first name as "Ahmet"
    And Write user email as "mail@mail.com"
    And Write age as "29"
    And Write salary as "100000"
    And Write department as "Software Development"
    And Click registration form submit button


#  @WebTables @PaginationTest
#  Scenario: Pagination operations forward, backward, page going tests


  @Buttons @DoubleClick
  Scenario: Double click on the button
    Given User is on Buttons menu
    When Double click on the Double Click Me button
    Then The message "You have done a double click" is displayed on the screen


  @Buttons @RightClick
  Scenario: Right click on the button
    Given User is on Buttons menu
    When Right click on the Right Click Me button
    Then The message "You have done a right click" is displayed on the screen


  @Buttons @Click
  Scenario: Click on the button
    Given User is on Buttons menu
    When Left click on the Click Me button
    Then The message "You have done a dynamic click" is displayed on the screen








