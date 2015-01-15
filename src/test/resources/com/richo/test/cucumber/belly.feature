Feature: Belly

  @Important
  Scenario: Eating cukes until full
    Given I have a belly
    When I eat 20 cukes
    Then my belly should be full

  Scenario: Not eating enough cukes to be full
    Given I have a belly
    When I eat 5 cukes
    Then my belly should not be full