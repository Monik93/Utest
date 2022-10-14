Feature: Create User
  Me as a candidate for automation in choucair testing
  I need to create a user
  To Perform transactions on the website

  Scenario Outline: Create a user successfully
    Given I want open the web page
    When Create a user in the Utest page
      | firstname   | lastname   | email   | month   | day   | year   | city   | zip   | country   | pass   | confirmpass   |
      | <firstname> | <lastname> | <email> | <month> | <day> | <year> | <city> | <zip> | <country> | <pass> | <confirmpass> |
    Then I validate creation successfully

    Examples:

      | firstname | lastname  | email                    | month     | day | year | city     | zip   | country  | pass             | confirmpass      |
      | monik     | muriel    | mmurielt12345@hotmail.com | September | 14  | 1993 | Medellin | 05001 | Colombia | Monicabonita01   | Monicabonita01   |
      | leonel    | hernandez | holaparce@hotmail.com    | April     | 9   | 1990 | Medellin | 05001 | Colombia | Portablehola2008 | Portablehola2008 |