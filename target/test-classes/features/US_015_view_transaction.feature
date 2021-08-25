@US_015
Feature: Costumer can view transaction

  Background:
    And click user icon
    And click Sign in
    When user costumer login

    Scenario: see balance
      And click my operations
      And click my accounts
      Then should be able to see balance

  Scenario: see account type
    And click my operations
    And click my accounts
    Then should be able to see account type

    Scenario: see transactions
    And click my operations
    And click my accounts
    And click transaction
    Then see transactions
