package pugagotchi;

import java.awt.*;
import gameObjects.Jatekos;

/**
 * A Kezelo osztaly segitsegevel a szamlalokat kezelhetjuk
 * @author Felegyi Mihaly Patrik
 */
public class Kezelo {
    public static Jatekos playerOne = new Jatekos();
    
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
    public static int seged = 0;
    
    // inventory
    public static int jutalomfalatka = 0;
    public static int szarazkutyatap = 0;
    public static int csont = 0;
    public static int hazikoszt = 0;
    public static int viz = 0;
    public static int konzervkutyaeledel = 0;
    public static int kutyaenergiaital = 0;
    
    public static boolean winbool = false;
    
    /**
     * A tick metodus notoriusan meghivodva ellenorzi folyton<br>
 az penz es jollakottsag szamlalokat
     */
    public static void tick(){
        if(jollakottsag<0){
            jollakottsag=0;
        }
        else if(jollakottsag>100){
            jollakottsag=100;
        }
        if(egeszseg<0){
            egeszseg=0;
        }
        else if(egeszseg>100){
            egeszseg=100;
        }
        if(kedv<0){
            kedv=0;
        }
        else if(kedv>100){
            kedv=100;
        }
        if(energia<0){
            energia=0;
        }
        else if(energia>100){
            energia=100;
        }
        if(rendetlenseg<0){
            rendetlenseg=0;
        }
        else if(rendetlenseg>100){
            rendetlenseg=100;
        }
        
        if(korok>=100 || penz>=10000){
            Ablak.clip.stop();
            Ablak.clip2.start();
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
        
        Graphics2D g27 = (Graphics2D)g;
        Graphics2D g28 = (Graphics2D)g;
        Graphics2D g29 = (Graphics2D)g;
        Graphics2D g30 = (Graphics2D)g;
        Graphics2D g31 = (Graphics2D)g;
        Graphics2D g32 = (Graphics2D)g;
        Graphics2D g33 = (Graphics2D)g;
        
        Graphics2D g34 = (Graphics2D)g;
        Graphics2D g35 = (Graphics2D)g;
        Graphics2D g36 = (Graphics2D)g;
        Graphics2D g37 = (Graphics2D)g;
        
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", 1, 12));
        g2.drawString("Körök: "+korok + "", 7, 14);
        g3.setColor(Color.MAGENTA);
        g3.setFont(new Font("Arial", 1, 18));
        
        if(korok>=100 || penz>=10000){
            korok=100;
            penz=10000;
            winbool=true;
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
        
        if(Iranyitas.isAblakbool()==true && Iranyitas.isAblakbool2()==false && Iranyitas.isAblakbool3()==false){
            g13.drawString("Jutalomfalatka (4 pénz)", 287, 54);
            g13.drawString("(Jóllakottság +10)", 287, 69);
            g14.drawString("Száraz kutyatáp (8 pénz)", 287, 124);
            g14.drawString("(Jóllakottság +20)", 287, 139);
            g15.drawString("Csont (10 pénz)", 287, 194);
            g15.drawString("(Jóllakottság +23)", 287, 209);
            g16.drawString("Házikoszt (6 pénz)", 287, 264);
            g16.drawString("(Jóllakottság +15)", 287, 279);
            g17.drawString("Víz (3 pénz)", 287, 334);
            g17.drawString("(Jóllakottság +7)", 287, 349);
            g18.drawString("Konz. kutyaeledel (13 pénz)", 287, 404);
            g18.drawString("(Jóllakottság +30)", 287, 419);
            g19.drawString("Kutya energiaital (20 pénz)", 287, 474);
            g19.drawString("(Jóllakottság +20, Ener. +15)", 287, 489);
        }
        else if(Iranyitas.isAblakbool()==false && Iranyitas.isAblakbool2()==true && Iranyitas.isAblakbool3()==false){
            g20.drawString("Sétáltatás", 287, 54);
            g21.drawString("Labdás játék", 287, 124);
            g22.drawString("Kutyaiskola (10 pénz)", 287, 194);
            g23.drawString("Játék a parkban", 287, 264);
            g24.drawString("Újságkihordás", 287, 334);
            g24.drawString("(40% rendetlenség alatt)", 287, 349);
            g25.drawString("Rendőri segítség", 287, 404);
            g25.drawString("(40% rendetlenség alatt)", 287, 419);
            g26.drawString("Házőrzés", 287, 474);
            g26.drawString("(40% rendetlenség alatt)", 287, 489);
        }
        else if(Iranyitas.isAblakbool()==false && Iranyitas.isAblakbool2()==false && Iranyitas.isAblakbool3()==true){
            g27.drawString("Kis életcsomag", 287, 54);
            g27.drawString("(6 pénz) (Egészség +24%)", 287, 69);
            g28.drawString("Nagy életcsomag", 287, 124);
            g28.drawString("(10 pénz) (Egészség +40%)", 287, 139);
            g29.drawString("Állatorvos", 287, 194);
            g29.drawString("(25 pénz) (Egészség 100%)", 287, 209);
            g30.drawString("Maximalizáló ital", 287, 264);
            g30.drawString("(100 pénz) (Minden 100%)", 287, 279);
        }

        g31.setColor(Color.BLACK);
        g31.setFont(new Font("Arial", 1, 12));
        g31.drawString("Jutalomfalatka:  "+jutalomfalatka + "", 7, 543);
        g32.setColor(Color.BLACK);
        g32.setFont(new Font("Arial", 1, 12));
        g32.drawString("Száraz kutyatáp:  "+szarazkutyatap + "", 157, 543);
        g33.setColor(Color.BLACK);
        g33.setFont(new Font("Arial", 1, 12));
        g33.drawString("Csont:  "+csont + "", 307, 543);
        g34.setColor(Color.BLACK);
        g34.setFont(new Font("Arial", 1, 12));
        g34.drawString("Házikoszt:  "+hazikoszt + "", 457, 543);
        g35.setColor(Color.BLACK);
        g35.setFont(new Font("Arial", 1, 12));
        g35.drawString("Víz:  "+viz + "", 607, 543);
        g36.setColor(Color.BLACK);
        g36.setFont(new Font("Arial", 1, 12));
        g36.drawString("Konzerv kutyaeledel:  "+konzervkutyaeledel + "", 7, 563);
        g37.setColor(Color.BLACK);
        g37.setFont(new Font("Arial", 1, 12));
        g37.drawString("Kutya energiaital:  "+kutyaenergiaital + "", 157, 563);

    }
}
