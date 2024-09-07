@AlertsFrameWindows
Feature: Alerst, Frame and Windows Page Test Cases


  Background: To access drop-down menus
    When Click to alerts, frame and windows button


  @BrowserWindows @OpenNewTab
  Scenario: Open new tab
    Given User is on Browser Windows menu
    When Click to open new tab button
    Then A new tab must be open


  @BrowserWindows @OpenNewWindow
  Scenario: Open new window
    Given User is on Browser Windows menu
    When Click to open new window button
    Then A new window must be open


  @BrowserWindows @OpenNewWindowMessage
  Scenario: Open new window message
    Given User is on Browser Windows menu
    When Click to open new window message button
    Then A new window message must be open


  @Alerts @OpenAlertMessage
  Scenario: Open alert message
    Given User is on Alert menu
    When Click to alert button
#    Then Alert message must be open
    When Click to ok button
    Then User must be on alert page


  @Alerts @TimedAlert
  Scenario: Alert message popping up after 5 seconds test scenario
    Given User is on Alert menu
    When Click to timed alert button
#    Then The alert message must be pop up after 5 seconds
    When Click to ok button at timed alert
    Then User must be on alert page


  @Alerts @ConfirmMessage
  Scenario: Confirm message at the alert
    Given User is on Alert menu
    When Click to confirm alert button
    And Click ok on the alert message
    Then Verify that the ok button was clicked


  @Alerts @CancelMessage
  Scenario: Click cancel on the alert
    Given User is on Alert menu
    When Click to confirm alert button
    And Click cancel on the alert message
    Then Verify that the cancel button was clicked


  @Alerts @PromtBoxButton
  Scenario: Promt box test case
    Given User is on Alert menu
    When Click to promt box alert button
    And Write "Ahmet Ali İĞAN" to the promt box
    And Click ok on the promt box alert
    Then Check that writing "You entered Ahmet Ali İĞAN" was successful


  @Frames @CompareFrames
  Scenario: Verify text inside frames
    Given User is on Frames menu
    When Switch to "frame1" and get the text
    Then Text must be This is a sample page in first frame
    When Switch to "frame2" and get the text
    Then Text must be This is a sample page in second frame


  @NestedFrames @SwitchFrames
  Scenario: Switch between frames
    Given User is on Nested Frames menu
    When Switch to parent frame
    Then Frame name must be "Parent frame"
    When Switch to child frame
    Then Frame name must be "Child Iframe"


  @ModalDialogs @SmallModal
  Scenario: Verify that the small modal is opened
    Given  User is on Modal Dialogs menu
    When Click to small modal button
    Then Small modal must be open
    When Click to close button for "small modal"
    Then Modal dialogs page must be displayed


  @ModalDialogs @LargeModal
  Scenario: Verify that the large modal is opened
    Given  User is on Modal Dialogs menu
    When Click to large modal button
    Then Large modal must be open
    When Click to close button for "large modal"
    Then Modal dialogs page must be displayed





