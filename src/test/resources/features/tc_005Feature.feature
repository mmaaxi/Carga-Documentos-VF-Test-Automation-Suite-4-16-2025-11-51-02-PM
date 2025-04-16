Feature: Validar el comportamiento ante la carga de un documento duplicado

  Scenario: Cargar un documento PDF válido y uno duplicado
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF válido
    Then el sistema carga el documento correctamente
    When el usuario intenta cargar el mismo documento nuevamente
    Then el sistema detecta el archivo duplicado y muestra un mensaje: 'El documento ya fue cargado anteriormente'