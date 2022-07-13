import java.util.Scanner;

public class Die{
    private int numFaces; //how many faces are on the die
    private int faceValue;

    public Die(int n){
        int numFaces = n;
        int faceValue = 1;
    }
    public Die(){
        int numFaces = 6;
        int faceValue = 1;
    }
    public int roll(){
        faceValue = (int)(6*Math.random() + 1);
        return faceValue;
    }
    public int getfaceValue(){
        return faceValue;
    }
}

