package pugagotchi;

import java.awt.*;
import javax.swing.*;

public class Kutyusneve {
        JFrame frame = new JFrame("Mi legyen a kutyus neve? ^.^");
        JPanel panel = new JPanel(new GridLayout(2,2));
        JTextField szovegMezo = new JTextField();
        JButton gomb = new JButton("OK");
        JLabel label = new JLabel("");
        public Kutyusneve() {
            if(!Kezelo.kutyusneve.equals("Kutyus neve")){
                frame.setVisible(false);
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gomb.addActionListener(e -> {
            if(szovegMezo.getText().length()>=15){
                szovegMezo.setText(szovegMezo.getText().substring(0, 14));
            }
            label.setText(szovegMezo.getText());
            Kezelo.kutyusneve = szovegMezo.getText();
            frame.setVisible(false);
            Kezelo.seged++;
            new Ablak(812, 606, "Pug-a-gotchi", new Pugagotchi());
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
