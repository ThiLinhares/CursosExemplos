/// <reference types="cypress" />



describe('Fixture tests', () => {
    it("Get data form fixture file", function() { //arrow function pode dar problema depois do "then"
        cy.visit('https://wcaquino.me/cypress/componentes.html')
        cy.fixture('UserData').as('usuario').then(() => {
        cy.get('#formname').type(this.usuario.nome)
        cy.get('#formSobrenome').type(this.usuario.sobrenome)
        cy.get('[name=formSexo][value=${this.usuario.sexo}]').click()
        cy.get('[name=formComidaFavorita][value=${this.usuario.comida}]')
        cy.get('#formEscolaridade').select(this.usuario.escolaridade)
        cy.get('#formEsportes').select(this.usuario.esportes)
    
        cy.get('formSexoCadastrar').click()
        cy.get('#resultado > :nth-child(1)').should('contain', 'Cadastrado')
    
       
    })

})

})