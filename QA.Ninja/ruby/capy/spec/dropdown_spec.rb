describe 'Caixa de opções', :dropdown do

    it 'Item especifico simples' do  #exclusivamente pra id
        visit 'https://training-wheels-protocol.herokuapp.com/dropdown'
        select('Loki', from: 'dropdown') 
        sleep 3
    
    end

    it 'Item especifico com find' do
        visit 'https://training-wheels-protocol.herokuapp.com/dropdown'
        drop = find('.avenger-list')
        drop.find('option', text: 'Scott Lang').select_option   
        sleep 3

    end

    it 'Qualquer item', :sample do #sorteia uma opção aleatoriamente 
        visit 'https://training-wheels-protocol.herokuapp.com/dropdown'
        drop = find('.avenger-list')
        drop.all('option').sample.select_option 
        sleep 3
    end

end

