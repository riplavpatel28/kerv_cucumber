@CareerPage @regression
  Feature: Career Page test
    In order to test Career page
  As a user I should verify different scenarios in career page

@smoke
  Scenario: User should navigate to Career Page
  Given I am on career page
  When  I click on see all open roles
  And   I click on search Bar
  And   I enter job Role Test Engineer
  And   I click on search button
  And   I click on Test engineer
  And   I enter firstname "Rupal"
  And   I enter lastname "Patel"
  And   I enter email "irupalpatel99@gmail.com"
  And   I enter phone number "07424471560"
  And   I select resume file
  And   I click on privacy policy checkbox
  And   I click on right to work checkbox
  And   I click on weekly onsite presence checkbox
  And   I click submit button
  Then  I should see application send successfully
