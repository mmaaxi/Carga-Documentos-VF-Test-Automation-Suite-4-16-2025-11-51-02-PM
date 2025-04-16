Feature: Validar mensaje de error al intentar cargar archivo con formato no permitido

  Scenario: Cargar un archivo de imagen en lugar de un PDF
    Given el usuario navega a la página de carga de documentos
    When el usuario selecciona un archivo de imagen
    Then el sistema indica que el formato es inválido

    When el usuario hace clic en 'Cargar documento'
    Then el sistema muestra el mensaje 'Formato no permitido'