# language: pt
# encoding: UTF-8
Funcionalidade: Cliente
  Cenario: Procurar um perfil cliente
    Dado que o usuario esteja logado
    E que o usuário esteja na tela de clientes
    E que ele possua um cliente cadastrado
    Quando ele digitar invoice ID do cliente no campo de busca
    Então o sistema deve exibir o perfil do cliente