package pugagotchi;

import java.awt.event.*;
import java.io.*;
import java.util.Random;

/**
 * A Iranyitas osztaly a felhasznaloi input-ot valositja meg<br>
 * a KeyListener interfesz implementalasaval.<br>
 * Valamennyi hozza tartozo feltetel bekovetkezesekor az adott esemenyt<br>
 * bekovetkezteti
 * @author Felegyi Mihaly Patrik
 */
public class Iranyitas implements KeyListener{
    
    private boolean[] keyDown = {false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false};
    private static boolean ablakbool = false;
    private static boolean ablakbool2 = false;
    private static boolean ablakbool3 = false;
    private static boolean koszosbool = false;
    
    Random rand = new Random();
    private int randomint = 0;
    
    //<editor-fold defaultstate="collapsed" desc="valtozok mentes/betolteshez">
    private int v1;
    private int v2;
    private int v3;
    private int v4;
    private int v5;
    private String v6;
    private String v7;
    private int v8;
    private int v9;
    private int v10;
    private int v11;
    private int v12;
    private int v13;
    private int v14;
    private int v15;
    private int v16;
    private int v17;
    private boolean v18;
    //</editor-fold>

    /**
     * A keyPressed eljaras a lenyomott billentyuk KeyCode-jat vizsgalja,<br>
     * es az alapjan hivja meg az adott KeyPressed eljarast<br>
     * (KeyPressedW, KeyPressedA, stb.).<br>
     * A keyDown tomb adott indexu erteket true-ra allitja.<br>
     * A keyDown tombre a beragado billentyuk kezelese miatt van szukseg
     * @param arg1 a lenyomott billentyu (de NEM annak KeyCode-ja)
     */
    @Override
    public void keyPressed(KeyEvent arg1) {
        //<editor-fold defaultstate="collapsed" desc="keyPressed() hivasok">
        if(Kezelo.winbool==false){
        switch(arg1.getKeyCode()){
            case KeyEvent.VK_E:
                keyPressedE();
                break;
            case KeyEvent.VK_J:
                keyPressedJ();
                break;
            case KeyEvent.VK_O:
                keyPressedO();
                break;
            case KeyEvent.VK_K:
                keyPressedK();
                break;
            case KeyEvent.VK_N:
                keyPressedN();
                break;
            case KeyEvent.VK_A:
                keyPressedA();
                break;
            case KeyEvent.VK_M:
                keyPressedM();
                break;
            case KeyEvent.VK_S:
                keyPressedS();
                break;
            case KeyEvent.VK_C:
                keyPressedC();
                break;
            case KeyEvent.VK_H:
                keyPressedH();
                break;
            case KeyEvent.VK_V:
                keyPressedV();
                break;
            case KeyEvent.VK_U:
                keyPressedU();
                break;
            case KeyEvent.VK_L:
                keyPressedL();
                break;
            case KeyEvent.VK_R:
                keyPressedR();
                break;
            case KeyEvent.VK_F:
                keyPressedF();
                break;
            // 1
            case KeyEvent.VK_1:
                keyPressed1();
                break;
            case KeyEvent.VK_NUMPAD1:
                keyPressed1();
                break;
            // 2
            case KeyEvent.VK_2:
                keyPressed2();
                break;
            case KeyEvent.VK_NUMPAD2:
                keyPressed2();
                break;
            // 3
            case KeyEvent.VK_3:
                keyPressed3();
                break;
            case KeyEvent.VK_NUMPAD3:
                keyPressed3();
                break;
            // 4
            case KeyEvent.VK_4:
                keyPressed4();
                break;
            case KeyEvent.VK_NUMPAD4:
                keyPressed4();
                break;
            // 5
            case KeyEvent.VK_5:
                keyPressed5();
                break;
            case KeyEvent.VK_NUMPAD5:
                keyPressed5();
                break;
            // 6
            case KeyEvent.VK_6:
                keyPressed6();
                break;
            case KeyEvent.VK_NUMPAD6:
                keyPressed6();
                break;
            // 7
            case KeyEvent.VK_7:
                keyPressed7();
                break;
            case KeyEvent.VK_NUMPAD7:
                keyPressed7();
                break;
            // B
            case KeyEvent.VK_B:
                keyPressedB();
                break;
        }
        }
        //</editor-fold>
    }
    
