public class DisplayCounterView {

    public static void CounterView(double startTime, double endTime) {
        System.out.println("The startCount is currently at " + startTime + " seconds and the endCount is at " + endTime + " seconds");
        
        if (startTime == endTime) {
            System.out.println("Successfully finished");
        }
            
    }

}