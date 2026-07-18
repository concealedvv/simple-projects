/*
Ian McGinnis

6/26/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Assignment 6

This program is for actually solving the towers
*/

public class SolvingTowers {

    public static void solvingProcess(int number, char startRod, char otherRod, char toRod) {

        if (number == 0) {
            return;
        }

        solvingProcess(number - 1, startRod, toRod, otherRod);
        System.out.println("Disk " + number + " moved from " + startRod + " to " + toRod);
        solvingProcess(number - 1, otherRod, startRod, toRod);
    }

}