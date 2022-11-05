package core;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import user.Main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App {
  Frame frame;
  // Panel root = new Panel();
  Panelhandler panelHandler = new Panelhandler();
  public App(int WinX, int WinY ) {
    frame = new Frame( WinX, WinY);
  }

  public String newPanel(String name){
    Panel panel = new Panel();
    panel.name = name;
    frame.addPanel(panel);
    return panel.name;
  }

  public void drawObj(Obj[] a , Panel panl) {
    panl.objs = a;
  }

  public Panel getPanel(String name){
    Panel pane = panelHandler.getPanel(name);
    return pane;
  }
}

class Panelhandler{
    private Panel[] panels = {};
    int i = 0;
    public void addPanel(Panel a){
      panels[i] = a;
      i++;
    }

    public Panel getPanel(String name){
      Panel it = new Panel();
      for (Panel panel : panels) {
          if (panel.name == name){
            it = panel;
          }
      }
      return it;
    }

}

class Frame {
  JFrame Jframe = new JFrame();
  public Frame(int x, int y) {
    Jframe = new JFrame();
    Jframe.setSize(x, y);
    Jframe.setVisible(true);
    Jframe.setDefaultCloseOperation(3);
  }

  public void addPanel(Panel panel){
    Jframe.add(panel);
  }
}

class Panel extends JPanel {

  public Panel() {
    addKeyListener(new KeyboardInput());
  }

  public Obj[] objs = {};
  public String name;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Obj obj : objs) {
      if (obj.fill == true) {
        g.setColor(obj.color);
        g.fillRect(obj.x, obj.y, obj.width, obj.height);
      } else {
        g.drawRect(obj.x, obj.y, obj.width, obj.height);
      }
    }
  }
}

class KeyboardInput implements KeyListener {
  public String[] keypressed = {};
  Main main = new Main();
  @Override
  public void keyPressed(KeyEvent e) {
    // main.onKeypressed(e);
    main.onKeypressed(e);
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

  }

}