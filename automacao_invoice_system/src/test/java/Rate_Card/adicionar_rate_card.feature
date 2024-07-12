# language: pt
# encoding: UTF-8
Funcionalidade: Rate Card
  Cenario: cadastrar rate card
    Dado que o usuario esteja logado
    E que o usuário esteja na tela de Rate Cards
    E que o usuário clique no botão de adicionar rate card
    E que o usuário preencha todos os campos do modal de cadastro corretamente
    Quando clicar em salvar "adição de rate card"
    Então o sistema adiciona um novo rate card