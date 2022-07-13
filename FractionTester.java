public class FractionTester{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 3);

        System.out.println(f1.add(f2).toString());
        System.out.println(f1.subtract(f2).toString());
        System.out.println(f1.multiply(f2).toString());
        System.out.println(f1.divide(f2).toString()); 
    }
}
