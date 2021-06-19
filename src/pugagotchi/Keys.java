package pugagotchi;

import java.awt.event.*;

/**
 * A Keys osztaly a felhasznaloi input-ot valositja meg<br>
 * a KeyListener interfesz implementalasaval.<br>
 * Valamennyi hozza tartozo feltetel bekovetkezesekor az adott esemenyt<br>
 * bekovetkezteti
 * @author Felegyi Mihaly Patrik
 */
public class Keys implements KeyListener{
    
    private boolean[] keyDown = {false, false, false, false, false, false, false, false, false};
    public static boolean ablakbool = false;
    
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
        if(arg1.getKeyCode() == KeyEvent.VK_T){
            keyPressedT();
        }
        if(arg1.getKeyCode() == KeyEvent.VK_E){
            keyPressedE();
        }
    }
    
    // keyPressed void-ok KEZDETE
    private void keyPressedT(){
        Handler.korok++;
        keyDown[0] = true;
    }
    
    private void keyPressedE(){
        if(ablakbool==true){
            ablakbool=false;
        }
        else if(ablakbool==false){
            ablakbool=true;
        }
        keyDown[1] = true;
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
        if(arg1.getKeyCode() == KeyEvent.VK_T){
            keyDown[0] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_E){
            keyDown[1] = false;
        }
    }
    
    /**
     * A keyTyped eljaras akkor hivodik meg, ha leutunk egy billentyut.
     * A KeyListener osztaly absztrakt metodusa, ezert kotelezo implementalni
     * @param arg1 a leutott billentyu
     */
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
    /**
     * A randomHordosHokamoka eljarasok a hordok tartalmanak<br>
     * randomizalasaert felelosek
     */
}
