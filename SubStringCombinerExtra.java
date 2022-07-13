import java.util.Scanner;
public class SubStringCombinerExtra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = new String();
        String word2 = new String();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("Please input a word: ");
        word1 = scan.nextLine();
        System.out.println("Please input a second word: ");
        word2 = scan.nextLine();
        for (a = 0; a < word1.length(); a++) {
            for (b = 0; b <= word2.length(); b++) {
                for (c = a+1; c < word1.length(); c++) {
                    for (d = b+1; d <= word2.length(); d++)
                        System.out.println(word1.substring(a,c) + word2.substring(b,d));
        }
  }
 }
}
}