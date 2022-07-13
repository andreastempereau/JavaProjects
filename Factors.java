import java.util.Scanner;


public class Factors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = 1;
        while (input > 0)
        {
            System.out.print("Input a number you want to know the factors of (Type 0 to quit): ");
            input = scan.nextInt();
            if (input > 0) {
                System.out.print("The factors of " + input + " are:\n\t { ");
                for (int a=1; a<input; a++)
                {
                    if (input%a ==0)
                    {
                        System.out.print(a + ", ");
                    }
                }
            }
            System.out.println(input + " }");
        }
    }

}
