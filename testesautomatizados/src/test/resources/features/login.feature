#language: pt
#encoding: UTF-8


@Login @E2E
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema
    
	@RealizarLogin @SmokeTest
  Esquema do Cenário: Realizar login com sucesso
    Quando informar o campo Username como <usuario>
    E informar o campo PassWord como <senha>
    E clicar no botao Login
    Então o sistema deverá autorizar o login, exibindo página contendo o Dashboard

    Exemplos: 
      | usuario | senha    |
      | Admin   | admin123 |
