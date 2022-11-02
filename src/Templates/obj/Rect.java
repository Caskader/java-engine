package Templates.obj;

import core.App;
import core.Obj;

public class Rect extends Obj {

  // public int x;
  // public int y;
  // public int width;
  // public int height;

  public Rect(App app) {
    x = 100;
    y = 100;
    width = 100;
    height = 200;
    app.drawObj(this);
  }
}
