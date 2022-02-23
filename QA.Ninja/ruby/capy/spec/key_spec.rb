describe 'teclado', :key do
    before (:each) do
        visit 'https://training-wheels-protocol.herokuapp.com/key_presses'
    end

    it 'enviando teclas' do

        teclas = %i[tab space escape enter shift control alt] #%i é pra array de simbolos

        teclas.each do |t|
        find('#campo-id').send_keys t #envia teclas simbolos #unico simbolo :enter :tab :alt
        expect(page).to have_content 'You entered: ' + t.to_s.upcase #deve conter o texto na pagina
        sleep 1 
    end

    it 'enviando letras' do

        letras = %w[a s d f g h j k l] #%w é pra array de letras

        letras.each do |l|
        find('#campo-id').send_keys l #envia teclas simbolos #unico simbolo :enter :tab :alt
        expect(page).to have_content 'You entered: ' + l.to_s.upcase #deve conter o texto na pagina
        sleep 1 
    end
end
end

end 