/*

Ian McGinnis

5/30/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 4 Assignment  
It is a program for defining a class and allowing the code to be accessed out of its scope. CounterClass
 */


/*
1. Set a object in main class and initalize numberCounter to 0
2. Create a method that increments the counter up by 1 (check the value so it doesn't go below zero)
3. Create a method that decrements the counter down by 1 (check the value so it doesn't go below zero)
 */

// TRY AND MAKE IT PROPERLY CHECK FOR EQUALITY AMONG THE TWO NUMBERS (leave off here for when you get back)

public class CounterTest {
   public static void main(String[] args) {

      Counter Counter1 = new Counter();
      Counter Counter2 = new Counter();

      // Defined these variables to pass the name of the Counter Class so that the user knows what counter chnaged value
      final String CounterClass1Name = "CounterClass1";
      final String CounterClass2Name = "CounterClass2";


      Counter1.IncrementCounterUpBy1(CounterClass1Name);
      Counter2.DecrementCounterDownBy1(CounterClass2Name);

      Counter1.DecrementCounterDownBy1(CounterClass2Name);
      Counter2.IncrementCounterUpBy1(CounterClass1Name);
     
      Counter1.SetCustomCounter(1000); // amount of clicks to pass
      Counter2.SetCustomCounter(1000); // amount of clicks to pass
      
      boolean ValidityStatus = Counter1.equals(Counter2);
      if (ValidityStatus == true) {
         System.out.println("The counters are equal");
      }

      else if (ValidityStatus == false) {
         System.out.println("The counters are not equal");
      }

   }
}