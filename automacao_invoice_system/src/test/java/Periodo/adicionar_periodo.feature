# language: pt
# encoding: UTF-8

Funcionalidade: Período

  Cenário: Cadastrar um Periodo
    Dado que o usuario esteja logado
    E que o usuário esteja na tela de periodo
    E que ele clique em adicionar periodo
    E que ele preencha os campos obrigatórios do modal
    Quando clicar em salvar "adição periodo"
    Então o sistema cadastra um novo periodo