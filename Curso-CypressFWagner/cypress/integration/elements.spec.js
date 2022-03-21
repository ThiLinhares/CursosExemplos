/// <reference types="cypress" />

const faker = require('faker');

faker.locale = 'pt_BR'

const name = faker.name.firstName()

 

    it('Text', () => {    
        cy.get('body').should('contain','Cuidado') //deve conter na pagina inteira
        cy.get('span').should('contain','Cuidado') //deve conter numa tag
        cy.get('.FacilAchar').should('contain','Cuidado') //contain só possui uma parte do texto
        cy.get('.FacilAchar').should('have.text','Cuidado onde clica, muitas armadilhas...') //have.text é o texto exato
    });

    it('Links', () => {
        cy.get("a").first().click() //anotação first serve pra selecionar o primeiro elemento, em caso de ter + que 1
        cy.get('#resultado').should('have.text', 'Voltou!')
 
        cy.reload() //recarrega a pagina
        cy.get('#resultado').should('have.not.text', 'Voltou!') //confirmação que recarregou
        cy.contains('Voltar').click() //usando o contains pra localizar o elemento com texto
        cy.get('#resultado').should('have.text', 'Voltou!')
    });

    it.only('TextFilds', () => {
        cy.get('#formNome').type(name) //busca o campo e escreve
        cy.get('#formNome').should('have.value', name) //confere se no campo tem o texto (campo de texto é value e não text)

        cy.get('#elementosForm\\:sugestoes') //antes dos 2 pontos : usa 2 barras \\
            .type('text Area')
            .should('have.value','text Area' ) //forma "limpa" de escrever o codigo

         cy.get('#tabelaUsuarios > :nth-child(2) > :nth-child(1) > :nth-child(6) > input')
             .type('???')
                
         cy.get('[data-cy=dataSobrenome]').type('teste12345{backspace}{backspace}')
             .should('have.value','teste123' )

         cy.get('#elementosForm\\:sugestoes') //antes dos 2 pontos : usa 2 barras \\
             .clear()
             .type('Erro{selectall}Acerto', {delay: 100}) //delay de intervalo
             .should('have.value','Acerto' )

    });
    
    it('RadioButton', () => {
        cy.get('#formSexoFem')
            .click()
            .should('be.checked') //confirma se está selecionado

    cy.get('#formSexoMasc').should('not.be.checked') //confirma que não está selecionado     

    cy.get("[name='formSexo']").should('have.length', 2) //confirma se tem 2 radioButton
    });

    it ('Checkbox', () => {
        cy.get('#formComidaPizza')
            .click()
            .should('be.checked')
    
        cy.get('[name=formComidaFavorita]').click({multiple: true}) //multiple para clicar em varios checkbox
        cy.get('#formComidaPizza').should('not.be.checked')
        cy.get('#formComidaVegetariana').should('be.checked')
    })

    it('Combo', () => {
        cy.get('[data-test=dataEscolaridade]')
            .select('2o grau completo') //para combo se usa o select
            .should('have.value', '2graucomp') //combo assertiva pelo value
    })

    it('Combo multiplo', () =>{
        cy.get('[data-testid=dataEsportes]')
            .select(['natacao', 'Corrida', 'nada']) //combo multiplo seleciona por array    

    })

});