# language: pt
# encoding: UTF-8

Funcionalidade: Período

  Cenário: Editar um Periodo cadastrado

    Dado que o usuário esteja logado no sistema na tela de Periodo
    E que usuário clique no botão editar de um periodo já cadastrado
    E que o usuário preencha o modal de edição com os dados corretos
    Quando clicar em salvar "edição periodo"
    Então o sistema atualiza um novo periodo