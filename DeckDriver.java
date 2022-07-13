import java.util.Scanner;
import java.util.ArrayList;
public class DeckDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DeckOfCards newDeck = new DeckOfCards();
        int playerCount;
        int cards;
        while(true){
            System.out.println("How many players??");
            playerCount = in.nextInt();
            System.out.println("How many cards per player??");
            cards = in.nextInt();
            if ((playerCount * cards) <= 52){
                break; 
            }
            else{
                System.out.println("Not enough cards");
            }
        }
        ArrayList<CardArray>[] playerList = new ArrayList[playerCount];
        for (int i = 0; i<playerCount; i++){
            playerList[i] = new ArrayList<CardArray>();
        }
        newDeck.shuffle();
        for(int j = 0; j<cards; j++){
            for (int k = 0; k< playerCount; k++){
                playerList[k].add(newDeck.dealCard());
            }
        }
        for (int x = 0; x<playerCount; x++){
            System.out.println("Player" + (x + 1) + ": " + playerList[x].toString());
        }
    }
}
