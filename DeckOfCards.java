import java.util.ArrayList;
public class DeckOfCards {
    private ArrayList<CardArray> myDeck = new ArrayList<CardArray>();
    public DeckOfCards(){
        for(int i = 0; i<4; i++){
            for (int j = 0; j<14; j++){
                myDeck.add(new CardArray(j, i));
            }
        }
    }
    public void shuffle(){
        ArrayList<CardArray> temp = new ArrayList<CardArray>();
        for (int x = 0; x<52; x++){
            int index = (int) (Math.random() * myDeck.size());
            CardArray removedCard = myDeck.remove(index);
            myDeck.add(removedCard);
        }
        myDeck = temp;
    }
    public CardArray dealCard(){
        CardArray tempCard = myDeck.get(0);
        myDeck.remove(0);
        return tempCard;
    }

}
