package figures;


public class Parallelogram extends AParallelogram implements Figure {

    public Parallelogram(int sideA, int sideB, int angle) {
        super(sideA, sideB, angle);
    }

    @Override
    public double getArea() {
        double angleInRadians = Math.toRadians(angle);
        return sideA * sideB * Math.sin(angleInRadians);
    }

    @Override
    String getName() {
        return "\"Параллелограм\"";
    }

    @Override
    public void showInfo() {
        String sm = " см кв \n";
        System.out.println("Название фигуры: " + getName());
        System.out.printf("Площадь: " + getArea() + sm);
        System.out.println();
    }
}
