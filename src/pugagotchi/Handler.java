package pugagotchi;

import java.awt.*;
import gameObjects.Player;

/**
 * A Handler osztaly segitsegevel a szamlalokat kezelhetjuk
 * @author Felegyi Mihaly Patrik
 */
public class Handler {
    public static Player playerOne = new Player();
    
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
        g2.drawString("K??r??k: "+korok + "", 7, 14);
        g3.setColor(Color.MAGENTA);
        g3.setFont(new Font("Arial", 1, 18));
        
        if(korok>=100 || penz>=10000){
            korok=100;
            penz=10000;
            winbool=true;
            g3.drawString("FELNEVELTED PUG-A-GOTCHIDAT, MEGNYERTED A J??T??KOT!:D ", 121, 101);
        }
        
        g4.setColor(Color.BLACK);
        g4.setFont(new Font("Arial", 1, 12));
        g4.drawString("P??nz: "+penz + "", 7, 34);
        g5.setColor(Color.BLACK);
        g5.setFont(new Font("Arial", 1, 12));
        g5.drawString("J??llakotts??g: "+jollakottsag + "%", 7, 54);
        g6.setColor(Color.BLACK);
        g6.setFont(new Font("Arial", 1, 12));
        g6.drawString("Eg??szs??g: "+egeszseg + "%", 7, 74);
        g7.setColor(Color.BLACK);
        g7.setFont(new Font("Arial", 1, 12));
        g7.drawString("Kedv: "+kedv + "%", 7, 94);
        g8.setColor(Color.BLACK);
        g8.setFont(new Font("Arial", 1, 12));
        g8.drawString("Energia: "+energia + "%", 7, 114);

        g9.setColor(Color.BLACK);
        g9.setFont(new Font("Arial", 1, 12));
        g9.drawString("Rendetlens??g: "+rendetlenseg + "%", 7, 134);
        
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
        
        if(Keys.isAblakbool()==true && Keys.isAblakbool2()==false && Keys.isAblakbool3()==false){
            g13.drawString("Jutalomfalatka (4 p??nz)", 287, 54);
            g13.drawString("(J??llakotts??g +10)", 287, 69);
            g14.drawString("Sz??raz kutyat??p (8 p??nz)", 287, 124);
            g14.drawString("(J??llakotts??g +20)", 287, 139);
            g15.drawString("Csont (10 p??nz)", 287, 194);
            g15.drawString("(J??llakotts??g +23)", 287, 209);
            g16.drawString("H??zikoszt (6 p??nz)", 287, 264);
            g16.drawString("(J??llakotts??g +15)", 287, 279);
            g17.drawString("V??z (3 p??nz)", 287, 334);
            g17.drawString("(J??llakotts??g +7)", 287, 349);
            g18.drawString("Konz. kutyaeledel (13 p??nz)", 287, 404);
            g18.drawString("(J??llakotts??g +30)", 287, 419);
            g19.drawString("Kutya energiaital (20 p??nz)", 287, 474);
            g19.drawString("(J??llakotts??g +20, Ener. +15)", 287, 489);
        }
        else if(Keys.isAblakbool()==false && Keys.isAblakbool2()==true && Keys.isAblakbool3()==false){
            g20.drawString("S??t??ltat??s", 287, 54);
            g21.drawString("Labd??s j??t??k", 287, 124);
            g22.drawString("Kutyaiskola (10 p??nz)", 287, 194);
            g23.drawString("J??t??k a parkban", 287, 264);
            g24.drawString("??js??gkihord??s", 287, 334);
            g24.drawString("(40% rendetlens??g alatt)", 287, 349);
            g25.drawString("Rend??ri seg??ts??g", 287, 404);
            g25.drawString("(40% rendetlens??g alatt)", 287, 419);
            g26.drawString("H??z??rz??s", 287, 474);
            g26.drawString("(40% rendetlens??g alatt)", 287, 489);
        }
        else if(Keys.isAblakbool()==false && Keys.isAblakbool2()==false && Keys.isAblakbool3()==true){
            g27.drawString("Kis ??letcsomag", 287, 54);
            g27.drawString("(6 p??nz)", 287, 69);
            g28.drawString("Nagy ??letcsomag", 287, 124);
            g28.drawString("(10 p??nz)", 287, 139);
            g29.drawString("??llatorvos", 287, 194);
            g29.drawString("(25 p??nz)", 287, 209);
            g30.drawString("Maximaliz??l?? ital", 287, 264);
            g30.drawString("(100 p??nz)", 287, 279);
        }

        g31.setColor(Color.BLACK);
        g31.setFont(new Font("Arial", 1, 12));
        g31.drawString("Jutalomfalatka:  "+jutalomfalatka + "", 7, 543);
        g32.setColor(Color.BLACK);
        g32.setFont(new Font("Arial", 1, 12));
        g32.drawString("Sz??raz kutyat??p:  "+szarazkutyatap + "", 157, 543);
        g33.setColor(Color.BLACK);
        g33.setFont(new Font("Arial", 1, 12));
        g33.drawString("Csont:  "+csont + "", 307, 543);
        g34.setColor(Color.BLACK);
        g34.setFont(new Font("Arial", 1, 12));
        g34.drawString("H??zikoszt:  "+hazikoszt + "", 457, 543);
        g35.setColor(Color.BLACK);
        g35.setFont(new Font("Arial", 1, 12));
        g35.drawString("V??z:  "+viz + "", 607, 543);
        g36.setColor(Color.BLACK);
        g36.setFont(new Font("Arial", 1, 12));
        g36.drawString("Konzerv kutyaeledel:  "+konzervkutyaeledel + "", 7, 563);
        g37.setColor(Color.BLACK);
        g37.setFont(new Font("Arial", 1, 12));
        g37.drawString("Kutya energiaital:  "+kutyaenergiaital + "", 157, 563);

    }
}
