package Templates.obj;

import core.App;
import core.Obj;
import java.awt.Color;

public class Rect extends Obj {

  public Rect(App app) {
    x = 100;
    y = 100;
    width = 100;
    height = 200;
    fill = true;
    color = new Color(250,0,250);
    type = "rect";
  }
}
