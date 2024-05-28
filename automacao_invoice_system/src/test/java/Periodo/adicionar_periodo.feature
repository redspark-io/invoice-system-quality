# language: pt
# encoding: UTF-8

Funcionalidade: Período

  Cenário: Cadastrar um Periodo

    Dado que o usuário esteja logado no sistema na tela de Periodo
    E o usuário clicar em Adicionar periodo
    Quando o usuário preencher os campos obrigatórios do modal
    E clicar em Salvar
    Então o sistema cadastra um novo periodo



