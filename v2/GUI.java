package v2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();
        JTextField tf = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JButton button = new JButton("Ausrechnen");

        String[] rechnzeichn = {"Subtraktion", "Addtion", "Multiplication", "Division"};
        JComboBox<String> cb = new JComboBox<>(rechnzeichn);

        tf.setBorder(BorderFactory.createLineBorder(Color.black));
        tf2.setBorder(BorderFactory.createLineBorder(Color.black));

        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);

        c.gridx = 0; // erste Spalte
        c.gridy = 0; // erste Zeile
        frame.add(tf, c);

        c.gridx = 1;
        c.gridy = 0;
        frame.add(cb, c);

        c.gridx = 2; // zweite Spalte
        c.gridy = 0; //erste Zeile
        frame.add(tf2, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3; // über wie viele Spalten es sich erstreckt
        frame.add(button, c);

        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("TaschenRechner - GUI");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double i = Integer.parseInt(tf.getText());
                double j = Integer.parseInt(tf2.getText());
                String operation = (String) cb.getSelectedItem();
                double ergebnis = i + j;

                switch(operation) {
                    case "Subtraction":
                        ergebnis = i - j;
                        break;
                    case "Addition":
                        ergebnis = i + j;
                        break;
                    case "Multiplication":
                        ergebnis = i * j;
                        break;
                    case "Division":
                        ergebnis = i / j;
                        break;
                }

                JOptionPane.showMessageDialog(frame,"Ergebnis: " +ergebnis );
            }
        });
    }
}
