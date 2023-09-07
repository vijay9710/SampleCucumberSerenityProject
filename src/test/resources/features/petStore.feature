Feature: Provides the statuses of all Pets in the store.

  Scenario Outline: verify GET for details of pets based on their "<status>"
    Given User GETs details of pets with status: "<status>"
    Then verify status code is "200"
    Examples:
      | status    |
      | available |
      | sold      |
      | pending   |