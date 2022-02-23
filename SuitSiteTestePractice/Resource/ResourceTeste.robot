*** Settings ***
Library             SeleniumLibrary

*** Variables ***
${BROWSER}    Chrome
${URL}        http://automationpractice.com/
${PRODUTO}     ItemNãoExistente
${MENSAGEM_ERRO}  "No results were found for your search "ItemNãoExistente""

*** Keywords ***
###Setup e Teardown
Abrir navegador
    Open Browser    ${URL}    ${BROWSER}

Fechar navegador
    Close Browser

### passo-a-passo
Acessar página do site
    Title Should Be    My Store

Digitar o nome de produto ${PRODUTO} no campo de Pesquisa
    Input Text    id=search_query_top    ${PRODUTO}

Clica no botão pesquisar
    Click Button    name=submit_search

Conferir se o produto ${PRODUTO} foi listado no site
    Wait Until Element Is Visible   css=#center_column > h1
    Title Should Be    Search - My Store

Conferir mensagem de erro ${MENSAGEM_ERRO}
    Page Should Contain Element   xpath=//*[@id="center_column"]/p[@class="alert alert-warning"]    ${MENSAGEM_ERRO}
