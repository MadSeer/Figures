import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    @Override
    void calculate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side lenght");
        setA(Double.parseDouble(reader.readLine()));
        System.out.println("S: " + calculateS());
        System.out.println("P: " + calculateP());
    }


}
