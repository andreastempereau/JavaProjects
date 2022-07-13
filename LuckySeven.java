import java.util.Random;
public class LuckySeven {
   public static void main(String[] args) {
       Random rnd = new Random();
       int faceValue1 = 1;
       int faceValue2 = 1;
       int sum;
       double count = 0;
       for(int a = 1; a<=100; a++){
           faceValue1 = rnd.nextInt(6) + 1;
           faceValue2 = rnd.nextInt(6) + 1;
           sum = faceValue1 + faceValue2;
           if (sum == 7){
               count++;
           }
       }
       double percent = count/100;
       System.out.println("You rolled 7s " + count + " times");
       System.out.println("This is " + percent + " percent as a decimal");
       
   } 
}
