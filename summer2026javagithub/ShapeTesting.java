/*

Ian McGinnis

6/18/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 8 Assignment  
This program is for testing polymorphism with shapes and derived classes

*/

public class ShapeTesting {
    public static void main(String[] args) {
        
        RectangleFigure rectangle = new RectangleFigure();
        CircleFigure circle = new CircleFigure();

        BaseShape[] shapes = {rectangle, circle}; // Declaring array by grouping all derived classes of BaseShape class in one
        
        //Polymorphism is achieved here as the derived classes identify as both a BaseShape index and also their own standalone type

        rectangle.setName("Rectangle");
        rectangle.setX(5);
        rectangle.setY(9);

        rectangle.setLength(2);
        rectangle.setHeight(9);

        String rectangleResult = rectangle.toString();
        System.out.println(rectangleResult);

        System.out.println(); // used to create space between the output for the rectangle and circle

        circle.setName("Circle");
        circle.setX(30);
        circle.setY(1);

        circle.setRadius(5);

        String circleResult = circle.toString();
        System.out.println(circleResult);

        for (BaseShape shape : shapes) {
            shape.draw(); // call the draw method in each class in a more clean way
        }


    }
}
