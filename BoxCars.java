import java.util.Scanner;

public class BoxCars {
    public static void main(String[] args) {
        int numRolls = 1;
        PairofDice Dice = new PairofDice();
        Scanner scan = new Scanner(System.in);
        while (numRolls>0){
            System.out.println("How many rolls?");
            numRolls = scan.nextInt();
            int returnValue = 0;
            for(int a=1; a<=numRolls; a++){
                Dice.roll();
                if (Dice.roll() == 12){
                    returnValue++;
                }
            }
            if (returnValue > 0){
                System.out.println("You rolled boxcars " + returnValue + " times");
                System.out.println("The percent is " + (returnValue/numRolls)*100 + " %");
            }
            else System.out.println("You rolled boxcars zero times");
        }
    }
}