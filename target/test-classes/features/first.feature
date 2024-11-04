
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
When User login in to application with "user" and password "123d4"
Then Home page is displayes 
And Cards are displayed