public class arraypractice {
   public static void main(String[] args) {
       int[] a = {1, 2, 3, 4};
       int[] b = new int[4];
       for(int i : a){
           i *= 3;
           System.out.println(i);
       }
   } 
}
