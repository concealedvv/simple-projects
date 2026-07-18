public abstract class BaseShape {
    private int X, Y; // the center of the object.
    private String name;
    private static int numberOfShapes = 0;

    public BaseShape() {
        X = 0;
        Y = 0;
        name = "none";
    }

    public BaseShape(int a, int b, String n) {
        setX(a);
        setY(b);
        setName(n);
        numberOfShapes++;
    }

    public void setX(int Xvalue) {
        X = Xvalue;
    }

    public void setY(int Yvalue) {
        Y = Yvalue;
    }

    public void setName(String nameValue) {
        name = nameValue;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfShapes() {
        return numberOfShapes;
    }

    public abstract void erase();

    public abstract void draw();

    public void center() {
        System.out.println("In Figure. Centering at (" + getX() + "," + getY() + ")");
    }

}
