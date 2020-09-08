Feature: Register the user details n facebook
I want enter new user details


Scenario:  Register Into FaceBook
      Given User Launch the Chrome Browser
      When User Open the Application URL "https://fb.com"
      And Click on create new account Button
      And User enter FirstName as "sindhuja" and SurName as "dara" and Mobilenumber as 7330892877 and NewPasssword as "sahaja30" and dob of the day as 14 and month as "Sep" and year as 1992 
      And Click RadioButton as "female" Button
      Then Click on SighIn Button
      And Close the Browser
