package figures;

public class Circle extends AParallelogram implements Figure{
   int radius;

    public Circle(int sideA, int sideB, int angle, int radius) {
        super(sideA, sideB, angle);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pi = Math.PI;
        return radius * radius * pi;
    }

    @Override
    String getName() {
        return "\"Круг\"";
    }

    @Override
    public void showInfo() {
        String sm = " см кв \n";
        System.out.println("Название фигуры: " + getName());
        System.out.printf("Площадь: " + getArea() + sm);
        System.out.println();
    }
}
