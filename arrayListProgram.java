import java.util.ArrayList;
import java.util.Collections;

public class arrayListProgram {
    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList<>();

        double LoanObject = 10000.00;
        String DateObject = "2024-06-01";
        String greeting = "Hello, World!";
        double CircleObject = 3.14;

        list.add(LoanObject);
        list.add(DateObject);
        list.add(CircleObject);
        list.add(greeting);

        for (Object obj: list) {
            System.out.println(obj.toString());
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}