package figures;

public class Rectangle extends Parallelogram implements Figure{
    public Rectangle(int sideA, int sideB, int angle) {
        super(sideA, sideB, angle);
    }

    @Override
    public double getArea() {
        return 2 * ( sideA + sideB);
    }

    @Override
    public String getName() {
        return "\"Прямоугольник\"";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
