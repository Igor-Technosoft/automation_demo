@computer-database
  Feature: Testing Computer Database to create, read, update, and delete computer files
    Background:
      Given I'm on computer database home page


      Scenario: Adding a new computer
        And I click Add a new computer button
        And I see Add a computer screen
        And I enter Test46 as Computer name
        And I enter 2018-06-05 as Introduced date
        And I enter 2018-07-05 as discontinued date
        And I select Apple Inc from Company drop-down menu
        When I click Create this computer button
        Then I'm back on computer database home screen
        And I see Done! Computer Test46 has been created

        Scenario: Reading/Searching for a specific computer
          And I enter Test46 in Filter by computer name text box
          When I click Filter by name button
          Then I see Test46 in Computer name column
          And I clear text box and I click on Filter by name button
          And I'm back on computer database home screen

          Scenario: Editing a computer name
            And I enter Test46 in Filter by computer name text box
            When I click Filter by name button
            Then I see Test46 in Computer name column
            And I click Test46 link
            And I replace Test46 with Test45
            And I click Save this computer button
            And I see Done! Computer Test45 has been updated and I'm back on computer database home screen

            Scenario: Deleting a computer
              And I type in Test45 into Filter by computer name text box
              And click on  Filter by name button
              And I see Test45 displayed
              And I click Test45 link
              When I click Delete this computer button
              Then I see Done! Computer has been deleted and I'm back on computer database home screen

              Scenario: Searching for a non-existing computer
                And I enter Test46 into the search box
                When I click Filter button
                Then I see No computers found







