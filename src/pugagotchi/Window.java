package pugagotchi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.File;
import javax.sound.sampled.*;

/**
 *
 * @author Felegyi Mihaly Patrik
 */
public class Window extends JFrame{

    private File bgm = new File("music/Snowy&cozy-ringtail.wav");
    private File victorybgm = new File("music/victory.wav");
    public static Clip clip;
    public static Clip clip2;
    public static Clip clip3;
    
    /**
     *
     * @param width Az ablak szelessege
     * @param height Az ablak hosszusaga
     * @param title A cim
     * @param pugagotchi A Pugagotchi tipusu parameter
     */
    public Window(int width, int height, String title, Pugagotchi pugagotchi){
        
        try{
            File musicPath = bgm;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            File musicPath = victorybgm;
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip2 = AudioSystem.getClip();
            clip2.open(audioInput);
            clip2.stop();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image/icon.png"));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(pugagotchi);
        frame.setVisible(true);
        
        pugagotchi.start();
    }
    
}
