Feature: Test Volvos

  Scenario: Locking the car
    Given that I have a car
    Given that I have car keys
    When I press the lock button on my kar keys
    Then The car should be locked