@Interactions
Feature: Interactions Page Test Cases


  Background: To access drop-down menus
    Given Click to interactions button


  @Sortable @ItemsStartingOrderFromList
    Scenario: Check Items starting order
      Given User is on sortable menu
      Then "<Items>" must have the following starting order:

        | Items |
        | One   |
        | Two   |
        | Three |
        | Four  |
        | Five  |
        | Six   |


#  @Sortable @MultipleSortFromList
#    Scenario: Reordering multiple items
#      Given User is on sortable menu
#      When User drags "Two" and drops it before "One" from list
#      And User drags "Five" and drops it after "One" from list
#      And User drags "Six" and drops it after "Five" from list
#      And User drags "Four" and drops it before "Three" from list
#      Then Items should be in the following order from list:
#        | Items |
#        | Two   |
#        | One   |
#        | Five  |
#        | Six   |
#        | Four  |
#        | Three |
#

#  @Selectable @SelectItemFromList
#  Scenario Outline: Select a item from list
#    Given User is on selectable menu
#    When Select "<Item>" from list
#    Then "<Item>" must be selected from list
#
#    Examples:
#    |           Item            |
#    | Cras justo odio           |
#    | Dapibus ac facilisis in   |
#    | Morbi leo risus           |
#    | Porta ac consectetur ac   |
#
#
#  @Selectable @DropItemFromList
#  Scenario Outline: Drop a item from list
#    Given User is on selectable menu
#    When Select "<Item>" from list
#    Then "<Item>" must be selected from list
#    When Drop "<Item>" from list
#    Then "<Item>" must be dropped from list
#
#    Examples:
#      |           Item            |
#      | Cras justo odio           |
#      | Dapibus ac facilisis in   |
#      | Morbi leo risus           |
#      | Porta ac consectetur ac   |

#
  #  @Sortable @MultipleSortFromGrid
#  Scenario: Reordering multiple items
#    Given User is on sortable menu
#    When Click to grid on sortable menu
#    And User drags "Two" and drops it before "One" from grid
#    And User drags "Five" and drops it after "One" from grid
#    And User drags "Six" and drops it after "Five" from grid
#    And User drags "Four" and drops it before "Three" from grid
#    Then Items should be in the following order from grid:
#      | Items |
#      | Two   |
#      | One   |
#      | Five  |
#      | Six   |
#      | Four  |
#      | Three |
#

#  @Selectable @SelectItemFromGrid
#  Scenario Outline: Select a item from grid
#    Given User is on selectable menu
#    When Click to grid on selectable menu
#    And Select "<Item>" from grid
#    Then "<Item>" must be selected from grid
#
#    Examples:
#      | Item  |
#      | One   |
#      | Two   |
#      | Three |
#      | Four  |
#      | Five  |
#      | Six   |
#      | Seven |
#      | Eight |
#      | Nine  |
#
#
#  @Selectable @DropItemFromGrid
#  Scenario Outline: Drop a item from grid
#    Given User is on selectable menu
#    When Select "<Item>" from grid
#    Then "<Item>" must be selected from grid
#    When Drop "<Item>" from grid
#    Then "<Item>" must be dropped from grid
#
#    Examples:
#      | Item  |
#      | One   |
#      | Two   |
#      | Three |
#      | Four  |
#      | Five  |
#      | Six   |
#      | Seven |
#      | Eight |
#      | Nine  |


#    rezistable menu