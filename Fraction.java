public class Fraction {
    private int numer;
    private int denom;

    public Fraction(int numerator, int denominator){
        numer = numerator;
        denom = denominator;
    }

    public int getNumer(){
        return numer;
    }
    public int getDenom(){
        return denom;
    }
    public Fraction add(Fraction f){
        int newNumer = numer*f.getDenom() + f.getNumer() * denom;
        int newDenom = denom*f.getDenom();

        Fraction sum = new Fraction(newNumer, newDenom);
        return sum;
    }
    public Fraction subtract(Fraction f){
        int newNumer = numer*f.getDenom() - f.getNumer() * denom;
        int newDenom = denom*f.getDenom();

        Fraction difference = new Fraction(newNumer, newDenom);
        return difference;
        }
    public Fraction multiply(Fraction f){
        int newNumer = numer*f.getNumer();
        int newDenom = denom*f.getDenom();
        Fraction product = new Fraction(newNumer, newDenom);
        return product;
    }
    public Fraction divide(Fraction f){
        int newNumer = numer*f.getDenom();
        int newDenom = denom*f.getNumer();
        Fraction quotient = new Fraction(newNumer, newDenom);
        return quotient;
    }

    public String toString(){
        return ( numer + "/" + denom );
    }

}
