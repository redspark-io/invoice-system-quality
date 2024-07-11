# language: pt
# encoding: UTF-8

Funcionalidade: Cliente
  Cenario: Editar um perfil cliente
    Dado que o usuario esteja logado
    E que o usuario esteja na tela de clientes
    E que ele selecione o botão de editar de um cliente cadastrado
    E que ele preencha o modal de edição de cliente com os dados necessarios
    Quando clicar em salvar "edição de cliente"
    Entao o sistema salva a edicao do cliente