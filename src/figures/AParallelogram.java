package figures;

public abstract class AParallelogram {
    int sideA;
    int sideB;
    double angle;


    public AParallelogram(int sideA, int sideB, int angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    abstract String getName();


}
