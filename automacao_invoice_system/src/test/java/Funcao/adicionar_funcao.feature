# language: pt
# encoding: UTF-8
  Funcionalidade: Função
    Cenário: cadastrar uma função a um rate card cadastrado
      Dado que o usuário esteja na tela de função
      E que ele clique no botão de adicionar
      E que ele preencha todos os campos do modal de cadastro corretamente
      Quando clicar em salvar "adição função"
      Então o sistema cadastra uma nova função