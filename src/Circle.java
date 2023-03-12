import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

public class Circle extends Figure {
    ReaderCallback callback = new ReaderCallbackImp();
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
        return 2 * Math.PI * r;
    }

    void calculate() throws IOException {
        System.out.println("Enter radius");
        setR(Double.parseDouble(callback.read().readLine()));
        System.out.println("S: " + calculateS());
        System.out.println("P: " + calculateP());
    }
}
