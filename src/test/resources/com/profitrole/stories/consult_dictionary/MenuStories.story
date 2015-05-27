Create menu

Narrative:
In order to create my menu
as a user
I want can select a country cuisine and dishes

Scenario: User select Ukarinian cuisine and Milk dish and move on for creation menu
Given the user open profitrole menu page
When the user selects for 'breakfast' the 'Украинская' cuisine
And the user move to the 'breakfast' menu dish 'Молоко  '
Then the user see at 'breakfast' menu dish 'Молоко  '


