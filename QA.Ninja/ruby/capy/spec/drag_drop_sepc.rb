describe 'Drag and Drop', :drop do

    before(:each) do
        visit 'https://training-wheels-protocol.herokuapp.com/drag_and_drop'
    end

    it 'homem aranha pertence ao time do Stark' do

        stark = find('.team-stark .column')

        spiderman = find('img[alt$=Aranha]')

        spiderman.drag_to stark

        sleep 3 
    end


end
