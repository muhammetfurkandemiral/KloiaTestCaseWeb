Feature: Kloia Test Case Web

  Background:
    Given Homepage is open
    When Popup close

  @task1 @regression
  Scenario: Task 1
    Given Verify Page Title with "Best Buy | Official Online Store | Shop Now & Save"
    And Search for "Drone"
    Then Verify search results are listed for "Drone"

  @task2 @regression
  Scenario: Task 2
    Given Go to Sign In page
    And  Fill email
    And  Fill password
    Then Login with Enter button
    And Verify Succesful Login with "Hi, "

  @task3 @regression
  Scenario: Task 3
    Given Go to Sign In page
    And  Sign in with Google
    And Verify Succesful Login with "Hi, "
    Then Open new tab
    And Verify Succesful Login with "Hi, "

  @task4 @regression
  Scenario: Task 4
    Given Click "Wireless Headphones" at "Audio" , "Headphones" under Menu
    And Filter Brands by "Philips" and select
    And Click 2nd product
    And Click Save button
    And Open Saved Items list
    Then Verify that the title of saved product is on the list
