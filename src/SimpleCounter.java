import javax.swing.*;
import java.awt.*;

public class SimpleCounter {
    private static int count = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame("counting");

        JLabel countLabel = new JLabel("" + count);
        countLabel.setSize(200, 30);

        JButton button = new JButton("Increment");
        button.addActionListener(event -> countLabel.setText("" + (++count)));

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(countLabel);
        container.add(button);

        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
