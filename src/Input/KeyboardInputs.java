package Input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Dictionary;
import java.util.Hashtable;

import user.Main;

public class KeyboardInputs implements KeyListener{
    public String[] keypressed = {};
    public Dictionary keys = new Hashtable<>();
    Main main = new Main();
    @Override
    public void keyPressed(KeyEvent e) {
        // main.onKeypressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keypressed[1] = null;
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
