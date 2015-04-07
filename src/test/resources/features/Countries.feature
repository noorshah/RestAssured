Feature: Countries
  Scenario: Countries
    Given I call countries web api
    Then the first country is Afghanistan

  Scenario: Status Code
    Given I call countries web api
    Then  I should see 200 status code