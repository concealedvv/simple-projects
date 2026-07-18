public class CounterController {

    private double startTime;
    private double endTime;

    public CounterController() {
        startTime = 0;
        endTime = 0;
        System.out.println("initalized startTime and endTime values");
    }

    public void CounterModel(double startTimeValue, double endTimeValue) throws InterruptedException {
        startTime = startTimeValue;
        endTime = endTimeValue;

        // startTime is less than endTime, therefore the startTime will increment
        if (startTime < endTime) {
            while (startTime < endTime) {
                startTime += 1;
                Thread.sleep(1000);
                DisplayCounterView.CounterView(startTime, endTime);
            }
        }

        // startTime is higher than endTime, therefore the startTime will decrement
        else if (startTime > endTime) {
            while (startTime > endTime) {
                startTime -= 1;
                Thread.sleep(1000);
                DisplayCounterView.CounterView(startTime, endTime);
            }
        }

    }

}
