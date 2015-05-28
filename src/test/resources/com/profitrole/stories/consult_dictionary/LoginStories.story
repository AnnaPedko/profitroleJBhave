Login Page

Narrative:
In order to redirect my profile
as a user
I want to can login

Scenario: Logging in with empty userName and password fields
Given the user is on Profitrole page
When the user enters Login button with empty fields
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with not existing account
Given the user is on Profitrole page
When the user enters Login button with userName 'notExistingName' and password '111111' fields
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with existed userName only
Given the user is on Profitrole page
When the user enters Login button with existed userName 'Andreevna' only
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Logging in with existed password only
Given the user is on Profitrole page
When the user enters Login button with existed password '111111' only
Then they should see the error 'Вы ввели неверный логин и/или пароль'

Scenario: Login with existing UserName and Password

Given the user is on Profitrole page
When the user enters Login button with userName 'Andreevna' and password '111111' fields
And click on link 'Профиль'
Then they should see the success enter and find profile wich contains name 'Andreevna' and email 'andreevna.ne@gmail.com' and birthday '01.05.2015' and country 'Украина'





