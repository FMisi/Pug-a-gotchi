package pugagotchi;

import javax.swing.JFrame;

/**
 * A Pugagotchi_launcher osztaly segitsegevel futtathatjuk jatekunkat
 * @author Felegyi Mihaly Patrik
 * @version 1.0
 */
public class Pugagotchi_launcher {
    
    /**
     * main eljaras
     * @param args A parancssori argumentumok
     */
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Pugagotchi();
         
    }
}
