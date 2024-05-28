# language: pt
# encoding: UTF-8

  Funcionalidade: Prévia de Faturamento
    Cenario: Cadastrar Prévia de Faturamento
      Dado que o usuário esteja na tela de Prévia de Faturamento
      E o usuário clica no botão Adicionar Rate card
      E o usuário preenche o campo procure por descrição o Rate card
      E clica no Rate card desejado
      E o usuário  clica em Adicionar Período
      Quando o usuário preenche o campo procure por função
      Então o Rate card e o período são adicionados com sucesso

