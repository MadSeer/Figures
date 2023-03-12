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
                SwingUtilities.invokeLater(() -> {
                    MyFrame frame = new MyFrame("Circle",
                            Math.toIntExact(Math.round(circle.getR())), 0, 0);
                    frame.setVisible(true);
                });
            }
            case "2" -> {
                Sqare sqare = new Sqare();
                System.out.println("Enter side lenght");
                sqare.setA(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + sqare.calculateS());
                System.out.println("P: " + sqare.calculateP());
                SwingUtilities.invokeLater(() -> {
                    MyFrame frame = new MyFrame("Sqare",
                            Math.toIntExact(Math.round(sqare.getA())), 0, 0);
                    frame.setVisible(true);
                });
            }
            case "3" -> {
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter width");
                rectangle.setA(Double.parseDouble(reader.readLine()));
                System.out.println("Enter height");
                rectangle.setB(Double.parseDouble(reader.readLine()));
                System.out.println("S: " + rectangle.calculateS());
                System.out.println("P: " + rectangle.calculateP());
                SwingUtilities.invokeLater(() -> {
                    MyFrame frame = new MyFrame("Rectangle",
                            Math.toIntExact(Math.round(rectangle.getA())),
                            Math.toIntExact(Math.round(rectangle.getB())), 0);
                    frame.setVisible(true);
                });
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
