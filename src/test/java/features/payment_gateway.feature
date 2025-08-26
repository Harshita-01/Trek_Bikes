Feature: Payment Gateway
  As a user
  I want to buy a product and complete payment
  So that I can verify order is successful

  Scenario Outline: Successful payment with valid details
    Given I navigate to the Payment Gateway page
    When I enter card number "<cardNumber>" and CVV "<cvv>" and expiry "<expMonth>" "<expYear>"
    And I submit the payment
    Then I should see the confirmation message

    Examples:
      | cardNumber       | cvv | expMonth | expYear |
      | 4111111111111111 | 123 | 12       | 2027    |
      | 5555555555554444 | 456 | 08       | 2028    |
