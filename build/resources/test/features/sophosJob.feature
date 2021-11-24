# Actor: Maria

@stories
Feature: Add Course

  @scenario1
  Scenario Outline: Sophos jobs platform

    Given Maria wants to know about the job offers on the Sophos page

    When she search for available offers of <type>

    Then print the offers available

    Examples:
      | type      |
      | Java      |
      | Scala     |
      | Seminario |