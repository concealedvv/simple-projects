import java.util.Random;

public class MonteCarloCalculations {
    

    public static int CalculateRandomBirthday(int minNum, int maxNum) {
        Random random = new Random();

        int randomNum = random.nextInt(minNum, maxNum + 1); // includes the max value
        System.out.println(randomNum + " is the random number");
        return randomNum;
    }

}