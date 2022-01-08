Feature: Como um PROFESSOR eu gostaria de IDENTIFICAR OS TIPOS DE TRIÂNGULOS para ENSINÁ-LOS AOS MEUS ALUNOS.

  Scenario: Visualizar informações do triangulo Equilátero
    Given Estou no navegador Chrome
    And Estou na url "http://vanilton.net/triangulo"
    When Preencho o vertice "1" com "5"
    And Preencho o vertice "2" com "5"
    And Preencho o vertice "3" com "5"
    And Clico no botão "Identificar"
    Then É Exibido o triângulo "Equilátero"

  Scenario: Visualizar informacoes do triangulo
    Given Estou no navegador Chrome
    And Estou na url "http://vanilton.net/triangulo"
    When Preencho triângulo
      |vertice|valor |
      |1      |3     |
      |2      |3     |
      |3      |3     |
    And Clico no botão "Identificar"
    Then É Exibido o triângulo "Equilátero"