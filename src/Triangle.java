import static java.lang.Math.sqrt;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    @Override
    double calculateS() {
        double p = calculateP()/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double calculateP() {
        return (this.a+this.b+this.c);
    }
}
