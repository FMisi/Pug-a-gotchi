package pugagotchi;

import java.awt.*;
import gameObjects.Player;

/**
 * A Handler osztaly segitsegevel a szamlalokat kezelhetjuk
 * @author Felegyi Mihaly Patrik
 */
public class Handler {
    
    // Milyen szinu a player es hol van (a szin nem fontos, csak debug-hoz volt jo):
    public static Player playerOne = new Player(Color.WHITE, 19, 15);
    
    // szamlalok
    public static int korok = 90;
    public static int penz = 1500;
    public static int jollakottsag = 62;
    public static int egeszseg = 62;
    public static int kedv = 62;
    public static int energia = 62;
    public static int rendetlenseg = 62;
    public static String kutyusneve = "Kutyus neve";
    public static String tulnev = "Tulnev";
    
    // inventory
    public static int teruletbovites = 0;
    public static int landzsa = 0;
    public static int tuzhely = 0;
    public static int viztisztito = 0;
    public static int halo = 0;
    public static int burgonya = 0;
    public static int hal = 40;
    
    public static boolean winbool = false;
    
    /**
     * A tick metodus notoriusan meghivodva ellenorzi folyton<br>
 az penz es jollakottsag szamlalokat
     */
    public static void tick(){
        if(korok>=100){
            Window.clip.stop();
            Window.clip2.start();
        }
    }
    
    /**
     * Rendereles
     * @param g A grafikus elemek erteke
     */
    public static void render(Graphics g){
        
        playerOne.render(g);
        // korok
        Graphics2D g2 = (Graphics2D)g;
        // win
        Graphics2D g3 = (Graphics2D)g;
        // penz
        Graphics2D g4 = (Graphics2D)g;
        // jollakottsag
        Graphics2D g5 = (Graphics2D)g;
        
        // egeszseg
        Graphics2D g6 = (Graphics2D)g;
        // kedv
        Graphics2D g7 = (Graphics2D)g;
        // energia
        Graphics2D g8 = (Graphics2D)g;
        // rendetlenseg
        Graphics2D g9 = (Graphics2D)g;
         
        Graphics2D g10 = (Graphics2D)g;
        Graphics2D g11 = (Graphics2D)g;
        Graphics2D g12 = (Graphics2D)g;
        Graphics2D g13 = (Graphics2D)g;

        Graphics2D g14 = (Graphics2D)g;
        Graphics2D g15 = (Graphics2D)g;
        Graphics2D g16 = (Graphics2D)g;
        Graphics2D g17 = (Graphics2D)g;
        Graphics2D g18 = (Graphics2D)g;
        Graphics2D g19 = (Graphics2D)g;
        
        Graphics2D g20 = (Graphics2D)g;
        Graphics2D g21 = (Graphics2D)g;
        Graphics2D g22 = (Graphics2D)g;
        Graphics2D g23 = (Graphics2D)g;
        Graphics2D g24 = (Graphics2D)g;
        Graphics2D g25 = (Graphics2D)g;
        Graphics2D g26 = (Graphics2D)g;
        
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", 1, 12));
        g2.drawString("Körök: "+korok + "", 7, 14);
        g3.setColor(Color.MAGENTA);
        g3.setFont(new Font("Arial", 1, 18));
        
        if(korok>=100){
            korok=100;
            winbool=true;
            penz=10000;
            jollakottsag=100;
            g3.drawString("FELNEVELTED PUG-A-GOTCHIDAT, MEGNYERTED A JÁTÉKOT!:D ", 121, 101);
        }
        g4.setColor(Color.BLACK);
        g4.setFont(new Font("Arial", 1, 12));
        g4.drawString("Pénz: "+penz + "", 7, 34);
        g5.setColor(Color.BLACK);
        g5.setFont(new Font("Arial", 1, 12));
        g5.drawString("Jóllakottság: "+jollakottsag + "%", 7, 54);
        g6.setColor(Color.BLACK);
        g6.setFont(new Font("Arial", 1, 12));
        g6.drawString("Egészség: "+egeszseg + "%", 7, 74);
        g7.setColor(Color.BLACK);
        g7.setFont(new Font("Arial", 1, 12));
        g7.drawString("Kedv: "+kedv + "%", 7, 94);
        g8.setColor(Color.BLACK);
        g8.setFont(new Font("Arial", 1, 12));
        g8.drawString("Energia: "+energia + "%", 7, 114);

        g9.setColor(Color.BLACK);
        g9.setFont(new Font("Arial", 1, 12));
        g9.drawString("Rendetlenség: "+rendetlenseg + "%", 7, 134);
        
        g10.setColor(Color.BLACK);
        g10.setFont(new Font("Arial", 1, 12));
        g10.drawString("Kutyus neve:  "+kutyusneve + "", 7, 154);
        g11.setColor(Color.BLACK);
        g11.setFont(new Font("Arial", 1, 12));
        g11.drawString("Tulajdonos neve:  "+tulnev + "", 7, 174);
        g12.setColor(Color.BLACK);
        
        g13.setColor(Color.BLACK);
        g13.setFont(new Font("Arial", 1, 12));
        g14.setColor(Color.BLACK);
        g14.setFont(new Font("Arial", 1, 12));
        g15.setColor(Color.BLACK);
        g15.setFont(new Font("Arial", 1, 12));
        g16.setColor(Color.BLACK);
        g16.setFont(new Font("Arial", 1, 12));
        g17.setColor(Color.BLACK);
        g17.setFont(new Font("Arial", 1, 12));
        g18.setColor(Color.BLACK);
        g18.setFont(new Font("Arial", 1, 12));
        g19.setColor(Color.BLACK);
        g19.setFont(new Font("Arial", 1, 12));
        
        g20.setColor(Color.BLACK);
        g20.setFont(new Font("Arial", 1, 12));
        g21.setColor(Color.BLACK);
        g21.setFont(new Font("Arial", 1, 12));
        g22.setColor(Color.BLACK);
        g22.setFont(new Font("Arial", 1, 12));
        g23.setColor(Color.BLACK);
        g23.setFont(new Font("Arial", 1, 12));
        g24.setColor(Color.BLACK);
        g24.setFont(new Font("Arial", 1, 12));
        g25.setColor(Color.BLACK);
        g25.setFont(new Font("Arial", 1, 12));
        g26.setColor(Color.BLACK);
        g26.setFont(new Font("Arial", 1, 12));
        
        if(Keys.isAblakbool()==true && Keys.isAblakbool2()==false){
            g13.drawString("Jutalomfalatka", 287, 54);
            g14.drawString("Száraz kutyatáp", 287, 124);
            g15.drawString("Csont", 287, 194);
            g16.drawString("Házikoszt", 287, 264);
            g17.drawString("Víz", 287, 334);
            g18.drawString("Konzerv kutyaeledel", 287, 404);
            g19.drawString("Kutya energiaital", 287, 474);
        }
        else if(Keys.isAblakbool()==false && Keys.isAblakbool2()==true){
            g20.drawString("Sétáltatás", 287, 54);
            g21.drawString("Labdás játék", 287, 124);
            g22.drawString("Kutyaiskola", 287, 194);
            g23.drawString("Játék a parkban", 287, 264);
            g24.drawString("Újságkihordás", 287, 334);
            g25.drawString("Rendőri segítség", 287, 404);
            g26.drawString("Házőrzés", 287, 474);
        }
    }
}
