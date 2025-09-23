package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Hello World"));
        frame.setLocationRelativeTo(null);


        JButton button = new JButton("Button");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu!!1");
            }
        });
    }
}
