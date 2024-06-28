# language: pt
# encoding: UTF-8

Funcionalidade: Prévia de faturamento

  Cenário: Editar prévia de faturamento cadastrado
    Dado que o usuário esteja logado no sistema na tela de prévia de faturamento
    E que usuário clique no botão editar deu uma prévia de faturamento já cadastrada
    E que ele preencha o modal de edição com os dados corretos
    Quando clicar em salvar "edição de previa de faturamento"
    Então o sistema atualiza um novo registro de prévia de faturamento