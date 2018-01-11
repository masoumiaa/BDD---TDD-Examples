Feature: Testing refrences

  Scenario: Get reference details by id
    Given the catalog with the following Elements:
     | id | name            | type    | price |
     | 1  | BDD book        | book    | 30    |
     | 2  | TDD book        | book    | 40    |
     | 3  | AssertJ website | website | 0     |
    When I choose the Element <id>
    Then 	The name should be <name> 
    	And the type should be <type>
    	And the price should be <price>