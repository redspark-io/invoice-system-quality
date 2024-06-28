# language: pt
# encoding: UTF-8

  Funcionalidade: Prévia de Faturamento
    Cenario: Cadastrar Prévia de Faturamento
      Dado que o usuário esteja na tela de Prévia de Faturamento
      E que o usuário clique no botão Adicionar Rate card
      E que o usuário preencha o campo procure por descrição o Rate card
      E que ele clique no Rate card desejado
      E que o usuário  clique em adicionar Período
      E que o usuário preencha o campo procure por função
      Quando clicar em salvar "adição de previa de faturamento"
      Então o Rate card e o período são adicionados com sucesso

