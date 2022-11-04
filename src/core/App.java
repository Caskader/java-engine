package core;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import user.Main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App {
  Frame frame;
  Panel panel;

  public App(int WinX, int WinY) {
    panel = new Panel();
    frame = new Frame(panel, WinX, WinY);
    panel.requestFocus();
  }

  public void drawObj(Obj[] a) {
    panel.objs = a;
  }
}

class Frame {

  public Frame(JPanel Jpanel, int x, int y) {
    JFrame Jframe = new JFrame();
    Jframe = new JFrame();
    Jframe.setSize(x, y);
    Jframe.add(Jpanel);
    Jframe.setVisible(true);
    Jframe.setDefaultCloseOperation(3);
  }
}

class Panel extends JPanel {

  public Panel() {
    addKeyListener(new KeyboardInput());
  }

  public Obj[] objs = {};

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Obj obj : objs) {
      if (obj.fill == true) {
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