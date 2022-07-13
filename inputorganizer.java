import java.util.Scanner;

public class inputorganizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input an integer");
        int input = scan.nextInt();
        while (input>0){
            System.out.println(input%10);
            input /= 10;
        } 
    }
}