    //<editor-fold defaultstate="collapsed" desc="keyPressed() void-ok">
    private void keyPressedT(){
        keyDown[0] = true;
    }
    
    private void keyPressedE(){
        if(ablakbool2==false && ablakbool3==false){
            if(ablakbool==true){
                ablakbool=false;
            }
            else if(ablakbool==false){
                ablakbool=true;
            }
        }
        keyDown[1] = true;
    }
    
    private void keyPressedJ(){
        if(ablakbool==false && ablakbool3==false && koszosbool==false){
            if(ablakbool2==true){
                ablakbool2=false;
            }
            else if(ablakbool2==false){
                ablakbool2=true;
            }
        }
        else if(ablakbool==true && Kezelo.penz>=4){
            Kezelo.penz-=4;
            Kezelo.jutalomfalatka++;
        }
        keyDown[2] = true;
    }
    
    private void keyPressedO(){
        if(ablakbool==false && ablakbool2==false && koszosbool==false){
            if(ablakbool3==true){
                ablakbool3=false;
            }
            else if(ablakbool3==false){
                ablakbool3=true;
            }
        }
        keyDown[3] = true;
    }
    
    private void keyPressedK(){
        if(ablakbool3==true && Kezelo.penz>=6 && Kezelo.egeszseg!=100){
            Kezelo.penz-=6;
            Kezelo.egeszseg+=24;
        }
        else if(ablakbool==true && Kezelo.penz>=13){
            Kezelo.penz-=13;
            Kezelo.konzervkutyaeledel++;
        }
        else if(ablakbool2==true && Kezelo.penz>=10 && Kezelo.energia>=20
                && Kezelo.egeszseg >=5){ // rendetlensegre nem szabok feltetelt
            Kezelo.penz-=10;
            Kezelo.energia-=20;
            Kezelo.egeszseg-=5;
            Kezelo.rendetlenseg-=50;
            Kezelo.kedv+=20;
        }
        keyDown[4] = true;
    }
    
    private void keyPressedN(){
        if(ablakbool3==true && Kezelo.penz>=10 && Kezelo.egeszseg!=100){
            Kezelo.penz-=10;
            Kezelo.egeszseg+=40;
        }
        keyDown[5] = true;
    }
        
    private void keyPressedA(){
        if(ablakbool3==true && Kezelo.penz>=25 && Kezelo.egeszseg!=100){
            Kezelo.penz-=25;
            Kezelo.egeszseg=100;
        }
        else if(ablakbool2==true && Kezelo.energia>=10 && Kezelo.egeszseg>=10){
            // rendetlensegre nem szabok feltetelt
            Kezelo.energia-=10;
            Kezelo.egeszseg-=10;
            Kezelo.rendetlenseg-=10;
            Kezelo.kedv+=10;
        }
        keyDown[6] = true;
    }
    
    private void keyPressedM(){
        if(ablakbool3==true && Kezelo.penz>=100){
            if(Kezelo.jollakottsag==100 && Kezelo.egeszseg==100 && Kezelo.kedv==100
                    && Kezelo.energia==100 && Kezelo.rendetlenseg==100){}
            else {
                Kezelo.penz-=100;
                Kezelo.jollakottsag=100;
                Kezelo.egeszseg=100;
                Kezelo.kedv=100;
                Kezelo.energia=100;
                Kezelo.rendetlenseg=100;
            }
        }
        else if(ablakbool==false && ablakbool2==false && ablakbool3==false){
            mentes();
        }
        keyDown[7] = true;
    }
    
    private void keyPressedS(){
        if(ablakbool==true && Kezelo.penz>=8){
            Kezelo.penz-=8;
            Kezelo.szarazkutyatap++;
        }
        else if(ablakbool2==true && Kezelo.energia>=10 && Kezelo.egeszseg>=4){
            Kezelo.energia-=10;
            Kezelo.egeszseg-=4;
            Kezelo.kedv+=10;
        }
        keyDown[8] = true;
    }
    
    private void keyPressedC(){
        if(ablakbool==true && Kezelo.penz>=10){
            Kezelo.penz-=10;
            Kezelo.csont++;
        }
        keyDown[9] = true;
    }
    
