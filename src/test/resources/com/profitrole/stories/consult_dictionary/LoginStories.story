Login Page

Narrative:
In order to redirect my profile
as a user
I want to can login

Scenario: Logging in with empty userName and password fields
Given the user is on Profitrole page
When the user enters Login button with empty fields
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with not existing userName and password fields
Given the user is on Profitrole page
When the user enters Login button with userName 'Anna' and password '111111' fields
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with existed userName only
Given the user is on Profitrole page
When the user enters Login button with existed userName 'Anna' only
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with existed password only
Given the user is on Profitrole page
When the user enters Login button with existed password '123456' only
Then they should see the error 'Вы ввели неверный логин и/или пароль'






