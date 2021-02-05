Feature: Validate the options under PIM tab

  Scenario Outline: Add employee details
    Given I mouseover on PIM tab
    And I click on AddEmployee option
    And I enter FirstName <FirstName>
    And I enter LastName <LastName>
    And I click on Save button
    Then the employee record is created	with name <EmployeeRecord>

    Examples: 
      | FirstName | LastName | EmployeeRecord |
      | delly     | ibm      | delly ibm      |
