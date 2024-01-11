Feature: Search Product and choose product

  Scenario: Show Bola Basket Product in bukalapak market place and choose it
    Given User successfully open website Bukalapak.com
    When User Input 'Bola Basket' in search bar
    And User Click search
    And Product '“Bola Basket”' displayed
    And User sort by highest price
    And Product Bola Basket sort by 'Termahal'
    And User Scrolling Product
    And User choose DONIC MOBILE BALL BASKET COACHY PENAMPUNG BOLA LATIHAN TENIS MEJA ORIGINAL
    Then Product page 'DONIC MOBILE BALL BASKET COACHY PENAMPUNG BOLA LATIHAN TENIS MEJA ORIGINAL' displayed






