import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                1. Circle
                2. Sqare
                3. Rectangle
                4. Triangle
                """);
        String menu = reader.readLine();
        switch (menu){
            case "1" -> {
                Circle circle = new Circle();
                System.out.println("Enter radius");
                circle.setR(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + circle.calculateS());
                System.out.println("P: " + circle.calculateP());

            }
            case "2" -> {
                Sqare sqare = new Sqare();
                System.out.println("Enter side lenght");
                sqare.setA(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + sqare.calculateS());
                System.out.println("P: " + sqare.calculateP());
            }
            case "3" -> {
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter width");
                rectangle.setA(Double.parseDouble(reader.readLine()));
                System.out.println("Enter height");
                rectangle.setB(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + rectangle.calculateS());
                System.out.println("P: " + rectangle.calculateP());
            }
            case "4" -> {
                Triangle triangle = new Triangle();
                System.out.println("Enter 1 side");
                triangle.setA(Double.parseDouble(reader.readLine()));
                System.out.println("Enter 2 side");
                triangle.setB(Double.parseDouble(reader.readLine()));
                System.out.println("Enter 3 side");
                triangle.setC(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + triangle.calculateS());
                System.out.println("P: " + triangle.calculateP());
            }
        }
    }
}
