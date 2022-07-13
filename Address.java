public class Address {
   private static int street;
   private static int number;
   public Address(int s, int n){
       street = s; number = n;
   }
   public String toString(){
       String s = ("" + number + " " + street + "st \t");
       return s;
   }
   public static void main(String[] args) {
       number = 50;
       int numberOdd = 51;
       street = 100;
       Address[][] town = new Address[6][5];
       for(int i = 0; i < town.length; i++){
           for(int j = 0; j < town[0].length; j++){
               if(i%2 == 0){
                   town[i][j] = new Address(street, number);
                   number +=4;
               }
               if(i%2 != 0){
                   town[i][j] = new Address(street, numberOdd);
                   numberOdd +=4;
               }
            }
            street++;
            number = 50;
            numberOdd = 51;
       }
       for (int i = 0; i<6; i++){
           for(int j = 0; j<5; j++){
               System.out.print(town[i][j].toString());
           }
           System.out.println("");
       }
   }
}
