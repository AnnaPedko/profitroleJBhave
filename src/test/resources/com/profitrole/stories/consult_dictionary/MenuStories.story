Create menu

Narrative:
In order to create my menu
as a user
I want can select a country cuisine and dishes

Scenario: User selects Ukarinian cuisine and Milk dish and move on for creation breakfast menu
Given the user open profitrole menu page
When the user selects for 'breakfast' the 'Украинская' cuisine
And the user move to the 'breakfast' menu dish 'Молоко  '
Then the user see at 'breakfast' menu dish 'Молоко  '
When the user clicks on 'dinner' button
Then the user see title 'Ваш обед' at 'dinner' page
When the user clicks on 'supper' button
Then the user see title 'Ваш ужин' at 'supper' page

Scenario: User selects Japan cuisine and www dish and move on for creation dinner menu
Given the user open profitrole menu page
When the user selects for 'dinner' the 'Японская' cuisine
And the user move to the 'dinner' menu dish 'www  '
Then the user see at 'dinner' menu dish 'www  '


Scenario: User selects Thai cuisine and WWW dish and move on for creation supper menu
Given the user open profitrole menu page
When the user selects for 'supper' the 'Тайская' cuisine
And the user move to the 'supper' menu dish 'WWW  '
Then the user see at 'supper' menu dish 'WWW  '