    private void keyPressedH(){
        if(ablakbool==true && Kezelo.penz>=6){
            Kezelo.penz-=6;
            Kezelo.hazikoszt++;
        }
        else if(ablakbool2==true && Kezelo.rendetlenseg<40 && Kezelo.energia>=10){
            Random random1 = new Random();
            Random random2 = new Random();
            Random random3 = new Random();
            int randint1 = random1.nextInt(171) + 30; //random1.nextInt(85) + 15; [15-99]
            int randint2 = random2.nextInt(23) + 8;
            int randint3 = random3.nextInt(11) + 10;
            Kezelo.penz+=randint1;
            Kezelo.energia-=randint2;
            Kezelo.egeszseg-=randint3;
            Kezelo.kedv-=randint2;
        }
        keyDown[10] = true;
    }
    
    private void keyPressedV(){
        if(ablakbool==true && Kezelo.penz>=3){
            Kezelo.penz-=3;
            Kezelo.viz++;
        }
        keyDown[11] = true;
    }
    
    private void keyPressedU(){
        if(ablakbool==true && Kezelo.penz>=20){
            Kezelo.penz-=20;
            Kezelo.kutyaenergiaital++;
        }
        else if(ablakbool2==true && Kezelo.rendetlenseg<40 && Kezelo.energia>=10){
            Kezelo.penz+=50;
            Kezelo.energia-=10;
            Kezelo.egeszseg-=4;
            Kezelo.kedv-=10;
        }
        keyDown[12] = true;
    }
    
