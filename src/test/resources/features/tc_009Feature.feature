Feature: Validar el comportamiento cuando se carga un documento PDF corrupto

  Scenario: Carga de un documento PDF corrupto
    Given el usuario ha seleccionado un archivo PDF corrupto
    When el usuario intenta cargar el archivo
    Then el sistema debe detectar la corrupción del archivo
    And el sistema debe mostrar un error indicando: 'El documento parece estar dañado. Por favor, verifique y reintente.'