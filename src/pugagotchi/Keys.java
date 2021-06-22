package pugagotchi;

import java.awt.event.*;
import java.util.Random;

/**
 * A Keys osztaly a felhasznaloi input-ot valositja meg<br>
 * a KeyListener interfesz implementalasaval.<br>
 * Valamennyi hozza tartozo feltetel bekovetkezesekor az adott esemenyt<br>
 * bekovetkezteti
 * @author Felegyi Mihaly Patrik
 */
public class Keys implements KeyListener{
    
    private boolean[] keyDown = {false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false};
    private static boolean ablakbool = false;
    private static boolean ablakbool2 = false;
    private static boolean ablakbool3 = false;
    
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
        switch(arg1.getKeyCode()){
            case KeyEvent.VK_T:
                keyPressedT();
                break;
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
        }
    }
    
    // keyPressed void-ok KEZDETE
    private void keyPressedT(){
        Handler.korok++;
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
        if(ablakbool==false && ablakbool3==false){
            if(ablakbool2==true){
                ablakbool2=false;
            }
            else if(ablakbool2==false){
                ablakbool2=true;
            }
        }
        else if(ablakbool==true && Handler.penz>=4){
            Handler.penz-=4;
            Handler.jutalomfalatka++;
        }
        keyDown[2] = true;
    }
    
    private void keyPressedO(){
        if(ablakbool==false && ablakbool2==false){
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
        if(ablakbool3==true && Handler.penz>=6 && Handler.egeszseg!=100){
            Handler.penz-=6;
            Handler.egeszseg+=24;
        }
        else if(ablakbool==true && Handler.penz>=13){
            Handler.penz-=13;
            Handler.konzervkutyaeledel++;
        }
        else if(ablakbool2==true && Handler.penz>=10 && Handler.energia>=10){
            Handler.penz-=10;
            Handler.energia-=20;
            Handler.egeszseg-=5;
            Handler.rendetlenseg-=50;
        }
        keyDown[4] = true;
    }
    
    private void keyPressedN(){
        if(ablakbool3==true && Handler.penz>=10 && Handler.egeszseg!=100){
            Handler.penz-=10;
            Handler.egeszseg+=40;
        }
        keyDown[5] = true;
    }
        
    private void keyPressedA(){
        if(ablakbool3==true && Handler.penz>=25 && Handler.egeszseg!=100){
            Handler.penz-=25;
            Handler.egeszseg=100;
        }
        else if(ablakbool2==true && Handler.energia>=10){
            Handler.energia-=10;
            Handler.egeszseg-=10;
            Handler.rendetlenseg-=10;
        }
        keyDown[6] = true;
    }
    
    private void keyPressedM(){
        if(ablakbool3==true && Handler.penz>=100){
            if(Handler.jollakottsag==100 && Handler.egeszseg==100 && Handler.kedv==100
                    && Handler.energia==100 && Handler.rendetlenseg==100){}
            else {
                Handler.penz-=100;
                Handler.jollakottsag=100;
                Handler.egeszseg=100;
                Handler.kedv=100;
                Handler.energia=100;
                Handler.rendetlenseg=100;
            }
        }
        keyDown[7] = true;
    }
    
    private void keyPressedS(){
        if(ablakbool==true && Handler.penz>=8){
            Handler.penz-=8;
            Handler.szarazkutyatap++;
        }
        else if(ablakbool2==true && Handler.energia>=10){
            Handler.energia-=10;
            Handler.egeszseg-=4;
        }
        keyDown[8] = true;
    }
    
    private void keyPressedC(){
        if(ablakbool==true && Handler.penz>=10){
            Handler.penz-=10;
            Handler.csont++;
        }
        keyDown[9] = true;
    }
    
    private void keyPressedH(){
        if(ablakbool==true && Handler.penz>=6){
            Handler.penz-=6;
            Handler.hazikoszt++;
        }
        else if(ablakbool2==true && Handler.rendetlenseg<40 && Handler.energia>=10){
            Random random1 = new Random();
            Random random2 = new Random();
            Random random3 = new Random();
            int randint1 = random1.nextInt(171) + 30; //random1.nextInt(85) + 15; [15-99]
            int randint2 = random2.nextInt(23) + 8;
            int randint3 = random3.nextInt(11) + 10;
            Handler.penz+=randint1;
            Handler.energia-=randint2;
            Handler.egeszseg-=randint3;
            
        }
        keyDown[10] = true;
    }
    
    private void keyPressedV(){
        if(ablakbool==true && Handler.penz>=3){
            Handler.penz-=3;
            Handler.viz++;
        }
        keyDown[11] = true;
    }
    
    private void keyPressedU(){
        if(ablakbool==true && Handler.penz>=20){
            Handler.penz-=20;
            Handler.kutyaenergiaital++;
        }
        else if(ablakbool2==true && Handler.rendetlenseg<40 && Handler.energia>=10){
            Handler.penz+=50;
            Handler.energia-=10;
            Handler.egeszseg-=4;
        }
        keyDown[12] = true;
    }
    
    private void keyPressedL(){
        if(ablakbool2==true && Handler.energia>=10){
            Random random = new Random();
            int randint = random.nextInt(10);
            Handler.energia-=18;
            Handler.egeszseg-=randint;
            Handler.rendetlenseg-=5;
            
        }
        else if(ablakbool==false && ablakbool2==false && ablakbool3==false
                && Handler.jollakottsag>=8 && Handler.egeszseg>=5){
            Handler.korok++;
            Random random = new Random();
            int randint = random.nextInt(21)+30;
            Handler.energia+=randint;
            Handler.jollakottsag-=8;
            Handler.egeszseg-=5;
        }
        keyDown[13] = true;
    }
    
    private void keyPressedR(){
        if(ablakbool2==true && Handler.rendetlenseg<40){
            Random random = new Random();
            int randint = random.nextInt(16);
            Handler.penz+=100;
            Handler.energia-=25;
            Handler.egeszseg-=randint;
            
        }
        keyDown[14] = true;
    }
    
    private void keyPressedF(){
        if(ablakbool==false && ablakbool2==false && ablakbool3==false){
            
        }
        keyDown[15] = true;
    }
    
    // keyPressed void-ok VEGE

    /**
     * A keyReleased eljaras a felengedett billentyuk KeyCode-jat vizsgalja,<br>
     * es az alapjan allitja a keyDown tomb adott indexu erteket vissza false-ra.<br>
     * A keyDown tombre a beragado billentyuk kezelese miatt van szukseg
     * (KeyPressedW, KeyPressedA, stb.)
     * @param arg1 a lenyomott billentyu (de NEM annak KeyCode-ja)
     */
    @Override
    public void keyReleased(KeyEvent arg1) {
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
        }
    }
    
    /**
     * A keyTyped eljaras akkor hivodik meg, ha leutunk egy billentyut.
     * A KeyListener osztaly absztrakt metodusa, ezert kotelezo implementalni
     * @param arg1 a leutott billentyu
     */
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
    // Getterek

    public static boolean isAblakbool() {
        return ablakbool;
    }

    public static boolean isAblakbool2() {
        return ablakbool2;
    }
    
    public static boolean isAblakbool3() {
        return ablakbool3;
    }
    
}
