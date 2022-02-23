*** Settings ***
Library  SeleniumLibrary
Test Setup          Abrir navegador
Test Teardown       Fechar navegador

*** Variables ***
${URL}        http://automationpractice.com/
${BROWSER}    Chrome

*** Test Case ***
Cenário 01: Pesquisar produto existente
    Dado que estou na página home do site
    Quando eu pesquisar pelo produto "Blound"
    Então o produto "Blouse" deve ser listado na página de resultado da busca

Cenário 02: Pesquisa produto não existente
    Dado que estou na página home do site
    Quando eu pesquisar pelo produto "Blound"
    Então a página deve exibir a mensagem "No results were found for your search" "ItemNãoExistente"



*** Keywords ***
Dado que estou na página home do site
    Acessar página do site

Quando eu pesquisar pelo produto "Blound"
    Digitar o nome de produto ${PRODUTO} no campo de Pesquisa
    Clica no botão pesquisar

Então o produto "Blouse" deve ser listado na página de resultado da busca
    Conferir se o produto ${PRODUTO} foi listado no site

Então a página deve exibir a mensagem ${MENSAGEM_ERRO}
    Conferir mensagem de erro ${MENSAGEM_ERRO}
