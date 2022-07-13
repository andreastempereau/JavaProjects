import java.util.Scanner;
public class project78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        String [] arr = new String[sentence.length()];
        arr = sentence.split(" ");
        System.out.println("There are "+arr.length+" words in the sentence.");
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count += arr[i].length();
        }
        System.out.println("The average length of a word in your sentence is "+(count/arr.length)+" characters");
        count = 0;
        System.out.println("Your sentence is "+sentence.length()+" characters long."); 
    }
    
}
