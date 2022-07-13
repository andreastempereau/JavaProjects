public class blackjack {
    private int players;
    private int[] cardValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private String[] cardSuit = {"C", "D", "H", "S"};
    private int rank;
    private int suitPosition;
    private int cardNumber;
    private String suitValue;
    DeckOfCards d = new DeckOfCards();
    public blackjack(int numPlayers){
        players = numPlayers;
    }
    public String play(){
        d.dealCard();
        return d.toString();
    }
    public static void main(String[] args) {
        blackjack testGame = new blackjack(2);
        System.out.print(testGame.play());
    }

}
