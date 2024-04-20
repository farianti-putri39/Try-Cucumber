@add-to-cart
Feature: Add to Cart

  @add-item-to-cart
  Scenario: Add item to Cart
    Given user is on home page
    When user click on item's add to cart button
    Then counter on cart icon is increased

  @remove-from-cart
  Scenario: Remove item from Cart
    Given item is on cart
    When user click on item's remove button
    Then counter on cart icon is decreased

  @add-all-to-cart
  Scenario: Add all items to cart
    Given user is on home page
    When user click on all item's add to cart button
    Then counter on cart icon is increased