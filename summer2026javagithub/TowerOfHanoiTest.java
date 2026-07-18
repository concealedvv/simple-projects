/*
Ian McGinnis

6/26/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Assignment 6

This program is for managing the Tower Of Hanoi algorithm
*/

//Get the number of disks n = 3
//Move the highest disk to the 

public class TowerOfHanoiTest {
    
    public static void main(String[] args) {
        int numberOfDisks = 3; // the amount of disks

        SolvingTowers.solvingProcess(numberOfDisks, 'A', 'B', 'C');
    }

}