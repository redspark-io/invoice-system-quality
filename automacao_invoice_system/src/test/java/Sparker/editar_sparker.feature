# language: pt
# encoding: UTF-8


Funcionalidade: Sparker

  Cenário: Editar Sparker

    Dado que o usuário esteja logado no sistema na tela de Sparker
    E que usuário clique no botão editar de um sparker já cadastrado
    Quando o usuário preencher modal de edição com os dados corretos
    E clicar em Salvar
    Então o sistema atualiza sparker com os dados informados