import java.util.Scanner;
import java.util.Random;
public class guesswhat {
    public static void main(String[] args) {
        String response = "Start";
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int actual = 1;
        while (response.contains("Start")){
            actual = rnd.nextInt(10) + 1;
            System.out.print("Enter your guess");
            int guess = scan.nextInt();
            if (guess == actual){
                System.out.println("Yay you got it. Game over");
                System.out.print("Enter this game sucks to quit or Yay to continue");
            }
            if (guess != actual){
                System.out.print("Wrong. You suck");
                System.out.print("Enter this game sucks to quit or Yay to continue");
                response = scan.nextLine();
            }
            
            
        }

    }
}
