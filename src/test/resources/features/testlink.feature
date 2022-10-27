# language: pt

@testlink
Funcionalidade: Acessar site Testlink
  Eu como usuário quero acessar a pagina do Testlink
  e quero acessar o Github do Testlink atraves da pagina

  Cenario: Acessar o Site do testlink e o github do testlink
    Dado que eu acesse a página do Testlink
    E verifico se estou na página inicial
    Então verifico a mensagem de cabeçalho
    Quando clico no link do Github
    E verifico se estou na página github do Testlink
    Então verifico a mensagem do sobre

