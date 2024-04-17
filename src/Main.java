import figures.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 0, 10);
        Parallelogram parallelogram = new Parallelogram(10, 20, 30);
        Parallelogram rectangle = new Rectangle(5, 4, 90);
        Parallelogram rhombus = new Rhombus(10, 0, 120);
        Rectangle square = new Square(6, 0, 90);

        circle.showInfo();
        parallelogram.showInfo();
        rectangle.showInfo();
        rhombus.showInfo();
        square.showInfo();


    }
}