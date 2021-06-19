package pugagotchi;

import java.awt.*;
import java.awt.image.*;

/**
 * A Pugagotchi class segitsegevel peldanyosithatunk egy ablakot,<br>
 * hozzaadhatunk jatekunkhoz a billentyuzet hallgatonkat,<br>
 * megrajzolhatjuk grid-unket, es kezelhetjuk jatekallapotunkat
 * @author Felegyi Mihaly Patrik
 */
public class Pugagotchi extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    
    /**
     * Egy ablak peldanyositasa, billentyuzet hallgato hozzadasa
     */
    public Pugagotchi() {
        addKeyListener(new Keys());
        new Tulajdonosneve();
    }
    
    /**
     * szal indito eljaras
     */
    public synchronized void start(){
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    /**
     * FPS kezeles futasidoben
     */
    @Override
    public void run(){
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        
        long renderLastTime = System.nanoTime();
        double amtOfRenders = 60.0; // MAX FPS
        double renderNs = 1000000000 / amtOfRenders;
        double renderDelta = 0;
        
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                delta--;
            }
            
            now = System.nanoTime();
            renderDelta += (now - renderLastTime) / renderNs;
            renderLastTime = now;
            while(running && renderDelta >= 1){
                render();
                renderDelta--;
            }
            
            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
            }
        }
        stop();
    }
    
    /**
     * Szal megallito eljaras
     */
    private void stop(){
        try{
            running = false;
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Rendereljuk a grafikus elemeket
     */
    private void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        /* g a hatter */
        Graphics g = bs.getDrawGraphics();
        Graphics g2 = bs.getDrawGraphics();
        
        g.setColor(new Color(0,102,173));
        g.fillRect(0, 0, 812, 606);

        Handler.render(g);

        g.dispose();
        g2.dispose();
        
        bs.show();
    }
    
    /**
     * A tick eljarassal utasitasokat hajthatunk vegre notoriusan
     */
    private void tick(){
        Handler.tick();
    }
    
}
