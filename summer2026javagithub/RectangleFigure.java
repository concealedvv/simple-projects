public class RectangleFigure extends BaseShape {

    private int length;
    private int height;

    public RectangleFigure() {
        super(0, 0, "none"); // call this line to invoke the number of shapes method
        length = 0;
        height = 0;
    }

    public RectangleFigure(int X, int Y, String name) { // custom constructor that allows players to set their X or Y
        super(X, Y, name);  // call this line to invoke the number of shapes method
        setX(X);
        setY(Y);
        setName(name);
    }

    public void setLength(int lengthVal) {
        if (lengthVal >= 0) {
             length = lengthVal;
        }

        else if (lengthVal <= 0) {
            System.out.println("The length needs to be greater or equal to 0");
        }

    }

    public void setHeight(int heightVal) {
        if (heightVal >= 0) {
             height = heightVal;
        }

        else if (heightVal <= 0) {
            System.out.println("The height needs to be greater or equal to 0");
        }

    }



    public String toString() {
        return "The " + this.getName() + " has a length of " + this.length + " and a height of " + this.height;
    }

    public void draw() {
        center();
        erase();

        System.out.println("Drawing rectangle centered at " + "(" + this.getX() + "," + this.getY() + ") with a length of " + length + " and a height of " + height);
    }

    public void erase() {
        System.out.println("In " + this.getName() + " and erasing");
    }

}
