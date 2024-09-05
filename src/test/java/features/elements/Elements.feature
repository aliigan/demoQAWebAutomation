@Elements
Feature: Elements dropdown test cases

  Background: To access drop-down menus
    When Click to elements button
#    And Click to text box button


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


  @WebTables @AddUser
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
    Then Check that the registration form is opened


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


  @Links @LinksToNewTab
  Scenario Outline: Test scenarios for links that open new tabs
    Given User is on Links menu
    When Click to "<link>"
    Then Check if a new tab opens
    Examples:
      | link |
      |//a[@id='simpleLink']|
      |//a[@id='dynamicLink']|


  @Links @LinksSendingApiCall
  Scenario Outline: Test scenarios for links sending API call
    Given User is on Links menu
    When Click to "<link>"
    Then Check if the api message is "<message>"
    Examples:
      | link                    | message |
      |//a[@id='created']       |201      |
      |//a[@id='no-content']    |204      |
      |//a[@id='moved']         |301      |
      |//a[@id='bad-request']   |400      |
      |//a[@id='unauthorized']  |401      |
      |//a[@id='forbidden']     |403      |
      |//a[@id='invalid-url']   |404      |


  @BrokenLinksImages @VerifyValidLink
  Scenario: Verify that the valid link is working
    Given User is on the Broken Links - Images page
    When Click to valid link
    Then Check that the "https://demoqa.com/" link is being accessed


  @BrokenLinksImages @VerifyInvalidLink
  Scenario: Verify that the broken link is not working
    Given User is on the Broken Links - Images page
    When Click to broken link
    Then The error page must be displayed


  @BrokenLinksImages @VerifyValidImage
  Scenario: Verify that the valid image is displayed correctly
    Given User is on the Broken Links - Images page
    Then The valid image should be displayed


  @BrokenLinksImages @VerifyInvalidImage
  Scenario: Verify that the broken image is not displayed
    Given User is on the Broken Links - Images page
    Then The broken image should not be displayed


  @UploadAndDownload @Download
  Scenario: Verify that the download was successful
    Given User is on Upload and Download page
    When Click to download button
    Then The image must be downloaded


  @UploadAndDownload @Upload
  Scenario: Verify that the download was successful
    Given User is on Upload and Download page
    When Click to upload button
    Then The image must be uploaded


  @DynamicProperties @VerifyEnabledButton
  Scenario: Verify that the button is enabled after 5 seconds
    Given User is on the Dynamic Properties page
    Then The Enable After Five Seconds button should be disabled
    When Wait for 5 seconds
    Then The Enable After Five Seconds button should be enabled


  @DynamicProperties @VerifyColorChangeButton
  Scenario: Verify that the button color changes after 5 seconds
    Given User is on the Dynamic Properties page
    Then The Color Change button should have a blue background color
    When Wait for 5 seconds
    Then The Color Change button should change its background color to red


  @DynamicProperties @VerifyBecomesVisibleButton
  Scenario: Verify that the button becomes visible after 5 seconds
    Given User is on the Dynamic Properties page
#    Then The Visible After Five Seconds button should not be visible
    When Wait for 5 seconds
    Then The Visible After Five Seconds button should be visible







