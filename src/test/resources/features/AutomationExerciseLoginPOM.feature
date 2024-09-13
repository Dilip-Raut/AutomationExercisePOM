Feature: Gettin Details of Products

  Background: 
    Given User is on AutomationExercise page "https://www.automationexercise.com/"

  Scenario Outline: Validation About Products and other Details
    When User click on sign in button
    When User entered username as "<username>" and Email as "<email>"
    And User click on SignUp button
    Then User Enter Account Information
    And User click on Create Account button
    Then User Fetching the feature Items Details
  #  And User is logout from Application
    And User is Delete Account from Application

    Examples: 
      | username | email           |
      | Vinay112222 | abcdefghr@gmail.com |
