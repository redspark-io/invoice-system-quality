# language: pt
# encoding: UTF-8
Funcionalidade: Projeto

  Cenario: Cadastrar um projeto
    Dado que o usuário esteja na tela de projetos
    E que ele selecione o botão de adicionar projeto
    E que ele preencha todos os campos do modal de cadastro corretamente
    Quando clicar em salvar "adição de projeto"
    Entao o sistema adiciona o novo projeto