public class DeckofCardsArray {
    private CardArray[] deck = new CardArray[52];
    private Boolean[] isDealt = new Boolean[52];
    private CardArray[] shuffleDeck = new CardArray[52];
    private int nextCard = 0;
    public DeckofCardsArray(){
        String str = " ";
        for (int x = 0; x < 4; x++){
            if (x==0) str = "Clubs";
            if (x==1) str = "Diamonds";
            if (x==2) str = "Hearts";
            if (x==3) str = "Spades";

            for (int z = 2; z<=14; z++){
                deck[x*13 + (z-2)] = new CardArray(z, x);
                isDealt[x*13 + (z-2)] = false;

            }
        }
    }
    public void shuffle(){
        int sIndex = 0;
        int randLocation = 0;
        boolean loop = true;
        for (int cardCount = 0; cardCount<52; cardCount++){
            loop = true;
            while (loop){
                randLocation = (int)(Math.random()+52);
                if (isDealt[randLocation] == false) loop = false;
            }
            shuffleDeck[sIndex] = deck[randLocation];
            sIndex++;
            isDealt[randLocation]=true;
        }
        deck=shuffleDeck;
        for (int a = 0; a<52; a++){
            isDealt[a] = false;
        }
        nextCard = 0;
    }
}
