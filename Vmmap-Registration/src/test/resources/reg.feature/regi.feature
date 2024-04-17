Feature: Verify the registration functionality of VM Maps Account

  Scenario: Register User with valid details
    Given User is on VM Maps acoount Sign In page
    When User Clicks Register button
    Then User Enters valid Fullname, Email, mobile number, password and COnfirm password
    And Click I agree button
    And Click Register button
    Then User Should see the Verify Email page

  Scenario: Register User with Already Registered details
    Given User is on VM Maps acoount Sign In page
    When User Clicks Signup button
    Then User Enters Already Registered Fullname, Email, mobile number, password and Confirm password
    And Click I agree button
    And Click Registration button
    Then User Should see the Invalid parameter message

  Scenario: Register User without I Agree button
    Given User is on VM Maps acoount Sign In page
    When User Clicks Register Here button
    Then User Enters  Fullname, Email, mobile number, password and Confirm password
    And Click Orange Register button
    Then User Should see some message

  Scenario: Register User without Enter Mobile Number
    Given User is on VM Maps acoount Sign In page
    When User Clicks Register Here button
    Then User Enters  Fullname, Email, password and Confirm password
    And Click I agree button
    And Click Orange Register button
    Then Still User Should see the Verify Email page
