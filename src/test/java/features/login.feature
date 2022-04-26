Feature: Application Login

Scenario: Home page deafult login
Given user is on Netbankinglanding page
When User login into application with user name and password
Then Home page is populated
And cards are displayed