package figures;

public class Rhombus extends Parallelogram implements Figure{
    public Rhombus(int sideA, int sideB, int angle) {
        super(sideA, sideB, angle);
    }

    @Override
    public double getArea() {
    return (sideA * sideA) * Math.sin(angle);
    }

    @Override
    public String getName() {
        return "\"Ромб\"";
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
