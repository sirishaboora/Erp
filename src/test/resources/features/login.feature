Feature: login and logout

  @tc-1
  Scenario: Open login page and do logout
    Given navigate to "http://stage.survey.hff.ukkoteknik.com/admin/"
    Then enter userid with "admin@gmail.com"
    Then enter password with "1111"
    And click on login button
    Then click on logout
    Then click on ok

  @tc-2
  Scenario Outline: validate login fields
    Given navigate to "http://stage.survey.hff.ukkoteknik.com/admin/"
    Then enter userid with "<x>"
    Then enter password with "<y>"
    And click on login button
    Then validate userid and password fields with "<z>"
    

    Examples: 
      | x               | y    | z             |
      |                 |      | blank         |
      | admin@gmail.com |      | blankpwd      |
      |                 | 1111 | blankuserid   |
      | admin@gmail.com | 2222 | invalidpwd    |
      | admi@gmail.com  | 1111 | invaliduserid |
      | admin@gmail.com | 1111 | valid         |
      
      
  @tc-3
  Scenario: Open login page and do logout
    Given navigate to "http://stage.survey.hff.ukkoteknik.com/admin/"
    Then enter userid with "admin@gmail.com"
    Then enter password with "1111"
    And click on login button
    Then click on city submodule
