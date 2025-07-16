import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerApp extends JFrame {
    private JPanel panel;
    private JButton changeColorButton;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK};
    private int currentColorIndex = 0;

    public ColorChangerApp() {
        setTitle("Color Changer App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen

        panel = new JPanel();
        changeColorButton = new JButton("Change Color");

        // Button click event
        changeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(colors[currentColorIndex]);
                currentColorIndex = (currentColorIndex + 1) % colors.length;
            }
        });

        panel.add(changeColorButton);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChangerApp();
    }
}
