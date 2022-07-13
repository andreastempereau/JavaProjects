import java.util.Scanner;
public class SubStringCombiner {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String word1 = new String();
       String word2 = new String();
       int a = 0;
       int b = 0;
       System.out.println("Please input a word: ");
       word1 = scan.nextLine();
       System.out.println("Please input a second word: ");
       word2 = scan.nextLine();
       while (a < word1.length()){
           while (b < word2.length()){
                char x = word1.charAt(a);
                char y = word2.charAt(b);
                String combo1 = String.valueOf(x);
                String combo2 = String.valueOf(y);
                System.out.println(combo1 + combo2);
                b++;
                if (b >= word2.length()){
                    a++;
                    b = 0; }
                if (a >= word1.length()){
                    break; }
           }
       }
   } 
}