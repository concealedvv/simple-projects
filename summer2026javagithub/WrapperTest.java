/*

Ian McGinnis

6/11/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 7 Assignment  
The program is designed for testing shallow and deep copies (S)

*/

//Create two classes WrapperShallow and WrapperDeep

// Create a default constructor that initializes int[] a (gives it a value)

//Implement a setarray method that changes the empty values of the array

// Overide tostring() and equals() methods ( START HERE)

public class WrapperTest {

    public static void main(String[] args) {
        
        WrapperShallow ws1 = new WrapperShallow();
        
        ws1.setArray(9, 5, 4); // sets the values for the table

        String shallowArrayResult = ws1.toString();
        System.out.println("ws1 / " + shallowArrayResult);

        WrapperShallow ws2 = new WrapperShallow(ws1); // these two objects share a integer table variable, a, with the same memory reference (bad)

        String copiedShallowArrayResult = ws2.toString();
        System.out.println("ws2 / " + copiedShallowArrayResult);

        boolean shallowArrayEqualStatus = ws1.equals(ws2);
        System.out.println(shallowArrayEqualStatus);

        if (shallowArrayEqualStatus == true) {
            System.out.println("The two objects are equivalent. ");
        }
        else {
            System.out.println("The two objects are not equivalent");
        }

        WrapperDeep wd1 = new WrapperDeep();
        wd1.setArray(9, 9, 9);

        String deepArrayResult = wd1.toString();
        System.out.println(deepArrayResult);

        WrapperDeep wd2 = new WrapperDeep(wd1);

         String copiedDeepArrayResult = wd2.toString();
        System.out.println(copiedDeepArrayResult);

        boolean deepArrayEqualStatus = ws1.equals(ws2);
        System.out.println(deepArrayEqualStatus);

        if (deepArrayEqualStatus == true) {
            System.out.println("The two objects are equivalent. ");
        }
        else {
            System.out.println("The two objects are not equivalent");
        }
    }
    /*

    Shallow copies are not good because the duplicated copy contains the same memory reference as the calling object, defeating the purpose of creating a new object that is unique and independent.
    Shallow copies can contribute to privacy leaks.

    Deep copies are good because they allow for the equals() method to accurately work, as the memory references will not be the same, allowing for the method to assert the values within the array, a, and not memory references.
    Deep copies assist with avoiding privacy leaks.
     */
}