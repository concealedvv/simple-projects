public class WrapperShallow {
    private int[] a;

    public WrapperShallow() { // default constructor
        a = new int[3]; // initialize the a variable to have three index slots
    }

     public WrapperShallow(WrapperShallow existingWS) { // shallow copy constructor
        a = existingWS.a; 
    }

    // how can I make this more efficient than using many if statements? I was thinking of using a dictonary but we have not learned that
    // i don't like hardcoding this :(
    public void setArray(int firstIndice, int secondIndice, int thirdIndice) {
        for (int index = 0; index < a.length; index++) {
        switch (index) {
            case 0: a[index] = firstIndice; // first indice (starts at 0)
            break;

            case 1: a[index] = secondIndice; // second indice
            break;

            case 2: a[index] = thirdIndice; // third indice
            break;
           } // I am pretty sure I did this correctly. I initially didn't include any break statements, but I seen that all values would take the value of the thirdIndice (not good)
        }
        // more efficient than this 
        /*
        if (index == 0) {
                a[index] = firstIndice;
            }
            else if (index == 1) {
                a[index] = secondIndice;
            }
            else if (index == 2) {
                a[index] = thirdIndice;
            } */
    }

    public String toString() {
        return "This shallow object has array values of " + a[0] + ", " + a[1] + ", and " + a[2];
    }

    public boolean equals(WrapperShallow otherShallowObject) {
        return this.a == otherShallowObject.a;
    }

}