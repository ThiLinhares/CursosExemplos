/// <reference types="cypress" />

describe('Work with alerts', () => {
    before(() => {
    })

    beforeEach(() =>{

    })

    it('Should create an account', () =>{
       cy.getToken('user', 'passwd') //command pa trazer o token
            .then(token => {
            cy.request({
                url: 'https://www.facebook.com',
                method: 'POST',
                headers: {Authorization: 'JWT $(token)'},
                body: {
                    nome: 'Conta via rest'
                }
            }).as('response')
        })

        cy.get('@responde').then(res =>{
            expect(res.status).to.be.equal(201)
            expect(res.status).to.have.property('id')
            expect(res.status).to.have.property('nome','Conta via rest')
        })

    })

})