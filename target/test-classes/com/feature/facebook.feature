

Feature: Facebook login
 I want Login fb deatials

  @TC1012
  Scenario: Fb_Login
    Given User Launch Browser
    And User Lanuch Url Link
    Given User Click On Singup Of Fbaccount
    And User Enter First Name
    When User Enter Last Name
    And User Enter Mobilenumber 
    And User Enter New password
    And User Enter Data DOB
    And User Enter Month DOB
    And User Enter Year DOB
    And User Enter Gender
    Then  User Enter Singup

@Tc1234
    Scenario: FB_Post
    Given User Launch Browser
    And User Lanuch Url Link
    And User Enter User Name
    And User Enter Password
    And User Renter your password
    Given Click on Home button 
    Given Click on Post Filed
    Given User Enter Fb Post Filed
    Then User Finally Post
@Tc567
Scenario Outline: User Login fb account
  Given User Launch Browser
  And User Lanuch Url Link
  And User Enter  Name "<username>" 
  And User Enter  pass "<password>"
  And Enter Click Button
  Examples:
    |username|password|
    |yuva|1234|
    |ganesh|12345|
    |Java Selenium|Java@1234|
  
 