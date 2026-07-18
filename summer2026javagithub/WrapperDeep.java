public class WrapperDeep {
     private int[] a;

    public WrapperDeep() {
        a = new int[3]; // initialize the a variable to have three index slots
    }

    public WrapperDeep(WrapperDeep existingWD) {
        this.a = new int[3]; // allocate space for the copied object

        // Create a new table so we can store these values to the object we want to be copied without having the same memory reference
        for (int index = 0; index < existingWD.a.length; index++) {
            this.a[index] = existingWD.a[index];
        }

    }

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
        return "This deep object has array values of " + a[0] + ", " + a[1] + ", and " + a[2];
    }

     public boolean equals(WrapperDeep otherDeepObject) {
        return this.a == otherDeepObject.a;
    }

}