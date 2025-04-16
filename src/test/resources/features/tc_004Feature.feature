Feature: Validar manejo de fallos de red durante la carga del documento

  Scenario: Interrumpir y reanudar el proceso de carga de un documento PDF
    Given el usuario inicia el proceso de carga de un documento PDF
    When la conexión de red es interrumpida
    Then el sistema debería mostrar un mensaje de fallo de red
    When la conexión de red es restablecida y el usuario reintenta la carga
    Then el sistema debería permitir reintentar la carga o cancelar el proceso