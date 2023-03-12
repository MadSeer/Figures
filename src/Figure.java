import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Figure {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double s;
    double p;

    abstract double calculateS();

    abstract double calculateP();

    abstract void calculate() throws IOException;
}
