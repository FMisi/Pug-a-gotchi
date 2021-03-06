package gameObjects;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import other.Tar;
import pugagotchi.Iranyitas;

/**
 * A Jatekos class segitsegevel inicializaljuk a jatekos, a capa,<br>
 * es a nyersanyagok kezdopoziciojat, poziciojukhoz felteteleket tudunk kotni
 * @author Felegyi Mihaly Patrik
 */
public class Jatekos extends JPanel{
    
    public Tar<Integer, Integer> tile = new Tar<Integer, Integer>();
    public Color c;
    public static int playerx;
    public static int playery;
    
    Random random = new Random();
    
    private final int nulla;
    
    public Jatekos(){
        this.nulla = 0;
        playerx = 250;
        playery = 120;
    }
    
    public void render(Graphics g){
        
        g.setColor(c);
        super.paintComponent(g);
        ImageIcon bg = new ImageIcon("image\\bg.png");
        bg.paintIcon(this, g, nulla, nulla);
        ImageIcon mopsz = new ImageIcon("assets\\mopsz.png");
        ImageIcon mopsz_koszos = new ImageIcon("assets\\mopsz_koszos.png");
        if(Iranyitas.isKoszosbool()==true){
            mopsz_koszos.paintIcon(this, g, playerx, playery);
        }
        else {
            mopsz.paintIcon(this, g, playerx, playery);
        }
        
        ImageIcon ablak = new ImageIcon("assets\\ablak.png");
        
        ImageIcon jutalomfalatka = new ImageIcon("assets\\etelek\\jutalomfalatka.png");
        ImageIcon vasarlasBtn1 = new ImageIcon("assets\\vasarlasBtn1.png");
        ImageIcon szarazkutyatap = new ImageIcon("assets\\etelek\\szarazkutyatap.png");
        ImageIcon vasarlasBtn2 = new ImageIcon("assets\\vasarlasBtn2.png");
        ImageIcon csont = new ImageIcon("assets\\etelek\\csont.png");
        ImageIcon vasarlasBtn3 = new ImageIcon("assets\\vasarlasBtn3.png");
        ImageIcon hazikoszt = new ImageIcon("assets\\etelek\\hazikoszt.png");
        ImageIcon vasarlasBtn4 = new ImageIcon("assets\\vasarlasBtn4.png");
        ImageIcon viz = new ImageIcon("assets\\etelek\\viz.png");
        ImageIcon vasarlasBtn5 = new ImageIcon("assets\\vasarlasBtn5.png");
        ImageIcon kke = new ImageIcon("assets\\etelek\\konzervkutyaeledel.png");
        ImageIcon vasarlasBtn6 = new ImageIcon("assets\\vasarlasBtn6.png");
        ImageIcon kei = new ImageIcon("assets\\etelek\\kutyaenergiaital.png");
        ImageIcon vasarlasBtn7 = new ImageIcon("assets\\vasarlasBtn7.png");
        
        ImageIcon setaltatas = new ImageIcon("assets\\jatekok\\setaltatas.png");
        ImageIcon jatszBtn1 = new ImageIcon("assets\\jatszBtn1.png");
        ImageIcon labdasjatek = new ImageIcon("assets\\jatekok\\labdasjatek.png");
        ImageIcon jatszBtn2 = new ImageIcon("assets\\jatszBtn2.png");
        ImageIcon kutyaiskola = new ImageIcon("assets\\jatekok\\kutyaiskola.png");
        ImageIcon jatszBtn3 = new ImageIcon("assets\\jatszBtn3.png");
        ImageIcon jatekaparkban = new ImageIcon("assets\\jatekok\\jatekaparkban.png");
        ImageIcon jatszBtn4 = new ImageIcon("assets\\jatszBtn4.png");
        ImageIcon ujsagkihordas = new ImageIcon("assets\\jatekok\\ujsagkihordas.png");
        ImageIcon jatszBtn5 = new ImageIcon("assets\\jatszBtn5.png");
        ImageIcon rendorisegitseg = new ImageIcon("assets\\jatekok\\rendorisegitseg.png");
        ImageIcon jatszBtn6 = new ImageIcon("assets\\jatszBtn6.png");
        ImageIcon hazorzes = new ImageIcon("assets\\jatekok\\hazorzes.png");
        ImageIcon jatszBtn7 = new ImageIcon("assets\\jatszBtn7.png");
        
        ImageIcon kiseletcsomag = new ImageIcon("assets\\orvos\\kiseletcsomag.png");
        // vasarlasBtn6 -tal valositom meg
        ImageIcon nagyeletcsomag = new ImageIcon("assets\\orvos\\nagyeletcsomag.png");
        ImageIcon vasarlasBtn8 = new ImageIcon("assets\\vasarlasBtn8.png");
        ImageIcon allatorvos = new ImageIcon("assets\\orvos\\allatorvos.png");
        ImageIcon vasarlasBtn9 = new ImageIcon("assets\\vasarlasBtn9.png");
        ImageIcon maxpotion = new ImageIcon("assets\\orvos\\maxpotion.png");
        ImageIcon vasarlasBtn10 = new ImageIcon("assets\\vasarlasBtn10.png");
        
        if(Iranyitas.isAblakbool()==true && Iranyitas.isAblakbool2()==false && Iranyitas.isAblakbool3()==false){
            ablak.paintIcon(this, g, playerx-50, playery-120);

            jutalomfalatka.paintIcon(this, g, playerx-30, playery-95);
            vasarlasBtn1.paintIcon(this, g, playerx+200, playery-100);

            szarazkutyatap.paintIcon(this, g, playerx-30, playery-25);
            vasarlasBtn2.paintIcon(this, g, playerx+200, playery-30);
            
            csont.paintIcon(this, g, playerx-30, playery+45);
            vasarlasBtn3.paintIcon(this, g, playerx+200, playery+40);
            
            hazikoszt.paintIcon(this, g, playerx-30, playery+115);
            vasarlasBtn4.paintIcon(this, g, playerx+200, playery+110);
            
            viz.paintIcon(this, g, playerx-30, playery+185);
            vasarlasBtn5.paintIcon(this, g, playerx+200, playery+180);
            
            kke.paintIcon(this, g, playerx-30, playery+255);
            vasarlasBtn6.paintIcon(this, g, playerx+200, playery+250);
            
            kei.paintIcon(this, g, playerx-30, playery+325);
            vasarlasBtn7.paintIcon(this, g, playerx+200, playery+320);
        }
        else if(Iranyitas.isAblakbool()==false && Iranyitas.isAblakbool2()==true && Iranyitas.isAblakbool3()==false){
            ablak.paintIcon(this, g, playerx-50, playery-120);
            
            setaltatas.paintIcon(this, g, playerx-30, playery-95);
            jatszBtn1.paintIcon(this, g, playerx+200, playery-100);

            labdasjatek.paintIcon(this, g, playerx-30, playery-25);
            jatszBtn2.paintIcon(this, g, playerx+200, playery-30);
            
            kutyaiskola.paintIcon(this, g, playerx-30, playery+45);
            jatszBtn3.paintIcon(this, g, playerx+200, playery+40);
            
            jatekaparkban.paintIcon(this, g, playerx-30, playery+115);
            jatszBtn4.paintIcon(this, g, playerx+200, playery+110);
            
            ujsagkihordas.paintIcon(this, g, playerx-30, playery+185);
            jatszBtn5.paintIcon(this, g, playerx+200, playery+180);
            
            rendorisegitseg.paintIcon(this, g, playerx-30, playery+255);
            jatszBtn6.paintIcon(this, g, playerx+200, playery+250);
            
            hazorzes.paintIcon(this, g, playerx-30, playery+325);
            jatszBtn7.paintIcon(this, g, playerx+200, playery+320);
        }
        else if(Iranyitas.isAblakbool()==false && Iranyitas.isAblakbool2()==false && Iranyitas.isAblakbool3()==true){
            ablak.paintIcon(this, g, playerx-50, playery-120);
            
            kiseletcsomag.paintIcon(this, g, playerx-30, playery-95);
            vasarlasBtn6.paintIcon(this, g, playerx+200, playery-100);
            
            nagyeletcsomag.paintIcon(this, g, playerx-30, playery-25);
            vasarlasBtn8.paintIcon(this, g, playerx+200, playery-30);
            
            allatorvos.paintIcon(this, g, playerx-30, playery+45);
            vasarlasBtn9.paintIcon(this, g, playerx+200, playery+40);
            
            maxpotion.paintIcon(this, g, playerx-30, playery+115);
            vasarlasBtn10.paintIcon(this, g, playerx+200, playery+110);
        }
    }
}
