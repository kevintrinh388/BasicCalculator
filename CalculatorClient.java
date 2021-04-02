import javax.swing.*;

public class CalculatorClient extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kevin T's Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CalculatorPanel panel = new CalculatorPanel();
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        frame.setSize(800, 600);
    }
}
