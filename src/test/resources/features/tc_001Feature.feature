Feature: Validar carga exitosa de documento PDF con formato correcto

  Scenario: Subir un documento PDF válido
    Given El usuario está en la página de subida de documentos
    When El usuario selecciona un archivo PDF válido
    And Hace clic en el botón 'Cargar documento'
    Then Se muestra una barra de progreso
    And El sistema confirma mediante mensaje que la carga fue exitosa
    And El documento aparece en la lista de documentos cargados