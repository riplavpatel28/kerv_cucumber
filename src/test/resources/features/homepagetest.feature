@myHomepage @regression

Feature: HomePage test
  In order to test Homepage
  As a User I should verify different scenarios in Homepage
  @sanity
    Scenario: User should navigate to HomePage
    Given I am on HomePage
    When I mouse hover on  cookies warning
    And  I click on save cookies
    And  I should see right side menu on Homepage
    And  I mouse hover on career tab
    And  I click on all open roles
    Then I should navigate to career page successfully


