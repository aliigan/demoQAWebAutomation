@Forms
  Feature: Forms dropdown test cases

    Background: To access drop-down menus
      When Click to forms button


    @Forms @FillPractiseForm
    Scenario: Fill out the practice form and submit
      Given User is on practise form menu
      When Write first name "Ahmet Ali"
      And Write last name "İĞAN"
      And Select gender
      And Write email "mail@mail.com"
      And Write mobile "5531010101"
      And Select date of birth
      And Select subject "eng"
      And Select all hobbies on the form
      And Upload a picture at this path "C:\Users\ahmet\Downloads\sampleFile.jpeg"
      Then Check if the image is loaded
      When Write current address "Lorem ipsum dolor sit"
      And Select state "Rajasthan"
      And Select city "Jaiselmer"
      And Click submit button
      Then The screen containing the form information should open
      And Click to close button
      Then Return to the practice form screen


    @Forms @FailedPractiseForm
    Scenario: Failed form filling test scenario
      Given User is on practise form menu
      When Write first name "Ahmet Ali"
      And Write last name "İĞAN"
      And Select subject "English"
      And Select all hobbies on the form
      And Upload a picture at this path "C:\Users\ahmet\Downloads\sampleFile.jpeg"
      And Write current address "Lorem ipsum dolor sit"
      And Select state "Rajasthan"
      And Select city "Jaiselmer"
      And Click submit button
      Then Stay on the form screen

