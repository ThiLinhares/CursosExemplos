/// <reference types="cypress" />

describe('Work with alerts', () => {
    before(() => {
        cy.visit('https://wcaquino.me/cypress/componentes.html')
    })
    
    beforeEach(() => {
        cy.reload()
    });

    it('Alert', () => {
        cy.get('#alert').click()
        cy.on('window:alert', msg => { //coloca a msg num var
            console.log(msg) //imprime a msg no console
            expect(msg).to.be.equal('Alert Simples') //assertiva 
        })
    })


    it('Confirm', () => {
        cy.get('#confirm').click()
        cy.on('window:confirm', msg => { //coloca a msg num var
            expect(msg).to.be.equal('Confirm Simples') //assertiva 
        })

        cy.get('#confirm').click()
        cy.on('window:alert', msg => { //coloca a msg num var
            expect(msg).to.be.equal('Confirmado') //assertiva
        
        })

    })
        
        it('Deny', () => {
            cy.get('#confirm').click()
            cy.on('window:confirm', msg => { //coloca a msg num var
                expect(msg).to.be.equal('Confirm Simples') //assertiva
                return false  
            })
    
            cy.on('window:alert', msg => { //coloca a msg num var
                expect(msg).to.be.equal('Negado') //assertiva
            
            })
        
        })

        it('Prompt', () => {
            cy.on('window:prompt', msg => { //coloca a msg num var
                expect(msg).to.be.equal('Confirm Simples') //assertiva 
            })
    
           // cy.on('window:alert', msg => { //coloca a msg num var
              //  expect(msg).to.be.equal('Confirmado') //assertiva

                cy.get('#prompt').click()
            
            })

            it.only('Validando mensagens', () => {
                const stub = cy.stub().as('alerta')
                cy.on('window:alert', stub)
                cy.get('#formCadastrar').click()
                
            })
    

    })
  