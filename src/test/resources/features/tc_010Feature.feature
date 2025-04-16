Feature: Validar la performance de la carga masiva de documentos

  Scenario: Cargar múltiples PDF en un solo proceso y verificar la respuesta del sistema
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona múltiples archivos PDF válidos
    Then el sistema debe iniciar el proceso de carga en paralelo
    And se debe monitorizar el tiempo de carga 
    Then el sistema debe cargar todos los documentos dentro de un tiempo razonable y sin afectar la estabilidad del servicio