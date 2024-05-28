# language: pt
# encoding: UTF-8
Funcionalidade: Sparker

  Cenario: Procurar um perfil de Sparker

    Dado que o usuário esteja na tela de clientes
    E que ele possua um Sparker cadastrado
    Quando ele digitar invoice ID do Sparker no campo de busca
    Então o sistema deve exibir o perfil do Sparker