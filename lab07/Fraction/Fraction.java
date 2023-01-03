
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = Math.abs(numerator);
        this.numerator *= (numerator * denominator >= 0) ? 1 : -1;
        this.denominator = Math.abs(denominator);
    }
    public Fraction add(Fraction other){//other once you instantiate it, it is going to have two values
        int numerator = this.getNumerator()*other.getDenominator() + other.getNumerator()*this.getDenominator();
        int denominator = this.getDenominator()*other.getDenominator();
        Fraction sum = this.simplify(numerator,denominator);
        return sum;
    }
    public Fraction subtract(Fraction other){
        int numerator = this.getNumerator()*other.getDenominator() - other.getNumerator()*this.getDenominator();
        int denominator = this.getDenominator() * other.getDenominator();
        Fraction difference = this.simplify(numerator,denominator);
        return difference;
    }
    public Fraction multiply(Fraction other) {
        int numerator = this.getNumerator() * other.getNumerator();
        int denominator = this.getDenominator() * other.getDenominator();
        Fraction product = this.simplify(numerator, denominator);
        return product;
    }

    public Fraction divide(Fraction other) {
        int numerator =this.getNumerator() * other.getDenominator();
        int denominator = this.getDenominator() * other.getNumerator();
        Fraction dividend = this.simplify(numerator,denominator);
        return dividend;
    }
    public String toString(){
        return String.format("(%d/%d)",numerator,denominator);
    }
    public Fraction simplify(int numerator,int denominator){
        int temp=denominator;
        while(temp>0){
            if(numerator % temp==0 && denominator% temp==0){
                numerator/=temp; //  4/4 1--> temp 3 1/3
                denominator/=temp;// 8/4 2
            }temp--;}
        return new Fraction(numerator,denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
