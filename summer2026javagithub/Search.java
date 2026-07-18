public class Search <T extends Comparable<T>> {
    
    // Comparing the index values to assert where to go

    public static <T extends Comparable <T>> int binarySearch(T[] valueArray, int lowIndex, int highIndex, T valueToFind) {

        int lowIndexValue = lowIndex;
        int highIndexValue = highIndex;

        while (lowIndexValue <= highIndexValue) {
            int mid = lowIndexValue + (highIndexValue - lowIndexValue) / 2; 
            System.out.println(lowIndexValue + " is the low index");
            System.out.println(highIndexValue + " is the high index");

            if (valueArray[mid].equals(valueToFind)) {
                return mid;
            }

            else if (valueArray[mid].compareTo(valueToFind) < 0) {
                lowIndexValue = mid + 1;
                System.out.println("low");
            }

            else {
                 System.out.println("high");
                highIndexValue = mid - 1;
            }

        }
         return -1;
    }
 
}