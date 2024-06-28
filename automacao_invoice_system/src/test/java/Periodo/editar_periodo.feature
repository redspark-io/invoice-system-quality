# language: pt
# encoding: UTF-8

Funcionalidade: Período

  Cenário: Editar um Periodo cadastrado
    Dado que o usuário esteja na tela de periodo
    E que ele clique no botão editar de um periodo cadastrado
    E que ele preencha o modal de edição de periodo com os dados corretos
    Quando clicar em salvar "edição periodo"
    Então o sistema atualiza o periodo