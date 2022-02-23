describe 'Caixas de seleção', :checkbox do

    before (:each) do
        visit 'https://training-wheels-protocol.herokuapp.com/checkboxes'
    end


    it 'Marcando uma opção' do #check funciona com name e id
        check('thor')
    end

    it 'Desmarcando uma opção' do #check funciona com name e id 
        uncheck('antman')
    end

    it 'Marcando com find set true' do
        find('input[value=cap]').set(true)
    end

    it 'Desmarcando com find set false' do
        find('input[value=guardians]').set(false)
    end

    after (:each) do
        sleep 3
    end


end