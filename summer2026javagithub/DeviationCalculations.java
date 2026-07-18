
import java.util.ArrayList;
public class DeviationCalculations <T extends Number> {
    
    public static <T extends Number> double CalculateAverage(T[] numberTable) {

        double TotalOfTable = 0;
        int numberOfTable = 0;

        for (T value: numberTable) {
            TotalOfTable += value.doubleValue(); // calling int value since the two types have to be a int and double.
            numberOfTable += 1;
        }

         double average = TotalOfTable / numberOfTable;

         System.out.println("THe average is " + average);
        
        return average;
    }


    public static <T extends Number> double CalculateStandardDeviation (ArrayList <T> standardDeviationArray, double average) {
        ArrayList <T> stdDifferences = new ArrayList <>();
        double totalVariance = 0;

        for (T value: standardDeviationArray) {

            double difference = Math.pow((value.doubleValue() - average), 2); // squaring itself
            System.out.println("The difference for this sample is " + difference);
            stdDifferences.add(value); // add the individual difference to the table above
            totalVariance += value.doubleValue(); // add to the total to later take its square root
        }

        System.out.println(stdDifferences);

        double stdDeviation = Math.sqrt(totalVariance); // std deviation is the square root of total variation

        return stdDeviation;
    }

}
