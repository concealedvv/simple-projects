public class CircleFigure extends BaseShape {
    int radius;

     public CircleFigure() {
        super(0, 0, "none"); // call this line to invoke the number of shapes method
    }

    public CircleFigure(int X, int Y, String name) { // custom constructor that allows players to set their X or Y
        super(X, Y, name);  // call this line to invoke the number of shapes method
        setX(X);
        setY(Y);
        setName(name);
    }

    public void setRadius(int radiusVal) {
        if (radiusVal >= 0) {
             radius = radiusVal;
        }

        else if (radius <= 0) {
            System.out.println("The radius needs to be greater or equal to 0");
        }

    }

    public String toString() {
        return "Drawing a " + this.getName() + " with a radius of " + radius;
    }

     public void draw() {
        center();
        erase();

        System.out.println("Drawing circle centered at " + "(" + this.getX() + "," + this.getY() + ") with a radius of " + radius);
    }

    public void erase() {
        System.out.println("In " + this.getName() + " and erasing");
    }

}
