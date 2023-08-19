Feature: check for text functionnality 

Scenario: visit the website and checking for text
    Given visit the website "https://www.comar.tn"
    When click on "Actualités"
    Then check if the word "ACTUALITÉS" is vivisible
    When write "COMAR Assurances partenaire" in the input
    And click on the button of research
    Then check if this text "COMAR Assurances partenaire du Semi-Marathon Ulysse Djerba" is visible
