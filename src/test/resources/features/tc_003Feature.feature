Feature: Validar comportamiento al intentar cargar un documento que excede el tamaño máximo permitido

  Scenario: Cargar un documento PDF que supera el tamaño máximo
    Given que el usuario ha seleccionado un archivo PDF que supera el tamaño máximo permitido
    When intenta cargar el documento
    Then el sistema debería detectar que el archivo excede el límite de tamaño
    And el sistema debería mostrar un mensaje de error: "El archivo supera el tamaño permitido"