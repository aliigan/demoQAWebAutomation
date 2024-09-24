@Widgets
Feature: Widgets Page Test Cases


  Background: To access drop-down menus
    When Click to widgets button


  @Accordian
  Scenario: Verifies whether the titles are expanded or not
    Given User is on Accordian menu
    When Click to What is Lorem Ipsum? title
    Then What is Lorem Ipsum title must be collapsed
    When Click to Where does is come from? title
    Then Where dos is come from? title must be expanded
    When Click to Why do we use it? title
    Then Why do we use it? title must be expanded


  @AutoComplate @FillColorInputs
  Scenario: Color selection using autocomplete
    Given User is on Auto Complate menu
    When Type "bl" and select two item in the autocomplete list
    Then The first color must be selected and displayed in the input
    And The second color must be selected and displayed in the input
    When Type "yel" and select the item in the autocomplete list
    Then The color must be selected and displayed in the input


  @DatePicker @FillDateInput
  Scenario: Write a valid date to input
    Given User is on Date Picker menu
    When Update the date in the select date input with "12/04/1995"
    Then Date "12/04/1995" must be selected


  @DatePicker @SelectDate
  Scenario: Date selection via date picker
    Given User is on Date Picker menu
    When Click to date picker
    And Choose month
    And Choose year
    And Select day
    And Select time
    Then Check that the selected time is "January 15, 2023 10:45 PM"


  @Slider
  Scenario: Move to slider
    Given User is on Slider menu
    When Move the slider 50 pixels
    Then Check if the shift value has changed


  @ProgressBar @StopProgressBar
  Scenario: The progress bar is stopped and the result is observed
    Given User is on Progress Bar menu
    When Click progress bar start button
    And Wait 5 seconds and click to stop button
    Then The progress bar value must be non-zero


  @ProgressBar @ResetProgressBar
  Scenario: Wait until the progress bar is full and reset
    Given User is on Progress Bar menu
    When Click progress bar start button
    And Wait until the progress bar is full and click the reset button
    Then The progress bar value must be zero


  @Tabs
  Scenario: Switch between tabs and inspect content
    Given User is on Tabs menu
    When Click "origin" tab
    Then The text under the origin must be viewable
    When Click "use" tab
    Then The text under the use must be viewable
    When  Click more tab
    Then The text under the use must be viewable


  @ToolTips
  Scenario: Check tooltips for elements on the page
    Given User is on ToolTips menu
    When Hover over the button
    And Hover over the input
    And Hover over the contrary word
    And Hover over the "1.10.32"


  @Menu @MainMenu
  Scenario: Verifying the visibility of main menu elements
    Given User is on Menu Menu
    When Hover over "Main Item 1" and verify that it is visible
    And Hover over "Main Item 2" and verify that it is visible
    And Hover over "Main Item 3" and verify that it is visible


  @Menu @SubMenu
  Scenario: Verifying the visibility of main menu elements
    Given User is on Menu Menu
    When Hover over Sub Item One and verify that it is visible
    And Hover over Sub Item Two and verify that it is visible


  @Menu @ThirdLevelMenu
  Scenario: Verify that submenus can be opened up to the third level
    Given User is on Menu Menu
    When Hover over Sub Sub Item One and verify that is visible
    And Hover over Sub Sub Item Two and verify that is visible


  @Menu @VerifyMenusClickable
  Scenario: Verify that menus are clickable
    Given User is on Menu Menu
    When Click "Main Item 1"
    Then The redirect url must be "x"
    When Click "Main Item 2"
    Then The redirect url must be "x"
    When Click "Main Item 3"
    Then The redirect url must be "x"
    When Click to Sub Item One
    Then The redirect url must be "x"
    When Click to Sub Item Two
    Then The redirect url must be "x"
    When Click to Sub List
    Then The redirect url must be "x"


  @SelectMenu
  Scenario: Select menu test scenario
    Given User is on Select Menu
    When Select value
    Then Value must be selected
    When Select title
    Then Title must be selected
    When Select color
    Then Color must be selected
    And Select multiple color
    Then Two color must be selected
    When Select brand
    Then Brand must be selected














