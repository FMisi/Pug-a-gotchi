package pugagotchi;

import java.awt.*;
import javax.swing.*;

public class Tulajdonosneve {
    JFrame frame = new JFrame("Mi a neved?");
    JPanel panel = new JPanel(new GridLayout(2,2));
    JTextField szovegMezo = new JTextField();
    JButton gomb = new JButton("OK");
    JLabel label = new JLabel("");
    
    public Tulajdonosneve() {
        if(!Handler.tulnev.equals("Tulnev")){
            frame.setVisible(false);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gomb.addActionListener(e -> {
        label.setText(szovegMezo.getText());
        Handler.tulnev = szovegMezo.getText();
        frame.setVisible(false);
        new Kutyusneve();
        });
        
        panel.add(szovegMezo);
        panel.add(gomb);
        panel.add(label);
        label.setBorder(BorderFactory.createEmptyBorder(25,115,25,15));
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
