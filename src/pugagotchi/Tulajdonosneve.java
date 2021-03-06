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
        if(!Kezelo.tulnev.equals("Tulnev")){
            frame.setVisible(false);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gomb.addActionListener(e -> {
        if(szovegMezo.getText().length()>=15){
            szovegMezo.setText(szovegMezo.getText().substring(0, 14));
        }
        label.setText(szovegMezo.getText());
        Kezelo.tulnev = szovegMezo.getText();
        frame.setVisible(false);
        new Kutyusneve();
        });
        
        panel.add(szovegMezo);
        panel.add(gomb);
        panel.add(label);
        label.setBorder(BorderFactory.createEmptyBorder(25,135,25,15));
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
