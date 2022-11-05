package user;

import core.App;
// import Templates.obj.Rect;
import java.awt.event.KeyEvent;
// import core.Obj;

public class Main {

  public static void main(String[] args) throws Exception {
    App app = new App(1000, 400);
    String mainPanel = app.newPanel("mainPanel");
    app.newPanel("second panel");
  }

  public void onKeypressed(KeyEvent e){
    System.out.println(e.getKeyChar());
  }
}
