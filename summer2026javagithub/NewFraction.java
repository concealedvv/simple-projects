public class Fraction {
    private double numerator;
    private double denominator;
    private double fraction;

    public Fraction() {
        numerator = 1;
        denominator = 1;
        System.out.println("The value for numerator is " + numerator + " and the value for denominator is " + denominator);
    }

     public Fraction(double num, double denom) {
        numerator = num;
        denominator = denom;
        System.out.println("The value for numerator is " + numerator + " and the value for denominator is " + denominator);
    }

    public void setFraction(double numeratorValue, double denominatorValue) throws DenominatorIsZeroException {
        numerator = numeratorValue;
        denominator = denominatorValue;

        fraction = numerator / denominator;

        if (denominator == 0) {
            throw new DenominatorIsZeroException("You can't divide by zero.");
        }

        else {
            System.out.println("no 0 in the denominator");
        }

    }

    public void setDenominator(double individualDenominator) {
        if (individualDenominator != 0) { // just an extra check (this could probably be removed)
            denominator = individualDenominator;
            System.out.println("The denominator is " + denominator);
        }

        fraction = numerator / denominator; // redefine the fraction after setting the denominator 

        String fractionResult = this.toString();
        System.out.println(fractionResult);
    }

    public String toString() {
        return "The fraction is set to " + fraction;
    }
 
    public double getFraction() {
        return fraction;
    }

}
