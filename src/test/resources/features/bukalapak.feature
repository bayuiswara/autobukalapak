Feature: Search Product and choose product

  Background:
    Given User successfully open website Bukalapak.com


  Scenario: Show Bola Basket Product in bukalapak market place and choose it
    When User Input 'Bola Basket' in search bar
    And User Click search
    And Product '“Bola Basket”' displayed
    And User Choose Sorting
    And User Choose highest price
    And Product Bola Basket sort by 'Termahal'
    And User Scrolling Product
    And User choose "Bola Basket Molten B7G4500 / BG4500 Size 7 FIBA Approved"
    Then Product page 'Bola Basket Molten B7G4500 / BG4500 Size 7 FIBA Approved' displayed

  Scenario: Show Sepatu Bola Product in bukalapak market place and choose it
    When User Input 'Sepatu Bola' in search bar
    And  User Click search
    And  Product '“Sepatu Bola”' displayed
    And  User Choose Sorting
    And  User sort by lowest price
    And Product Bola Basket sort by 'Termurah'
    And User Scrolling Product
    And User choose "Sepatu Bola Karet Yumeida FB NEW Hitam - Sepatu Pria"
    Then Product page 'Sepatu Bola Karet Yumeida FB NEW Hitam - Sepatu Pria' displayed









