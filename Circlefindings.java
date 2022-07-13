import java.util.Scanner;

public class Circlefindings{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a radius: ");
        double input = scan.nextDouble();
        double inputSquared = input * input;
        double inputCubed = inputSquared * input;
        double circumference = 2*3.14*input;
        double surfaceArea = 4*3.14*inputSquared;
        double volume = 4/3*3.14*inputCubed;
        System.out.println("The diameter is: " + input*2);
        System.out.println("The circumference is: " + circumference);
        System.out.println("The surface area is: " + surfaceArea);
        System.out.println("The volume is: " + volume);
    }
}