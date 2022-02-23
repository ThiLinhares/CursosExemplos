#language: pt
#encoding: UTF-8


@Login @E2E
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema
    
	@RealizarLogin @SmokeTest
  Esquema do Cen�rio: Realizar login com sucesso
    Quando informar o campo Username como <usuario>
    E informar o campo PassWord como <senha>
    E clicar no botao Login
    Ent�o o sistema dever� autorizar o login, exibindo p�gina contendo o Dashboard

    Exemplos: 
      | usuario | senha    |
      | Admin   | admin123 |
