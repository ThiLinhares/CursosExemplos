*** Settings ***
Documentation   Teste Correios
Library         SeleniumLibrary

*** Keywords ***
Abrir navegador
    Open Browser                   https://www2.correios.com.br/sistemas/rastreamento/default.cfm   chrome
    Wait Until Element Is Visible  //img[@src='home2014/img/layout/logo.png']

Digitar código "${CODIGO}"
    Input Text        //*[@id="objetos"]       "${CODIGO}"
    Click Button      //*[@id="btnPesq"]

Confirmação de erro
    Page Should Contain Image       //*[@id="infoMensagem"]/div/img

Confirmação de sucesso
    Page Should Contain Image      //*[@id="imagemhidden"]/div[1]/img
    Page Should Contain Button     css=body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content.trescolunas > div.ctrlcontent > div.btnform > button
    Element Text Should Be         //*[@id="UltimoEvento"]/strong   Objeto em trânsito - por favor aguarde


Fechar navegador
    close browser
