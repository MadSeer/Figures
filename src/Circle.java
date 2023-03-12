import static java.lang.Math.pow;

public class Circle extends Figure {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    @Override
    double calculateS() {
        this.s = Math.PI * pow(this.r, 2);
        return this.s;
    }

    @Override
    double calculateP() {
        return  2 * Math.PI * r;
    }
}
