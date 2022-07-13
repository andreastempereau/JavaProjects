public class PairofDice {
    private int numFacesDie1;
    private int numFacesDie2;
    private int faceValueDie1;
    private int faceValueDie2;

    public PairofDice(int n1, int n2){
        int numFacesDie1 = n1;  
        int numFacesDie2 = n2;
        int faceValueDie1 = 1;
        int faceValueDie2 = 1;
    }
    public PairofDice(){
        int numFacesDie1 = 6;
        int numFacesDie2 = 6;
        int faceValueDie1 = 1;
        int faceValueDie2 = 1;
    }
    public int roll(){
        faceValueDie1 = (int)(6*Math.random() + 1);
        faceValueDie2 = (int)(6*Math.random() + 1);
        int sum = faceValueDie1 + faceValueDie2;
        return sum;
    }
    public String toString(){
        //Construct and return a string representation of the student
           String str;
           str = "Die 1 face value:  " + faceValueDie1 + "\n" +
                 "Die 2 face value:  " + faceValueDie2+ "\n" + 
                 "Sum  " + roll();
           return str;
        }  

}
