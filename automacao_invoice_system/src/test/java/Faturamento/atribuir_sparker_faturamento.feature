# language: pt
# encoding: UTF-8

Funcionalidade: Faturamento

  Cenário: Cadastrar faturamento/Atribuir Sparker
    Dado que estou na tela de faturamento
    E o usuário clica na descrição para atribuir um sparker
    E o usuário clica em executar e aberto modal Atribuir Sparker
    Quando o usuário preencher o campo com ID do sparker
    E clicar em Salvar
    Então o sistema cadastra um novo faturamento com o sparker atribuído