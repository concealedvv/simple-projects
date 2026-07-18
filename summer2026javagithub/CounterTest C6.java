/*
Ian McGinnis

6/27/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Assignment 6

This program is for implementing and planning out a UML Diagram for a counter that implements once a second towards a given time
*/

/*
UML DIAGRAM FOR ENTIRE PROGRAM

-----------------------------------------------------------------------------------------------------

CounterTest(): void

Declare integer values to pass to the CounterController class
CounterController countController = new CounterController();

int startTimeValue: int;
int endTimeValue: int;

// make sure that the endTime is not less than startTime;

countController.CounterModel();

------------------------------------------------------------------------------------------------------

CounterModel(): void

private int startTime = startTimeValue;
private int endTime = endTimeValue;

while (startTime <= endTime) {

startTime += 1
Thread.sleep(1000);
this.CounterView(startTime, endTime);

}

------------------------------------------------------------------------------------

CounterView(int startTime, int endTime): void
    System.out.println("The count is currently at " + startTime + " seconds to " + endTime + " seconds");
 */

public class CounterTest {
    public static void main(String[] args) throws InterruptedException {

        CounterController countController = new CounterController();

        double startTimeValue = 100;
        double endTimeValue = 10;

        countController.CounterModel(startTimeValue, endTimeValue);

    }
}
