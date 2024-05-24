# language: pt
# encoding: UTF-8

Funcionalidade: Cliente
  Cenario: Editar um perfil cliente
    Dado que o usuário esteja na tela de clientes
    E que ele selecione o botão de editar de um cliente cadastrado
    Quando ele preencher o modal de edição com os dados necessarios
    E clicar no botão de salvar
    Entao o sistema atualiza os dados do cliente com sucesso
