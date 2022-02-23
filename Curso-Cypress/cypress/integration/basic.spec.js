/// <reference types="cypress" />



describe('Cypress basic', () => {
    it('Should visit page and assert title', () => {
        cy.visit('https://wcaquino.me/cypress/componentes.html')

        cy.title().should('be.equal', 'Campo de Treinamento') //be.equal compara o titulo completo
        cy.title().should('contain', 'Campo') //contain somente compara uma palavra do titulo

        cy.title() //modo mais "limpo" do código
            .should('be.equal', 'Campo de Treinamento')
            .and('contain', 'Campo')
    })



    it('Should find and interact with a element', () => {
        cy.visit('https://wcaquino.me/cypress/componentes.html')

        cy.get('#buttonSimple').click()
        cy.get('#buttonSimple').should('have.value', 'Obrigado!') //compara o campo e seu valor
        
        cy.get('#buttonSimple') //modo mais "limpo" do código
             .click()
             .should('have.value', 'Obrigado!')
        
    });


})