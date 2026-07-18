import java.util.ArrayList;

public class StandardDevTest {
    public static void main(String[] args) {

       Integer intArray[] = {1, 2, 3, 4};

       double intAverage = DeviationCalculations.<Integer>CalculateAverage(intArray);

       ArrayList <Integer> integerStandardDeviationTable = new ArrayList<> ();

       for (Integer value: intArray) {
        integerStandardDeviationTable.add(value);
       } // copying values to standardDeviationTables


      double intStdDeviation = DeviationCalculations.<Integer> CalculateStandardDeviation(integerStandardDeviationTable, intAverage);

      System.out.println(intStdDeviation + " is the std deviation");

       // double part

      Double doubleArray[] = {2.0, 4.0, 6.0, 30.0, 40.0};

       double doubleAverage = DeviationCalculations.<Double>CalculateAverage(doubleArray);
       
       ArrayList <Double> doubleStandardDeviationTable = new ArrayList<>();

       for (Double value: doubleArray) {
        doubleStandardDeviationTable.add(value);
       }

       double doubleStdDeviation = DeviationCalculations.<Double>CalculateStandardDeviation(doubleStandardDeviationTable, doubleAverage);
       System.out.println(doubleStdDeviation + " is the std deviation");

    }

}
