import static java.lang.Math.pow;

public class Sqare extends Figure {
    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    @Override
    double calculateS() {
        return pow(a, 2);
    }

    @Override
    double calculateP() {
        return a * 4;
    }
}
