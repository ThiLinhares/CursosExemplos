describe('Cadastro', () => {
    it('Usuario deve ser tornar um entregador', () => {
        cy.viewport(1440, 900)
        cy.visit('https://buger-eats.vercel.app')
        cy.get('#page-home div main h1').should('have.text', 'Seja um parceiro entregador pela Buger Eats')
    
        cy.get('a[href="/deliver"]').click() 
        cy.get('#page-deliver form h1').should('have.text', 'Cadastre-se para  fazer entregas')
  
    
    
        var entregador = {
            nome: 'Thiago Linhares',
            cpf: '00000014141',
            email: 'email@teste.com',
            whatsapp: '85996377667',
            endereco: {
                cep: '04534011',
                rua: ' Rua Joaquim Floriano',
                numero: '1000',
                complemento: 'Ap 142',
                bairro: 'Itaim Bibi',
                cidade_uf: "São Paulo/SP"
            }
        }

        cy.get('input[name="name"]').type(entregador.nome)
        cy.get('input[name="cpf"]').type(entregador.cpf)
        cy.get('input[name="email"]').type(entregador.email)
        cy.get('input[name="whatsapp"]').type(entregador.whatsapp)

        cy.get('input[name="postalcode"]').type(entregador.endereco.cep)
        cy.get('input[type="button"][value="Buscar CEP"]').click()

        cy.get('input[name="address-number"]').type(entregador.endereco.numero)
        cy.get('input[name="address-details"]').type(entregador.endereco.complemento)


        
        
        


    
    
    
    });
});