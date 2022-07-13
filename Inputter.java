import java.util.Scanner;

public class Inputter
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while (input < 1 || input > 100){
            System.out.print("Please input an integer between 1 and 100, inclusive: ");
            input = scan.nextInt();

        }
        System.out.println("You did it!");

    }
}