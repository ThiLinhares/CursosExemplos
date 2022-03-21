/// <reference types="cypress" />

describe ('Helpers', () => {
    it('Wrap', () => {
        const obj = {nome: 'User', idade: 28}
        expect(obj).to.have.property('nome')
    })
})