import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.getContentPane().add(new JButton("OK"));
        frame.setVisible(true);

    }
}