    private void keyPressedL(){
        Random random = new Random();
        int randint = random.nextInt(10);
        if(ablakbool2==true && Kezelo.energia>=10 && Kezelo.egeszseg >=randint){
            Kezelo.energia-=18;
            Kezelo.egeszseg-=randint;
            Kezelo.kedv+=18;
        }
        else if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.jollakottsag>=8 && Kezelo.egeszseg>=5 && koszosbool==false){
            Kezelo.korok++;
            Random random2 = new Random();
            int randint2 = random2.nextInt(21)+30;
            Kezelo.energia+=randint2;
            Kezelo.jollakottsag-=8;
            Kezelo.egeszseg-=5;
            randomint = rand.nextInt(100)+1;
            if(randomint<=40){
                koszosbool = true;
            }
        }
        keyDown[13] = true;
    }
    
    private void keyPressedR(){
        Random random = new Random();
        int randint = random.nextInt(16);
        if(ablakbool2==true && Kezelo.rendetlenseg<40 && Kezelo.energia>25 && Kezelo.egeszseg > randint){
            Kezelo.penz+=100;
            Kezelo.energia-=25;
            Kezelo.egeszseg-=randint;
            Kezelo.kedv-=25;
        }
        keyDown[14] = true;
    }
    
    private void keyPressedF(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false){
            koszosbool=false;
        }
        keyDown[15] = true;
    }
    
    private void keyPressed1(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.jutalomfalatka > 0 && Kezelo.jollakottsag < 100){
            Kezelo.jutalomfalatka--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=10;
        }
        keyDown[16] = true;
    }
    
    private void keyPressed2(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.szarazkutyatap > 0 && Kezelo.jollakottsag < 100){
            Kezelo.szarazkutyatap--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=20;
        }
        keyDown[17] = true;
    }
    
    private void keyPressed3(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.csont > 0  && Kezelo.jollakottsag < 100){
            Kezelo.csont--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=23;
        }
        keyDown[18] = true;
    }
    
    private void keyPressed4(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.hazikoszt > 0  && Kezelo.jollakottsag < 100){
            Kezelo.hazikoszt--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=15;
        }
        keyDown[19] = true;
    }
    
    private void keyPressed5(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.viz > 0  && Kezelo.jollakottsag < 100){
            Kezelo.viz--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=7;
        }
        keyDown[20] = true;
    }
    
    private void keyPressed6(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.konzervkutyaeledel > 0  && Kezelo.jollakottsag < 100){
            Kezelo.konzervkutyaeledel--;
            Kezelo.energia-=3;
            Kezelo.jollakottsag+=30;
        }
        keyDown[21] = true;
    }
    
    private void keyPressed7(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Kezelo.kutyaenergiaital > 0  && ((Kezelo.jollakottsag < 100) || (Kezelo.energia < 100))){
            Kezelo.kutyaenergiaital--;
            Kezelo.jollakottsag+=20;
            Kezelo.energia+=12; // 15 - 3 = 12
        }
        keyDown[22] = true;
    }
    
    private void keyPressedB(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false){
            betoltes();
        }
        keyDown[23] = true;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="mentes, betoltes">
    private void mentes(){
        v1 = Kezelo.jollakottsag;
        v2 = Kezelo.egeszseg;
        v3 = Kezelo.kedv;
        v4 = Kezelo.energia;
        v5 = Kezelo.rendetlenseg;
        v6 = Kezelo.kutyusneve;
        v7 = Kezelo.tulnev;
        v8 = Kezelo.penz;
        v9 = Kezelo.korok;
        v10 = Kezelo.jutalomfalatka;
        v11 = Kezelo.szarazkutyatap;
        v12 = Kezelo.csont;
        v13 = Kezelo.hazikoszt;
        v14 = Kezelo.viz;
        v15 = Kezelo.konzervkutyaeledel;
        v16 = Kezelo.kutyaenergiaital;
        v17 = Kezelo.seged;
        v18 = koszosbool;
        // Fajl letrehoz
        File f1 = new File("save1.fun");
        // Fajl iras
        try{
            PrintWriter pw = 
            // Irando adat formazasa
            new PrintWriter(
            // Adat mentese az irasig (egyszerre iratunk,
            // nem a kulon reszeket iratjuk ki egyesevel)
            new BufferedWriter(
            // Karaktereket ir a fajlba
            // Hozzafuzes (append): new FileWriter(f2, true);
            new FileWriter(f1)));
            // Szoveget ir a fajlba.
            pw.println(v1);
            pw.println(v2);
            pw.println(v3);
            pw.println(v4);
            pw.println(v5);
            pw.println(v6);
            pw.println(v7);
            pw.println(v8);
            pw.println(v9);
            pw.println(v10);
            pw.println(v11);
            pw.println(v12);
            pw.println(v13);
            pw.println(v14);
            pw.println(v15);
            pw.println(v16);
            pw.println(v17);
            pw.println(v18);
            // Fajlt bezar
            pw.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    
    private void readLines(File f) throws IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String sor;
        int sorokSzama = 0;
        while(((sor = br.readLine()) != null)){
            //<editor-fold defaultstate="collapsed" desc="sorokSzama kapcsolo">
            switch(sorokSzama){
                case 0:
                    v1 = Integer.parseInt(sor);
                    break;
                case 1:
                    v2 = Integer.parseInt(sor);
                    break;
                case 2:
                    v3 = Integer.parseInt(sor);
                    break;
                case 3:
                    v4 = Integer.parseInt(sor);
                    break;
                case 4:
                    v5 = Integer.parseInt(sor);
                    break;
                case 5:
                    v6 = sor;
                    break;
                case 6:
                    v7 = sor;
                    break;
                case 7:
                    v8 = Integer.parseInt(sor);
                    break;
                case 8:
                    v9 = Integer.parseInt(sor);
                    break;
                case 9:
                    v10 = Integer.parseInt(sor);
                    break;
                case 10:
                    v11 = Integer.parseInt(sor);
                    break;
                case 11:
                    v12 = Integer.parseInt(sor);
                    break;
                case 12:
                    v13 = Integer.parseInt(sor);
                    break;
                case 13:
                    v14 = Integer.parseInt(sor);
                    break;
                case 14:
                    v15 = Integer.parseInt(sor);
                    break;
                case 15:
                    v16 = Integer.parseInt(sor);
                    break;
                case 16:
                    v17 = Integer.parseInt(sor);
                    break;
                case 17:
                    v18 = Boolean.parseBoolean(sor);
                    break;
            }
            sorokSzama++;
            //</editor-fold>
        }
        br.close();
        fr.close();
    }
    
    private void betoltes(){
        File f1 = new File("save1.fun");
        try{
            readLines(f1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Kezelo.jollakottsag = v1;
        Kezelo.egeszseg = v2;
        Kezelo.kedv = v3;
        Kezelo.energia = v4;
        Kezelo.rendetlenseg = v5;
        Kezelo.kutyusneve = v6;
        Kezelo.tulnev = v7;
        Kezelo.penz = v8;
        Kezelo.korok = v9;
        Kezelo.jutalomfalatka = v10;
        Kezelo.szarazkutyatap = v11;
        Kezelo.csont = v12;
        Kezelo.hazikoszt = v13;
        Kezelo.viz = v14;
        Kezelo.konzervkutyaeledel = v15;
        Kezelo.kutyaenergiaital = v16;
        Kezelo.seged = v17;
        koszosbool = v18;
    }
    //</editor-fold>
    
    /**
     * A keyReleased eljaras a felengedett billentyuk KeyCode-jat vizsgalja,<br>
     * es az alapjan allitja a keyDown tomb adott indexu erteket vissza false-ra.<br>
     * A keyDown tombre a beragado billentyuk kezelese miatt van szukseg
     * (KeyPressedW, KeyPressedA, stb.)
     * @param arg1 a lenyomott billentyu (de NEM annak KeyCode-ja)
     */
    @Override
    public void keyReleased(KeyEvent arg1) {
        //<editor-fold defaultstate="collapsed" desc="keyReleased() cuccok">
        switch(arg1.getKeyCode()){
            case KeyEvent.VK_T:
                keyDown[0] = false;
                break;
            case KeyEvent.VK_E:
                keyDown[1] = false;
                break;
            case KeyEvent.VK_J:
                keyDown[2] = false;
                break;
            case KeyEvent.VK_O:
                keyDown[3] = false;
                break;
            case KeyEvent.VK_K:
                keyDown[4] = false;
                break;
            case KeyEvent.VK_N:
                keyDown[5] = false;
                break;
            case KeyEvent.VK_A:
                keyDown[6] = false;
                break;
            case KeyEvent.VK_M:
                keyDown[7] = false;
                break;
            case KeyEvent.VK_S:
                keyDown[8] = false;
                break;
            case KeyEvent.VK_C:
                keyDown[9] = false;
                break;
            case KeyEvent.VK_H:
                keyDown[10] = false;
                break;
            case KeyEvent.VK_V:
                keyDown[11] = false;
                break;
            case KeyEvent.VK_U:
                keyDown[12] = false;
                break;
            case KeyEvent.VK_L:
                keyDown[13] = false;
                break;
            case KeyEvent.VK_R:
                keyDown[14] = false;
                break;
            case KeyEvent.VK_F:
                keyDown[15] = false;
                break;
            // 1
            case KeyEvent.VK_1:
                keyDown[16] = false;
                break;
            case KeyEvent.VK_NUMPAD1:
                keyDown[16] = false;
                break;
            // 2
            case KeyEvent.VK_2:
                keyDown[17] = false;
                break;
            case KeyEvent.VK_NUMPAD2:
                keyDown[17] = false;
                break;
            // 3
            case KeyEvent.VK_3:
                keyDown[18] = false;
                break;
            case KeyEvent.VK_NUMPAD3:
                keyDown[18] = false;
                break;
            // 4
            case KeyEvent.VK_4:
                keyDown[19] = false;
                break;
            case KeyEvent.VK_NUMPAD4:
                keyDown[19] = false;
                break;
            // 5
            case KeyEvent.VK_5:
                keyDown[20] = false;
                break;
            case KeyEvent.VK_NUMPAD5:
                keyDown[20] = false;
                break;
            // 6
            case KeyEvent.VK_6:
                keyDown[21] = false;
                break;
            case KeyEvent.VK_NUMPAD6:
                keyDown[21] = false;
                break;
            // 7
            case KeyEvent.VK_7:
                keyDown[22] = false;
                break;
            case KeyEvent.VK_NUMPAD7:
                keyDown[22] = false;
                break;
            // B
            case KeyEvent.VK_B:
                keyDown[23] = false;
                break;
        }
        //</editor-fold>
    }
    
    /**
     * A keyTyped eljaras akkor hivodik meg, ha leutunk egy billentyut.
     * A KeyListener osztaly absztrakt metodusa, ezert kotelezo implementalni
     * @param arg1 a leutott billentyu
     */
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
    //<editor-fold defaultstate="collapsed" desc="Getterek">
    public static boolean isAblakbool() {
        return ablakbool;
    }

    public static boolean isAblakbool2() {
        return ablakbool2;
    }
    
    public static boolean isAblakbool3() {
        return ablakbool3;
    }
    
    public static boolean isKoszosbool() {
        return koszosbool;
    }
    //</editor-fold>
}
