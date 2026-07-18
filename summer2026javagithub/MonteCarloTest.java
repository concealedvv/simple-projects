import java.util.HashSet;

public class MonteCarloTest {
    public static void main(String[] args) {
        // P = collisons / number of people
        

        int numberCollisions = 0; // number of shared birthdays
        int numberOfPeople = 16;
        int testNum = 100;

        double probability; // defined later

        for (int indexTest = 0; indexTest < testNum; indexTest++) { // runs the tests
            HashSet<Integer> birthdayHashSet = new HashSet<>();

            for (int indexPeople = 0; indexPeople < numberOfPeople; indexPeople++) { // runs for the amount of people
                int randomNum = MonteCarloCalculations.CalculateRandomBirthday(1, 365);
                if (!birthdayHashSet.contains(randomNum)) {
                    birthdayHashSet.add(randomNum); // add the random number if it's not already in the hash set
                } else {
                    numberCollisions += 1; // a birthday was picked again and people share one
                    //break; i am not sure if this is needed
                }
            }
        }

        probability = (double) numberCollisions / testNum; // type casted the numberCollisions so it doesn't do integer division

        System.out.println("After " + testNum + " tests, there were " + numberCollisions + " occurences of people sharing the same birthday with a probability of " + probability);
    }
}