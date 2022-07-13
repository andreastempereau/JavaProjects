import java.util.Scanner;
public class nickname {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your first name: ");
       String fname = scan.nextLine();
       System.out.println("Enter your last name: ");
       String lname = scan.nextLine();
       String str1 = new String(fname);
       String str2 = new String(lname);
       char n1 = str1.charAt(0);
       char n2 = str2.charAt(0);
       char n3 = str2.charAt(1);
       char n4 = str2.charAt(2);
       char n5 = str2.charAt(3);
       String str = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4) + String.valueOf(n5);
       System.out.println(str);
   } 
}
