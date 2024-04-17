package figures;

public class Square extends Rectangle implements Figure{

    public Square(int sideA, int sideB, int angle) {
        super(sideA, sideB, angle);
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public String getName() {
        return "\"Квадрат\"";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
