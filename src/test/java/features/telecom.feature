Feature: Telecom Project
  As a new customer
  I want to add customer details
  So that I can get a customer ID

  Scenario Outline: Add new customer
    Given I navigate to the Telecom Add Customer page
    When I enter customer details "<fname>" "<lname>" "<email>" "<address>" "<phone>"
    And I submit the form
    Then I should see a customer ID generated

    Examples:
      | fname | lname | email              | address    | phone     |
      | John  | Doe   | john@test.com      | New Delhi  | 9876543210|
      | Mary  | Smith | mary.smith@test.io | Bangalore  | 9123456789|
