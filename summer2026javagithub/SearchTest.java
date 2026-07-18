/*
Ian McGinnis
7/4/26
26SU Obj-Orient Prog 1/Java (CIT-130-Z01)
Assignment 6
It is a program for conducting a generic binary search

// Create variables to set up binarySearch 
//Set middle value from start and end index
// Return middle if it matches the value user is looking for
//
 */

public class SearchTest {
    
     public static void main(String[] args) {
        System.out.println("Solving a generic binary search");

        Integer IntegerArray[] = {1, 2, 3, 4 ,5, 6};
        int integerStartIndex = 0;
        int integerEndIndex = IntegerArray.length - 1;
        Integer integerToFind = 9;

        int integerIndex = Search.<Integer>binarySearch(IntegerArray, integerStartIndex, integerEndIndex, integerToFind);

        if (integerIndex != -1 ) {
            System.out.println( integerIndex + " is the index of " + integerToFind);
        }
        else {
            System.out.println(integerToFind + " is not present");
        }

        // String part
        // FIX ONE OFF ERROR

        String StringArray[] = {"a", "b", "c", "d", "z"};
        int stringStartIndex = 0;
        int stringEndIndex = StringArray.length - 1;
        String stringValueToFind = "j";

        int stringIndex = Search.<String> binarySearch(StringArray, stringStartIndex, stringEndIndex, stringValueToFind);

        if (stringIndex != -1) {
            System.out.println(stringIndex + " is the index of " + stringValueToFind);
        }
        else {
            System.out.println(stringValueToFind + " is not present");
        }

    }

}