# language: pt
# encoding: UTF-8
  Funcionalidade: Função
    Cenario: editar uma função cadastrada
      Dado que o usuário esteja na tela de função
      E que ele clique no botão de editar uma função já cadastrada
      E que ele preencha o modal de edição com os campos necessários
      Quando clicar em salvar "edição função"
      Então o sistema atualiza os dados da função com sucesso