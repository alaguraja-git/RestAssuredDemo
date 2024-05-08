Feature:
  Verify different GET operation using Rest Assured

  Scenario: verify one title of the post
    Given I perform GET operation for "/post"
    Then I should see the title as "a title"

  Scenario: verify collection of title of the post
    Given I perform GET operation
    Then I should see the title names

  Scenario: verify path parameter of GET
    Given I perform GET operation
    Then I should see verify GET parameter

  Scenario: verify query parameter of GET
    Given I perform GET operation
    Then I should see verify GET query parameter
