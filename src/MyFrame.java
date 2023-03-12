import javax.swing.*;
import java.awt.*;
//тут я решил по приколу потестить визуализацию
public class MyFrame extends JFrame {
    String action;
     double a = 0;
     double b = 0;
     double c = 0;
    public MyFrame(String action,int a, int b, int c) {
        setTitle("Пример окна");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel;
        switch (action) {
            case "Rectangle" -> {
                panel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.MAGENTA);
                        g.fillRect(100, 100, a, b);
                    }
                };
            }
            case "Sqare" -> {
                panel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.MAGENTA);
                        g.fillRect(100, 100, a, b);
                    }
                };
            }
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
        setContentPane(panel);
    }
}