*** Settings ***
Library         SeleniumLibrary
Resource        ../Resource/resourcecorreios.robot
Test Setup      Abrir navegador
Test Teardown   Fechar navegador

*** Test Cases ***
Caso de teste 01: codigo com sucesso
    Digitar código "NX198306965BR"
    Sleep           5
    Confirmação de sucesso

Caso de teste 02: codigo com erro    
    Digitar código "huehuehue"
    Sleep           5
    Confirmação de erro