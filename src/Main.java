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
                circle.calculate();
            }
            case "2" -> {
                Sqare sqare = new Sqare();
                sqare.calculate();
            }
            case "3" -> {
                Rectangle rectangle = new Rectangle();
                rectangle.calculate();
            }
            case "4" -> {
                Triangle triangle = new Triangle();
                triangle.calculate();
            }
        }
    }
}
