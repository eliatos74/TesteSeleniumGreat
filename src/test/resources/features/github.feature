# language: pt

@github
Funcionalidade: Acessar site do Github
  Eu como usuário quero acessar a pagina do Github
  e pesquisar por algo

  Cenario: Acessar o site do github e pesquisar
    Dado que eu acesse a página do github
    Então verifico se estou na página incial
    Quando eu pesquiso por "Teste Automatizado"
    Então devo ver a mensagem "repository results"