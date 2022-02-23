*** Settings ***
Resource            ../Resource/ResourceTeste.robot
Test Setup          Abrir navegador
Test Teardown       Fechar navegador

###SETUP: ele roda kw antes da suite ou antes de um teste
###TEARDOWN: ele roda kw depois de uma suite ou de um teste

*** Test Case ***
#Caso de teste 01: Pesquisar produto existente
    #Acessar página do site
    #Digitar o nome de produto "Blouse" no campo de Pesquisa
    #Clica no botão pesquisar
    #Conferir se o produto "Blouser" foi listado no site

Caso de teste 02: Pesquisa produto não existente
    Acessar página do site
    Digitar o nome de produto "ItemNãoExistente" no campo de Pesquisa
    Clica no botão pesquisar
    Conferir mensagem de erro "No results were found for your search "ItemNãoExistente""


*** Keywords ***
