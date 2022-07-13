public class project77 {
   public static void main(String[] args) {
       int a = 10;
       int b = 1;
       while (b<10){
           int perimeter = (2 * b) + (2 * b);
           System.out.println("Area\tPerimeter");
           System.out.println(a * b + "\t"+ perimeter);
           b++;
           a--;
       }
   } 
}
