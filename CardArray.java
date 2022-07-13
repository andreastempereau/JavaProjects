public class CardArray {
    private int[] cardValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private String[] cardSuit = {"C", "D", "H", "S"};
    private int rank;
    private int suitPosition;
    private int cardNumber;
    private String suitValue;

    public CardArray(int r, int suitPos) {
        r = rank;
        suitPos = suitPosition;
        cardNumber = cardValue[r];
        suitValue = cardSuit[suitPos];
    }
    public String getSuitValue(){
        return suitValue;
    }
    public int getCardRank(){
        return cardNumber;
    }
    public String toString(){
        String str = cardNumber + " of " + suitValue;
        return str;
    }

}
