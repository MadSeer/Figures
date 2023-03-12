import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends Figure {
    ReaderCallback callback = new ReaderCallbackImp();

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

    @Override
    void calculate() throws IOException {
        System.out.println("Enter width");
        setA(Double.parseDouble(callback.read().readLine()));
        System.out.println("Enter height");
        setB(Double.parseDouble(callback.read().readLine()));
        System.out.println("S: " + calculateS());
        System.out.println("P: " + calculateP());
    }
}
