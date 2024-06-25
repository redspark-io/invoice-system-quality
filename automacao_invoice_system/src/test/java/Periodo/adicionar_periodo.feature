# language: pt
# encoding: UTF-8

Funcionalidade: Período

  Cenário: Cadastrar um Periodo

    Dado que o usuário esteja logado no sistema na tela de Periodo
    E que o usuário clique em adicionar periodo
    E que o usuário preencha os campos obrigatórios do modal
    Quando clicar em salvar "adição periodo"
    Então o sistema cadastra um novo periodo



