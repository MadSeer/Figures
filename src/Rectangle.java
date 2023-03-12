public class Rectangle extends Figure {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }


    @Override
    double calculateS() {
        return this.a * this.b;
    }

    @Override
    double calculateP() {
        return ((this.a*2)+(this.b*2));
    }
}
