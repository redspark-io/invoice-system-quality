# language: pt
# encoding: UTF-8

Funcionalidade: Cliente
  Cenario: Adicionar um perfil cliente
    Dado que o usuario esteja logado
    E Que o usuario esteja na tela de clientes
    E que ele clique no botão de adicionar cliente
    E que ele preencha todos os campos do modal de cadastro corretamente
    Quando clicar em salvar "adição de cliente"
    Entao o sistema adiciona o novo cliente