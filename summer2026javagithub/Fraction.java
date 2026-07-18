public class FractionClass {
    private double numerator;
    private double denominator;
    private double fraction;

    public FractionClass() {
        numerator = 0;
        denominator = 1; // i am going to initialize the denominator as 1 instead of 0, so there is not a divide by zero error
    }

    public double SolveFraction(double numeratorValue, double denominatorValue) {
        numerator = numeratorValue;
        denominator = denominatorValue;

        fraction = numerator / denominator;
        
        System.out.println(fraction);
        return fraction;
    }

    public String toString() {
    return "The fraction with the given numerator and denominator is " + (int) numerator + " / " + (int) denominator + " or " + fraction;
    }

    public double getFraction() {
        return fraction;
    }

    //Place equals() method here
    public boolean equals(FractionClass otherCounter) {
        return this.numerator * otherCounter.denominator == otherCounter.numerator * this.denominator;
    }
    
}