package core;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Templates.obj.Rect;

public class App {

  Frame frame;
  Panel panel;

  public App(int WinX, int WinY) {
    panel = new Panel();
    frame = new Frame(panel, WinX, WinY);
  }

  public void drawObj(Obj a) {
    panel.x = a.x;
    panel.y = a.y;
    panel.width = a.width;
    panel.height = a.height;
    panel.repaint();
    System.out.println(a.y);
  }
}

class Frame {

  public Frame(JPanel Jpanel, int x, int y) {
    JFrame Jframe = new JFrame();
    Jframe = new JFrame();
    Jframe.setSize(x, y);
    Jframe.add(Jpanel);
    Jframe.setVisible(true);
    Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
  }
}

class Panel extends JPanel {

  public Panel() {
  }

  public int x = 0, y = 0, width = 0, height = 0;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.fillRect(x, y, width, height);
  }
}
