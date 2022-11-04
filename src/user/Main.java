package user;

import core.App;
import Templates.obj.Rect;
import java.awt.event.KeyEvent;

public class Main {

  public static void main(String[] args) throws Exception {
    App app = new App(1000, 400);
    
  }

  public void onKeypressed(KeyEvent e){
    System.out.println(e.getKeyChar());
  }
}
