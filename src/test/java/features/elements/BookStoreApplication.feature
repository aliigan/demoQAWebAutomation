@BookStoreApp
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


  @BookStore @LoginAndSearch
  Scenario Outline: Log in, search by title, author and publisher
    Given User is on book store page
    When Click login button
    Then User must be on the login page
    When Enter userName as "demoQAWebOtomation"
    And Enter password as "demoQAWebOtomation12!"
    And Click to login button
    Then User must be on the book store page
    When Type "<searchObject>" in the search box and search
    And Click first element from list
    Then The redirected url must be "<url>"
    Examples:
      | searchObject            |                  url                        |
      | Addy Osmani             | https://demoqa.com/books?book=9781449331818 |
      | Speaking                | https://demoqa.com/books?book=9781449365035 |
      | O'Reilly Media          | https://demoqa.com/books?book=9781449325862 |


    @BookStore @Pagination
    Scenario: Book store page pagination test case
      Given User is on book store page
      When Select five rows
      Then User must be on the page "1"
      When Click to next button
      Then User must be on the page "2"
      When Click to previous button
      Then User must be on the page "1"


    @BookStore @SortBooks
    Scenario Outline: Sorting by image, title, author and publisher
      Given User is on book store page
      When Click to "<column>" column
      Then The author of the first book listed must be "<author>"
      When Click to "<column2>" column
      Then The author of the first book listed must be "<author2>"

      Examples:
        | column    |       author         | column2   |       author2         |
        | Image     | Richard E. Silverman | Image     |  Nicholas C. Zakas    |
        | Title     | Richard E. Silverman | Title     |  Nicholas C. Zakas    |
        | Author    | Addy Osmani          |  Author   |  Richard E. Silverman |
        | Publisher | Marijn Haverbeke     | Publisher |  Eric Elliott      |


    @Profile @DeleteAllBooks
    Scenario: Failed book deletion
      Given User is on profile menu
      When Click to login word
      Then User must be on the login page
      When Enter userName as "demoQAWebOtomation"
      And Enter password as "demoQAWebOtomation12!"
      And Click to login button
      Then User must be on the profile menu
      When Click to delete all books button
      And Click to cancel at pop up that appears
      Then User must be on the profile menu
      When Click to delete all books button
      And Click yes at pop up that appears
      And Click ok at pop up that appears
#      Then User must be on the profile menu


    @Profile @GoToBookStore
    Scenario: Login and go to book store on profile menu
      Given User is on profile menu
      When Click to login word
      Then User must be on the login page
      When Enter userName as "demoQAWebOtomation"
      And Enter password as "demoQAWebOtomation12!"
      And Click to login button
      Then User must be on the profile menu
      When Click go to book store button
      Then Current address must be "https://demoqa.com/books"
      When Click first element from list
      Then Current address must be "https://demoqa.com/books?book=9781449325862"


  @Profile @DeleteAccount
  Scenario: Delete user account
    Given User is on profile menu
    When Click to login word
    Then User must be on the login page
#    aktif bir kullanıcı adı - şifre gerekli
    When Enter userName as "userName123"
    And Enter password as "Hesoyam34!"
    And Click to login button
    Then User must be on the profile menu
    When Click to delete account button
    And Click cancel on the alert message
    Then User must be on the profile menu
    When Click to delete account button
    And Click yes at pop up that appears
    And Click ok at pop up that appears
    Then User must be on the login page


#    userName123
#    userName1234
#    userName12345













