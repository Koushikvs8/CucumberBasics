
@tag
Feature: Application Login

Scenario: Admin page default login

Given  user on NetBanking landng page
When User login in to application with "admin" and password "1234"
Then Home page is displayes 
And Cards are displayed

 #Reusable
 
 Scenario: Admin page default login

Given  user on NetBanking landng page
When User login in to application with user and password 123d4
Then Home page is displayes 
And Cards are displayed

 Scenario Outline: Admin page default login

Given  user on NetBanking landng page
When User login in to application with "<Username>" and password  "<password>"
Then Home page is displayes 
And Cards are displayed


Examples:
|Username|password|
|koushik|4566666|
|swathi|456666ss6|
|shiva|45665ff666|

 Scenario: Admin page default login

Given  user on guru99  application
When User login in to application 
|koushik|
|shet|
|567890|
|india|
Then Home page is displayes 
And Cards are displayed
