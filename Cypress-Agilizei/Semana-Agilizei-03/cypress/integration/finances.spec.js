/// <reference types-"cypress" />

context('Dev Finances Agilizei', () => {

    beforeEach(() => {
        cy.visit('https://devfinance-agilizei.netlify.app/')
        cy.get('#data-table tbody tr').should('have.length', 0)
        
    });

    it('Cadastrar entradas', () => {
        // - entender o fluxo manualmente 
        // - mapear os elementos que vamos interagir
        // - descrever as interações com cypress
        // - adicionar as asserções que precisamos

        

        cy.get('#transaction .button').click() //id + classe
        cy.get('#description').type('Mesada') //id
        cy.get('[name=amount]').type(12) // atributos
        cy.get('[type=date]').type('2021-10-03')   //atributos
        cy.get('button').contains('Salvar').click() //tipo e valor
        cy.get('#data-table tbody tr').should('have.length', 1)
    });
    

    it('Cadastrar saidas', () => {

        cy.get('#transaction .button').click() //id + classe
        cy.get('#description').type('Cartão') //id
        cy.get('[name=amount]').type(-10) // atributos
        cy.get('[type=date]').type('2021-10-03')   //atributos
        cy.get('button').contains('Salvar').click() //tipo e valor
        cy.get('#data-table tbody tr').should('have.length', 1)
        
    });

    it('Remover entradas e saídas', () => {
        const entrada = 'mesada'
        const saida = 'kinderOvo'

        cy.get('#transaction .button').click() //id + classe
        cy.get('#description').type(entrada) //id
        cy.get('[name=amount]').type(10) // atributos
        cy.get('[type=date]').type('2021-10-03')   //atributos
        cy.get('button').contains('Salvar').click() //tipo e valor
        


        cy.get('#transaction .button').click() //id + classe
        cy.get('#description').type(saida) //id
        cy.get('[name=amount]').type(-10) // atributos
        cy.get('[type=date]').type('2021-10-03')   //atributos
        cy.get('button').contains('Salvar').click() //tipo e valor
        
        

        //estrategia 1: voltar para elemento pai, e avançar para um td image attr
        cy.get('td.description')
          .contains(entrada)
          .parent()
          .find('img[onclick*=remove]')
          .click()



          //estrategia 2:buscar todos os irmãos, e buscar o que ten img + atrib
          cy.get('td.description')
          .contains(saida)
          .siblings()
          .children('img[onclick*=remove]')
          .click()

          cy.get('#data-table tbody tr').should('have.length', 0)
    });
});