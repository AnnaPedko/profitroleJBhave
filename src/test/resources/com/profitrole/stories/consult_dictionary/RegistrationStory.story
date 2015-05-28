

Narrative:
As a user
I want to create account
So that I can register to the site

Scenario: User registers with empty fields
Given the user opens profitrole register page
When the user registers with empty fields
Then the user see all errors loginError'Длина логина должна быть от 3 до 50 символов.' and 'Поле не должно быть пустым. Корректными значениями являются большие и маленькие буквы (Английский), цифры, символы (. + - () : ; _ ).'
And the user see all errors passwordError'Длина пароля должна быть от 6 до 35 символов.' and 'Поле не должно быть пустым. Корректными значениями являются большие и маленькие буквы (Русский, Украинский, Английский), цифры, символы (, . + - * / () [] = : ; _ ).'
And see emailError 'Поле не должно быть пустым.'
And see agreeError'Для завершения регистрации Вы должны принять Правила и условия работы на сайте.'

Scenario: User registers with correct fields
Given the user opens profitrole register page
When the user enters 'NewName122356' in 'login' field
And enters 'qwerty' password in 'password' field and enters confirm password 'qwerty' in 'confirm' field
And enters email'NewName122365.ne@gmail.com' in 'email' field and birthday '12.05.2015' in 'birthday' field and agrees with Rules checks on agree checkbox
Then the users should see success registratrion 'Пожалуйста, проверьте Вашу почту!'
